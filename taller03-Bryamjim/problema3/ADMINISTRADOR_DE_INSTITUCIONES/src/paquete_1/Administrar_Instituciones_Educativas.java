/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_1;

/**
 *
 * @author Usuario
 */
public class Administrar_Instituciones_Educativas {
    private String nombre;
    private String tipo_de_institucion;
    private int numero_de_alumnos;
    private int numero_de_docentes;
    private int numero_de_sedes;
    private double gastos_por_estudiante;
    private double presupuesto;
    
    public void establecernombre(String ed) {
        nombre = ed;
    }
    
    public void establecertipo_de_institucion(String ed) {
       tipo_de_institucion = ed;
    }
    
    public void establecernumero_de_alumnos(int ed) {
        numero_de_alumnos = ed;
    }
    
    public void establecernumero_de_docentes(int ed) {
        numero_de_docentes = ed;
    }
    
    public void establecernumero_de_sedes(int ed) {
        numero_de_sedes = ed;
    }
    
    public void establecergastos_por_estudiante(double ed) {
        gastos_por_estudiante = ed;
    }
    
    public void establecerpresupuesto(double ed) {
        presupuesto = gastos_por_estudiante * numero_de_alumnos;
    }
    
    public String obtenernombre(){
        return nombre;
    }
     
    public String obtenertipo_de_institucion(){
        return tipo_de_institucion;
    }
     
    public int obtenernumero_de_alumnos(){
        return numero_de_alumnos;
    }
    
    public int obtenernumero_de_docentes(){
        return numero_de_docentes;
    }
    
    public int obtenernumero_de_sedes(){
        return numero_de_sedes;
    }
    
    public double obtenergastos_por_estudiante(){
        return gastos_por_estudiante;
    }
    
    public double obtenerpresupuesto(){
        return presupuesto;
    }
    
    
}