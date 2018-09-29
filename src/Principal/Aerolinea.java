/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Aerolinea {
    private String nombre;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Aeropuerto> aeropuestosUsados;

    public Aerolinea(String nombre) {
        this.nombre = nombre;
        this.aeropuestosUsados = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<Aeropuerto> getAeropuestosUsados() {
        return aeropuestosUsados;
    }
   
     public boolean agregarVueloTodo(int nVuelo, String nLlegada, String uLlegada, int cLlegada, String nSalida, String uSalida, int cSalida){
         aeropuestosUsados.add(0,new Aeropuerto(nLlegada,uLlegada,cLlegada));
         aeropuestosUsados.add(1,new Aeropuerto(nSalida,uSalida,cSalida));
         return vuelos.add(new Vuelo(nVuelo,aeropuestosUsados.get(0),aeropuestosUsados.get(1)));
    }
     
    public Aeropuerto numerodeVuelos(){
        ArrayList<String> aeropuertosSalida = new ArrayList<>();
        for (int i = 0; i < aeropuestosUsados.size(); i++) {
            aeropuertosSalida.add(aeropuestosUsados.get(i).getNombre());
        }
        
        String nombre =null;//aeropuestosUsados.get(0).getNombre();
        int conteo = 0;
        for (int i = 0; i < aeropuertosSalida.size(); i++) {
            String compara = aeropuertosSalida.get(i);
            int contador = 0;
            for (int j = 0; j < aeropuertosSalida.size(); j++) {
                if(compara == aeropuertosSalida.get(j)){
                    contador++;
                }
            }
            if(contador > conteo){
                conteo = contador;
                nombre = aeropuertosSalida.get(i);
            }
        }
        
        Aeropuerto aeropuertoMas = new Aeropuerto();
        for (int i = 0; i <aeropuestosUsados.size(); i++) {
            if(nombre.equals(aeropuestosUsados.get(i).getNombre())){
                aeropuertoMas = aeropuestosUsados.get(i);
            }
        }
        
        return aeropuertoMas;    
    }
    
}    

