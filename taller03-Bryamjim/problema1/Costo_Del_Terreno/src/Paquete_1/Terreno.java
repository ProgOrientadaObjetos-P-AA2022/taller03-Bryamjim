/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_1;

/**
 *
 * @author UTPL
 */
public class Terreno {
    private double ancho;
    private double largo;
    private double area;
    private double valormetrocuadrado;
    private double costo_terreno;
    
    public void establecerancho(double t) {
        ancho = t;
    }
    
    public void establecerlargo(double t) {
        largo = t;
    }
    
    public void establecerarea(double t){
        area = ancho * largo;
    }
    
    public void establecervalormetrocuadrado(double t){
        valormetrocuadrado = 1272;
    }
    
    public void establecercosto_terreno(double t){
        costo_terreno = valormetrocuadrado * area;
    }
    
    
    public double obtenerancho(){
        return ancho;
    }
     
    public double obtenerlargo(){
        return largo;
    }
     
    public double obtenerarea(){
        return area;
    }
    
    public double obtenervalormetrocuadrado(){
        return valormetrocuadrado;
    }
    
    public double obtenercosto_terreno(){
        return costo_terreno;
    }
    
    
}
