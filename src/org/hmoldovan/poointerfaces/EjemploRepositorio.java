package org.hmoldovan.poointerfaces;

import org.hmoldovan.poointerfaces.modelo.Cliente;
import org.hmoldovan.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo=new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Bea","Gonzales"));
        repo.crear(new Cliente("Luci","Martinez"));
        repo.crear(new Cliente("Andrés","Guzman"));

        List<Cliente> clientes= repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("==============paginable==============");
        List<Cliente> paginable=((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("==============ordenar==============");
        List<Cliente> clientesordenAsc=((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        for(Cliente c: clientesordenAsc){
            System.out.println(c);
        }
    }
}
