package org.hmoldovan.genericsclass;

public class Automovil {

    private String marca;

    public Automovil(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    /*public void setMarca(String marca) {
        this.marca = marca;
    }no necesario ya que se pasa con el constructor
    */
}
