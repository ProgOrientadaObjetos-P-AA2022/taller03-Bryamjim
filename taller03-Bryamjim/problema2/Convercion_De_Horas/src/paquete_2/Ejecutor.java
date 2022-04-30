/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;

import Paquete_1.Convercion_De_Horas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear un objeto de tipo convercion de horas
        
        Scanner leer = new Scanner(System.in);
        Convercion_De_Horas clok = new Convercion_De_Horas();
        
        //Valores
        double horas;
        double minutos = 60;
        double segundos = 3600;
        double dias = 24;
        
        System.out.println("---DATOR PARA LA CONVERCION---");
        //Imprencion en pantalla
        System.out.println("Ingrese el numero de horas a convertir");
        horas = leer.nextDouble();
        
        clok.establecerhoras(horas);
        clok.establecerminutos(minutos);
        clok.establecersegundos(segundos);
        clok.establecerdias(dias);
        
        System.out.printf("\n---convercion de las Horas---\nHoras a convertir: %.2f\n"
                + "Horas en minutos: %.2f\nHoras en Segundos: %.2f\n"
                + "Horas en días: %.2f\n",clok.obtenerhoras(),clok.obtenerminutos(),
                clok.obtenersegundos(),clok.obtenerdias());
    }
    
}
