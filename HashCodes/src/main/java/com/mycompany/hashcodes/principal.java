/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashcodes;

import static com.mycompany.hashcodes.Pantalla.vacunados;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class principal {
    
    static Map<String, Personas> vacunados = new HashMap<>();
    static Personas selecPersona;
    static Scanner ingreso = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException{
        
        Personas persona1 = new Personas("2453285791901",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"19/01/2022\"}]"
                ,"[{\"vacuna\":\"covid dosis 2\",\"fecha\":\"19/02/2022\"}]");
       
        vacunados.put(persona1.getCui(), persona1);
        
        Personas persona2 = new Personas("2453285791902",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"19/01/2022\"}]", null);
        
        vacunados.put(persona2.getCui(), persona2);
        
        Personas persona3 = new Personas("2453285791903",
                "[[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"01/01/2022\"}]",
                "[{\"vacuna\":\"covid dosis 2\",\"fecha\":\"01/02/2022\"}]");
        
        
        vacunados.put(persona3.getCui(), persona3);
        
        Personas persona4 = new Personas("2453285791904",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"01/01/2022\"}]",
                "[{\"vacuna\":\"covid dosis 2\",\"fecha\":\"01/02/2022\"}]");
        
        vacunados.put(persona4.getCui(), persona4);
        
        Personas persona5 = new Personas("2453285791905",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"19/01/2022\"}]"
                ,"[{\"vacuna\":\"covid dosis 2\",\"fecha\":\"19/02/2022\"}]");
        
        vacunados.put(persona5.getCui(), persona5);
        
        Personas persona6 = new Personas("2453285791906",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"19/01/2022\"}]", null);
        
        vacunados.put(persona6.getCui(), persona6);
        
        Personas persona7 = new Personas("2453285791907",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"01/01/2022\"}],",
                "[{\"vacuna\":\"covid dosis 2\",\"fecha\":\"01/02/2022\"}]");
        
        vacunados.put(persona7.getCui(), persona7);
        
        Personas persona8 = new Personas("2453285791908",
                "[{\"vacuna\":\"covid dosis 1\",\"fecha\":\"01/01/2022\"}],",
                "[{\"vacuna\":\"covid dosis 2\",\"fecha\":\"01/02/2022\"}]");
        
        vacunados.put(persona8.getCui(), persona8);
        
        imprimir();
//        selecPersona = new Personas(null, null, null);
//        
//        System.out.println("Ingrese el CUI de la persona");
//        
//        String cuiIngresado = ingreso.nextLine();
//        
//        selecPersona.setCui(cuiIngresado);
//        
//        for (var entry : vacunados.entrySet()) {
//            Personas persona = entry.getValue();
//            
//            if (selecPersona.equals(persona)){
//                System.out.println(persona.getCui() + ":" + persona.getInfo());  
//            }
//            
//            
//        }
    }
    
    public static void imprimir() throws IOException{
        
    BufferedWriter writer = new BufferedWriter(new FileWriter("E:/Tareas Quinto Semestre/Programacion III/fichero.txt"));
    
    for (var entry : vacunados.entrySet()) {
        Personas persona = entry.getValue();
            
        writer.write(persona.getCui()+":"+persona.getInfo()+","+persona.getInfoV2()+"\n");
            
    }
    
    writer.close();
        
    }
}
