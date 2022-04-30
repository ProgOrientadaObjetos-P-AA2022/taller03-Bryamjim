/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_2;

import Paquete_1.EQUIPO_CELULAR;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo educativo
        Scanner leer = new Scanner(System.in);
        EQUIPO_CELULAR cell = new EQUIPO_CELULAR();
        
        //Valores
        String informacion_IMEI;
        String sistema_operativo;
        String direccion_mac;
        String tamaño_de_pantalla;
        double costo_inicial;
        double iva;
        double iva_costo_inicial;
        double costo_final;
        
        System.out.println("--DATOS DEL DISPOSITIVO ELECTRONICO--");
        
        System.out.println("Ingrese la información IMEI del dispositivo");
        informacion_IMEI = leer.nextLine();
        
        System.out.println("Ingresar la información del sistema operativo del dispositivo");
        sistema_operativo = leer.nextLine();
        
        System.out.println("Ingresar la direccion mac del dispositivo");
        direccion_mac = leer.nextLine();
        
        System.out.println("Ingresar el tamaño de pantalla del dispositivo");
        tamaño_de_pantalla = leer.nextLine();
        
        System.out.println("Ingrese el costo inicial del dispositivo");
        costo_inicial = leer.nextDouble();
        
        System.out.println("Ingresar el iva a calcular");
        iva = leer.nextDouble();
        
        cell.establecerinformacion_IMEI(informacion_IMEI);
        cell.establecersistema_operativo(sistema_operativo);
        cell.establecerdireccion_mac(direccion_mac);
        cell.establecertamaño_de_pantalla(tamaño_de_pantalla);
        cell.establecercosto_inicial(costo_inicial);
        cell.estableceriva(iva * costo_inicial);
        cell.estableceriva_costo_inicial(iva);
        cell.establecercosto_final(iva + costo_inicial);
        
        cell.obtenercosto_final();
        
        System.out.printf("\n---COSTO TOTAL DEL DISPOSITIVO---\n"
                + "Informacion IMEI: %s\nSistema operativo: %s\n"
                + "Direccion mac: %s\nTamaño de la pantalla: %s\n"
                + "Costo inicial: %.2f\nIva: %.2f\nIva del "
                + "costo inicial: %.2f\nCosto final: %.2f",
                cell.obtenerinformacion_IMEI(),cell.obtenersistema_operativo(),
                cell.obtenerdireccion_mac(), cell.obtenertamaño_de_pantalla(),
                cell.obtenercosto_inicial(),iva, cell.obteneriva_costo_inicial(),
                cell.obtenercosto_final());
        
    }
    
}
