
package com.mycompany.rellenarmatriz;

import java.util.Scanner;

public class RellenarMatriz 
{

    public static void main(String[] args) 
    {
        /*Crear un programa que permita cargar completamente con numeros 5 una matriz 4x5*/
        
        int matriz[][] = new int [4][5];
        
        Scanner input= new Scanner(System.in);
        
        for(int i=0; i< matriz.length; i++)
        {
            for(int x=0; x<matriz[i].length;x++)
            {
                System.out.println(" Ingresa un numero para " + " fila: " + (i + 1) + " Columna: " + (x + 1));
                matriz[i][x] = input.nextInt();
            }
        }
        for(int i=0; i< matriz.length; i++)
        {
            for(int x=0; x<matriz[i].length;x++)
            {
                System.out.println("Fila: " + (i+1) + " Columna: " + (x + 1) + " Valor: " + matriz[i][x]);    
            }
        }
    }
}
