/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.taller1;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Taller1 {
    public static void main(String arg[]){
       
        Scanner entrada = new Scanner(System.in);
        // ejercio 5
        char c = entrada.next().charAt(0);//lee caracter
        System.out.printf("EL caracter %s equivale al numero %d\n",c, (int)c);
        
        //ejercicio 1
        int x = 200;
        System.out.printf("x=%.2f\n", (double)x);
        
        //ejercicio 8
        System.out.println("MENU PRINCIPAL \n 1. Leer datos \n 2. Procesar Datos \n "
                + "3. Imprimir Resultado \n 4. Salir");
    }
    
}
