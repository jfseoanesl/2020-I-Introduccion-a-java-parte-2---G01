/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class EjemploEstructuraDeControl {
    
    public static void main(String arg[]){
        
        Scanner entrada = new Scanner(System.in);
        int opc=0;
        do{
            imprimirMenu();
            System.out.print("Seleccione: ");
            opc= entrada.nextInt();
            
            switch(opc){
                case 1: System.out.print("Edad: ");
                        int edad = entrada.nextInt();
                        mayoriaDeEdad(edad);
                        break;
                case 2: System.out.print("No del dia: ");
                        int dia=entrada.nextInt();
                        diaSemana(dia);
                        break;
                case 3: System.out.print("N: ");
                        int n=entrada.nextInt();
                        sumaParesImpares(n);
                        break;
                case 4: int a[] = {1,4,6,2,8,9};
                        System.out.println("Suma a: " + sumaVector(a));
                        System.out.print("N:");
                        int t=entrada.nextInt();
                        int b[] = creaVector(t);
                        System.out.println("Suma b: " + sumaVector(b));
                        break;
                case 0: System.out.println("Ha finalizado la aplicacion exitosamente");     
                        break;
                default: System.out.println("La opcion no es valida, intente otra vez");     
            }
            
        }while(opc!=0);
        
        
        
        
        
        
        
        
    }
    
    public static int[] creaVector(int n){
        Scanner entrada = new Scanner(System.in);
        int v[] = new int[n];
        for(int i=0; i<v.length;i++){
            System.out.printf("Registre V[%d]: ", i);
            v[i]= entrada.nextInt();
        }
        return v;
    }
    
    public static int sumaVector(int v[]){
        int suma=0;
        for(int i=0; i<v.length;i++){
            suma+=v[i];
        }
        return suma;
    }
    
    public static void imprimirMenu(){
        System.out.println("MENU PRINCIPAL \n 1. Mayoria de edad\n 2. Dia de la semana\n"
                           + " 3.Suma Pares e Impares\n 4. Suma Vector\n 0. Salir");
    }
    
    public static void mayoriaDeEdad(int edad){
        if(edad<18)
            System.out.println("Menor de edad");
        else
            System.out.println("Mayor de edad");
    }
    
    public static void diaSemana(int dia){
        switch(dia){
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;
            default: System.out.println("Dia no determinado");
        }
    }
    
    public static void sumaParesImpares(int n){
        int i=0; // numeros de pares sumados
        int j=0; // numeros de impares sumados
        int sumaP=0;
        int sumaI=0;
        int num=0;
        while(i<n || j<n){
            if(num%2==0){
                i++;
                sumaP+=num;
            }
            else{
                j++;
                sumaI+=num;
            }
            num++;
        }
        System.out.printf("Suma de primeros %d pares: %d\n", n, sumaP);
        System.out.printf("Suma de primeros %d impares: %d\n", n, sumaI);
    }
}
