package org.hmoldovan.genericsclass;

public class Maquinaria {

    private String tipo;

    public Maquinaria(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    /*public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    no necesario ya que se pasa con el constructor
    */
}
