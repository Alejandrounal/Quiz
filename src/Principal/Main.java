/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
       Aerolinea aerolinea1 = new Aerolinea("Avianca");
       Scanner leer = new Scanner(System.in);
      
        int entrada = 0;
        while(entrada!= 15){
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer:\n1.Saber lista de vuelos\n2.Aeropuertos con mas vuelos iniciados\n3. Agregar vuelo junto con sus aeropuertos\n4.Salir del programa "));
        switch(entrada){
            case 1:
                for (int i = 0; i < aerolinea1.getVuelos().size(); i++) {
                    JOptionPane.showMessageDialog(null, aerolinea1.getVuelos().get(i).darInformacion());
                }
                break;
            case 2: 
                System.out.println("El aeropuerto con mas vuelos salientes es :   " + aerolinea1.numerodeVuelos().toString());
                break;         
            case 3:
                int nVuelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del vuelo:    "));
                String nLlegada = JOptionPane.showInputDialog("Ingrese el nombre del aeropuerto de llegada:    ");
                String uLlegada = JOptionPane.showInputDialog("Ingrese la ubicacion del aeropuerto de llegada:    ");
                int cLlegada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pistas del aeropuerto de llegada:    "));
                String nSalida = JOptionPane.showInputDialog("Ingrese el nombre del aeropuerto de salida:    ");
                String uSalida = JOptionPane.showInputDialog("Ingrese la ubicacion  del aeropuerto de salida:    ");
                int cSalida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pistas del aeropuerto de salida:    "));
                aerolinea1.agregarVueloTodo(nVuelo, nLlegada, uLlegada, cLlegada, nSalida, uSalida, cSalida);  
                break;
            case 4: 
                System.exit(0);
                break;
                }
                
        }
    }
}
