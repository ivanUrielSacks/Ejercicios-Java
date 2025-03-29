

package com.mycompany.vectornumero3;

import java.util.Scanner;


public class VectorNumero3 
{

    public static void main(String[] args)
    {
        /* Realizar un programa que permita cargar 15 numeros en un vector.
        Una vez cargados, se necesita que el programa cuente e informe cuantas veces se cargo el numero 3.
        */
        
        int vector[] = new int [15];
        int numerosTres=0;
    
        Scanner input = new Scanner(System.in);

        for(int i=0; i < vector.length; i++)
        {
            System.out.println(" Ingrese un valor para el numero: " + (i+1));
            vector[i] = input.nextInt();
        }
         for(int i=0; i < vector.length; i++)
        {
            System.out.println(" EL numero: " + (i+1) + " Vale: " + vector[i]);
            if (vector[i] == 3)
            {
                numerosTres++;
            }
        }
        System.out.println("En total el numero 3 se cargo: " + numerosTres + " Veces");

    }
}
