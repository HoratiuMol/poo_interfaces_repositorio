package org.hmoldovan.generics;

import org.hmoldovan.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("Adnres","Guzman"));

        //System.out.println("clientes = " + clientes);
        Cliente andres = clientes.iterator().next();
        Cliente[] clientesArreglo = {
                new Cliente("luci","guzman"),
                new Cliente("Andre","Guzman")};

        Integer[] enterosArreglo={1,2,3};

        List<Cliente> clientesLista=fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombre= fromArrayToList(new String[]{"Andres","pepe",
        "luci","Bea","John"},enterosArreglo);
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }

    public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
