/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1_recursividad;

/**
 *
 * @author LABORATORIO
 */
public class Recursividad {
    //Ejercicio 1 Numero invertido
   public static int N_Invertido(int n, int i){
       if(n>0){
           return N_Invertido(n/10,n%10+i*10);
       }
       else{
           return i;
       }
       
       
   }
   
   //Ejercicio 2 Cadena impresa
   public static void Cadena_Impresa(String cadena, int i){
      if(i==cadena.length()-1){
          System.out.println(cadena.charAt(i));
          
      }
      else{
          System.out.println(cadena.charAt(i));
          Cadena_Impresa(cadena,i+1);
      }
       
   }
   
   //Ejercicio 3 Llenar vector
    public static void VECTOR(int []vector, int index, int[] vectornuevo){
        if(index==vector.length-1){
            vectornuevo[index]=vector[index];
            System.out.println(String.valueOf(vectornuevo[index]));
        }
        else{
            vectornuevo[index]=vector[index];
            System.out.println(String.valueOf(vectornuevo[index]));
            VECTOR(vector,index+1,vectornuevo);
        }
   }
   
   //Ejercicio 4 Suma de numeros
   
   public static void suma(int [] vector, int index, int suma){
       
       if(index==vector.length-1){
           suma+=vector[index];
           System.out.println(String.valueOf(suma));
       }
       else{
           suma+=vector[index];
           suma(vector,index+1,suma);
       }
       
   }
   
   //Ejercicio 5 tablas de multiplicar
   public static String TABLA(int x, int y){
       
       if(x==1){
           return y+" x " + 1 + "="+ y +"\n";
       }
       else{
           int z;
           z=x;
           return TABLA(x-1,y)+y+" x "+ z + "=" + (y*z)+"\n";
       }
    
   }
}
