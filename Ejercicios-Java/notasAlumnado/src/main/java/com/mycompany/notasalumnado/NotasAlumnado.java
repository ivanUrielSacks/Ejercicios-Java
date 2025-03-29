

package com.mycompany.notasalumnado;

import java.util.Scanner;


public class NotasAlumnado 
{

    public static void main(String[] args)
    {
      
        /*En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. 
        Cada fila corresponde a las notas y al promedio de cada alumno. 
        Se necesite un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, 
        las notas del alumno y que en la última columna se calculen los promedios. Una vez realizados los cálculos,
        se desea mostrar las 3 notas de cada alumno y el promedio
        correspondiente recorriendo la matriz*/
        
        double matriz [][] = new double [4][4];
        double promedio=0;

        
        Scanner input = new Scanner(System.in);
        
        for(int x=0; x < matriz.length; x++)
        {
            for(int y=0; y < (matriz[x].length -1); y++)
            {
                System.out.println(" Ingrese la nota " + (y + 1) + " Del alumno " + (x + 1));
                matriz[x][y] = input.nextDouble();
                promedio += matriz[x][y];

            }
            matriz[x][matriz[x].length -1] = (promedio / (matriz[x].length));
            promedio = 0;
 
        }

        for(int p=0; p < matriz.length; p++)
        {
            System.out.println(" Notas del alumno: "  + (p+ 1));
            for(int r=0; r < matriz[p].length; r++)
            {                
                if (r == (matriz[r].length -1))
                { 
                    System.out.println(" Promedio: " + matriz[p][r]);
                }
                else
                {
                    System.out.print(matriz[p][r] + " ");
                }
            }

        }
    }
}
