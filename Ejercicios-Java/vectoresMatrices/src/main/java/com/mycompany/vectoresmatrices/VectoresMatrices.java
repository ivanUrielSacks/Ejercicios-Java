

package com.mycompany.vectoresmatrices;

import java.util.Scanner;

public class VectoresMatrices 
{

    public static void main(String[] args)
    {
        int matriz [][] = new int[3][3];
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<matriz.length; i++)
        {
            for(int x = 0; x < matriz[i].length; x++)
            {
                System.out.println(" Fila " + i + " Columna " + x);
                matriz[i][x] = input.nextInt();
            }
        }
        
        for(int i=0; i<matriz.length; i++)
        {
            for(int x = 0; x < matriz[i].length; x++)
            {
                System.out.println(" Fila " + i + " Columna " + x + " Valor: " + matriz[i][x]);
            }
        }
    }
}
