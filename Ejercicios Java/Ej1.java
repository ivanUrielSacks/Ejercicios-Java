

public class Ej1 
{


    public static void main(String args[]) 
    {
        /*﻿
        1 Realizar un programa que permita el intercambio de valores entre dos variables.
        2 Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
        3 realizar las acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el cambio mostrar
        5 el resultado por pantalla.
        */
        int numero, numero2, aux;

        numero = 35;
        numero2 = 20;
        
        aux = numero;
        numero = numero2;
        numero2 = aux;
        
        System.out.println("Num 1: " + numero + " Num 2: " + numero2);
    }
}
