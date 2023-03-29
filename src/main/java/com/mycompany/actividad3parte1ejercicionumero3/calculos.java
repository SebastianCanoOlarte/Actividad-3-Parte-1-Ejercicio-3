/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte1ejercicionumero3;


public class calculos {
    public static String Maximo( double a, double b){
        String x;
        if (a==b){
            x = "a es igual que b";
             
        }
        else if (a>b){
            x = "a es mayor que b";
        }
        else{
            x = "b es mayor que a";
        }
        return x;
    } 
}
