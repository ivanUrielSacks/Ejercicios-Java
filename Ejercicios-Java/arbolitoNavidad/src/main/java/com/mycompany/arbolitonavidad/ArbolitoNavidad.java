
package com.mycompany.arbolitonavidad;

public class ArbolitoNavidad 
{

    public static void main(String[] args) 
    {
        int arbolito[][] = new int [4][7];
        for(int fila = 0; fila < arbolito.length; fila++)
        {
            for(int columna = 0; columna < arbolito[fila].length; columna++)
            {
                arbolito[fila][columna] = 0;
                arbolito[fila][3] = 1;
                if(fila >= 1)
                {
                    arbolito[fila][2] = 1;
                    arbolito[fila][4] = 1;                   
                }
                if(fila >= 2)
                {
                    arbolito[fila][5] = 1;
                    arbolito[fila][1] = 1;
                }               
                if(fila >= 3)
                {
                    arbolito[fila][0] = 1;
                    arbolito[fila][6] = 1; 
                }


            }
        }
        for(int fila = 0; fila < arbolito.length; fila++)
        {
            for(int columna = 0; columna < arbolito[fila].length; columna++)
            {
                if(arbolito[fila][columna] == 0)
                {
                    System.out.print(" ");
                }
                else
                {
                   System.out.print("*"); 
                }
            }
            System.out.print(" \n");
        }

    }
}
