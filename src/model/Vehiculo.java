/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JavganJG
 */
public abstract class Vehiculo extends Exception {
    private String matricula;
    private String marca;
    private boolean alquilado;
    private final static int PRECIO_BASE = 50;

    public static int getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public Vehiculo(String matricula, String marca, boolean alquilado) {
        this.matricula = matricula;
        this.marca = marca;
        this.alquilado = alquilado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    public abstract String info();
    public abstract double  calculaPrecio(int dias);
  
}
