package org.hmoldovan.poointerfaces.repositorio;

import org.hmoldovan.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
