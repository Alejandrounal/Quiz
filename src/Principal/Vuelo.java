/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alejandro
 */
public class Vuelo {
    private int numeroVuelo;
    private Aeropuerto llegada;
    private Aeropuerto salida;

    public Vuelo(int numeroVuelo, Aeropuerto llegada, Aeropuerto salida) {
        this.numeroVuelo = numeroVuelo;
        this.llegada = llegada;
        this.salida = salida;
    }

   public String darInformacion(){
       return("Numero de Vuelo:   "+this.numeroVuelo + "       Aeropuerto de llegada:    " + llegada.getNombre() + "     Aeropuerto de salida:    "+salida.getNombre());
   }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public Aeropuerto getLlegada() {
        return llegada;
    }

    public Aeropuerto getSalida() {
        return salida;
    }
   
   
}
