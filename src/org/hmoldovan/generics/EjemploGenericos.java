package org.hmoldovan.generics;

import org.hmoldovan.poointerfaces.modelo.Cliente;
import org.hmoldovan.poointerfaces.modelo.ClientePremium;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        List<ClientePremium> clientesPremium = fromArrayToList(
                new ClientePremium[]{
                        new ClientePremium("Paco","Fernandez")
                });

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        //no se va a poder imprimir porque nose puede imrpimir descendencia
        // imprimirClientes(clientesPremium);

        System.out.println("maximo de 1, 9 y 4 es: " + maximo(1,9,4));
        System.out.println("maximo de 3.9,11.6,7.78 es : " + maximo(3.9,11.6,7.78));
        System.out.println("maximo de a,b,c es: " + maximo("a","b","c"));
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }

    public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends  Comparable<T>> T maximo(T a,T b,T c){
        T max =a;
        if(b.compareTo(max) > 0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return  max;
    }
}
