/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete_2;

import paquete_1.Administrar_Instituciones_Educativas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo educativo
        Scanner leer = new Scanner(System.in);
        Administrar_Instituciones_Educativas edu = new Administrar_Instituciones_Educativas();
        
        //valores
        String nombre;
        String tipo_de_institucion;
        int numero_de_alumnos;
        int numero_de_docentes;
        int numero_de_sedes;
        double gastos_por_estudiante;
        double presupuesto = 0;
        
        System.out.println("--DATOS DE LA INSTUTICION EDUCATIVA--");
        
        System.out.println("Ingrese el nombre la Institucion Educativa");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese el tipo de Institucion Educativa");
        tipo_de_institucion = leer.nextLine();
        
        System.out.println("Ingrese el número de alumnos de la Institucion Educativa");
        numero_de_alumnos = leer.nextInt();
        
        System.out.println("Ingrese el número de docentes de la Institucion Educativa");
        numero_de_docentes = leer.nextInt();
        
        System.out.println("Ingrese el número de sedes de la Institucion Educativa");
        numero_de_sedes = leer.nextInt();
        
        System.out.println("Ingrese los gastos proyectados por estudiante");
        gastos_por_estudiante = leer.nextInt();
        
        edu.establecernombre(nombre);
        edu.establecertipo_de_institucion(tipo_de_institucion);
        edu.establecernumero_de_alumnos(numero_de_alumnos);
        edu.establecernumero_de_docentes(numero_de_docentes);
        edu.establecernumero_de_sedes(numero_de_sedes);
        edu.establecergastos_por_estudiante(gastos_por_estudiante );
        edu.establecerpresupuesto(numero_de_alumnos * gastos_por_estudiante);
        
        edu.obtenerpresupuesto();
        
        System.out.printf("\n---PRESUPUESTO---\nNombre la Institucion "
                + "Educativa: %s\nTipo de Institucion Educativa %s\n"
                + "Número de alumnos: %d\nNúmero de docentes: %d\n"
                + "Número de sedes: %d\ngastos proyectados por estudiante: %.2f\n"
                + "Presupuesto %.2f",edu.obtenernombre(),
                edu.obtenertipo_de_institucion(),edu.obtenernumero_de_alumnos(),
                edu.obtenernumero_de_docentes(),edu.obtenernumero_de_sedes(),
                edu.obtenergastos_por_estudiante(),edu.obtenerpresupuesto());
        
    }
    
}
