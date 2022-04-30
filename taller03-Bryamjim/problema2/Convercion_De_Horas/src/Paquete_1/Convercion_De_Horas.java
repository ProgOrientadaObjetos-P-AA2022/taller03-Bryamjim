/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete_1;

/**
 *
 * @author Usuario
 */
public class Convercion_De_Horas {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerhoras(double h) {
        horas = h;
    }
    
    public void establecerminutos(double h) {
        minutos = horas * 60;
    }
    
    public void establecersegundos(double h){
        segundos = horas * 3600;
    }
    
    public void establecerdias(double h){
        dias = horas / 24;
    }
    
    public double obtenerhoras(){
        return horas;
    }
     
    public double obtenerminutos(){
        return minutos;
    }
     
    public double obtenersegundos(){
        return segundos;
    }
    
    public double obtenerdias(){
        return dias;
    }
}
