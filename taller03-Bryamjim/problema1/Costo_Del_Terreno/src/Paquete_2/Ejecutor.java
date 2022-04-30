/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_2;

import Paquete_1.Terreno;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo terreno  
        Scanner leer = new Scanner(System.in);
        Terreno tr = new Terreno();
        
        //Valores 
        double ancho;
        double largo;
        double area = 0;
        double valormetrocuadrado = 1272;
        double costo_terreno;
        
        System.out.println("----DATOS PARA DETERMINAR EL COSTO DEL TERRENO----");
        
        //Impresion por pantalla
        System.out.println("Ingresar el ancho del terreno");
        ancho = leer.nextDouble();
        
        System.out.println("Ingresar el largo del terreno");
        largo = leer.nextDouble();
        /*
        System.out.println("Ingresar el valor por metro cuadrado");
        valormetrocuadrado = leer.nextDouble();
         */
        
        tr.establecerancho( ancho );
        tr.establecerlargo( largo );
        tr.establecervalormetrocuadrado(valormetrocuadrado);
        tr.establecerarea(ancho * largo );
        tr.establecercosto_terreno(valormetrocuadrado * area);

        tr.obtenercosto_terreno();
        
        System.out.printf("\n---Costo de terreno---\nAncho del terreno: %.2f\n"
                + "Largo del terreno: %.2f\nArea del terreno: %.2f\nValor por metro cuadrado: %.2f\n"
                + "costo del terreno: %.2f\n", tr.obtenerancho(),
                tr.obtenerlargo(),tr.obtenerarea(),tr.obtenervalormetrocuadrado(),tr.obtenercosto_terreno()
                );
        
        
        
        
    
   
                
    }
  
}
