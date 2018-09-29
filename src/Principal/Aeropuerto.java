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
public class Aeropuerto {
    private String nombre;
    private String ubicacion;
    private int conteoPista;

    public Aeropuerto(String nombre, String ubicacion, int conteoPista) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.conteoPista = conteoPista;
    }

    public Aeropuerto() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getConteoPista() {
        return conteoPista;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", conteoPista=" + conteoPista + '}';
    }
    
    
}
