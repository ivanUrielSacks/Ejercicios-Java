package com.mycompany.pruebatecnica60hs;

import java.util.Scanner;

public class PruebaTecnica60hs 
{

    public static void main(String[] args) 
    {
        int matriz[][] = new int[10][10];
        int reservaFila = 0;
        int reservaColumna = 0;

        Scanner input = new Scanner(System.in);
        Boolean corriendo = true;
        Boolean asientosDisponibles = true;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                matriz[i][x] = 0;
            }
        }
        while (corriendo == true) {
            asientosDisponibles = true;

            for (int i = 0; i < matriz.length; i++) {
                System.out.println("");
                for (int x = 0; x < matriz[i].length; x++) {
                    if (matriz[i][x] == 0) {
                        System.out.print("L");
                    } else {
                        System.out.print("X");
                    }
                }
            }
            System.out.println("");

            while (asientosDisponibles == true) {
                System.out.println("Un asiento de que fila desea reservar? ");
                reservaFila = input.nextInt();
                System.out.println("Y un asiento de que columna desea reservar? ");
                reservaColumna = input.nextInt();
                
                if (!(reservaFila > 9 || reservaFila < 0) && !(reservaColumna > 9 || reservaColumna < 0))
                {
                    if (matriz[reservaFila][reservaColumna] == 0)
                    {                        
                        matriz[reservaFila][reservaColumna] = 1;
                        System.out.println("Su asiento ah sido correctamente reservado");
                        asientosDisponibles = false;
                        
                        for (int i = 0; i < matriz.length; i++) 
                        {
                            System.out.println("");
                            for (int x = 0; x < matriz[i].length; x++)
                            {
                                if (matriz[i][x] == 0) 
                                {
                                    System.out.print("L");
                                } 
                                else 
                                {
                                    System.out.print("X");
                                }
                            }
                        }
                        System.out.println("");

                    } 
                    else if (matriz[reservaFila][reservaColumna] == 1)
                    {
                        for (int i = 0; i < matriz.length; i++) 
                        {
                            System.out.println("");
                            for (int x = 0; x < matriz[i].length; x++) 
                            {
                                if (matriz[i][x] == 0) 
                                {
                                    System.out.print("L");
                                } 
                                else 
                                {
                                    System.out.print("X");
                                }
                            }
                        }
                        System.out.println("");

                        System.out.println("Lo lamentamos, ese asiento no esta disponible, desea seleccionar otro? Si/No");
                        String otroAsiento = input.next();
                        if (otroAsiento.equalsIgnoreCase("No")) {
                            asientosDisponibles = false;
                        }
                    }
                } 
                else 
                {
                    System.out.println("Ese asiento no existe. ");
                }

            }
            System.out.println("Deseas finalizar el programa? Si/No");
            String finalizacion = input.next();
            if (finalizacion.equalsIgnoreCase("Si")) {
                corriendo = false;
            }

        }
    }
}
