/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete_1;

/**
 *
 * @author Usuario
 */
public class EQUIPO_CELULAR {
    private String informacion_IMEI;
    private String sistema_operativo;
    private String direccion_mac;
    private String tamaño_de_pantalla;
    private double costo_inicial;
    private double iva;
    private double iva_costo_inicial;
    private double costo_final;
    
    public void establecerinformacion_IMEI(String t) {
        informacion_IMEI = t;
    }
    
    public void establecersistema_operativo(String t) {
       sistema_operativo = t;
    }
    
    public void establecerdireccion_mac(String t) {
        direccion_mac = t;
    }
    
    public void establecertamaño_de_pantalla(String t) {
        tamaño_de_pantalla = t;
    }
    
    public void establecercosto_inicial(double t) {
        costo_inicial = t;
    }
    
    public void estableceriva(double t) {
        iva = t;
    }
    
    public void estableceriva_costo_inicial(double t) {
        iva_costo_inicial = iva;
    }
    
    public void establecercosto_final(double t) {
        costo_final = iva + costo_inicial;
    }
    
    
    public String obtenerinformacion_IMEI(){
        return informacion_IMEI;
    }
     
    public String obtenersistema_operativo(){
        return sistema_operativo;
    }
     
    public String obtenerdireccion_mac(){
        return direccion_mac;
    }
    
    public String obtenertamaño_de_pantalla(){
        return tamaño_de_pantalla;
    }
    
    public double obtenercosto_inicial(){
        return costo_inicial;
    }
    
    public double obteneriva(){
        return iva;
    }
    
    public double obteneriva_costo_inicial(){
        return iva_costo_inicial;
    }
    
    public double obtenercosto_final(){
        return costo_final;
    }
}
