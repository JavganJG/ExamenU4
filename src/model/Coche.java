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
public class Coche extends Vehiculo {
    private int plazas;

    public Coche(int plazas, String matricula, String marca, boolean alquilado) {
        super(matricula, marca, alquilado);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    public String info(){
        return ("Coche: matricula es: "+getMatricula()+", marca es: "+getMarca()+", esta alquilado "+ isAlquilado()+ "plazas son "+ getPlazas());
    }

    @Override
    public double calculaPrecio(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
