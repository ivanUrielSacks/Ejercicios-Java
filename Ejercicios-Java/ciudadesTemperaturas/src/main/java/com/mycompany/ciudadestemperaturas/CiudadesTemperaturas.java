

package com.mycompany.ciudadestemperaturas;

import java.util.Scanner;

public class CiudadesTemperaturas 
{

    public static void main(String[] args)
    {   /*
        En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la provincia de Misiones.
        En el primer vector se guardan los nombres de las ciudades, 
        en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última semana. 
        Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas;
        además, deberá poder informar por pantalla cual fue la ciudad 
        con la temperatura más baja y cual con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).*/
        
        String nombresCiudades [] = new String [5];
        double temperaturasMin [] = new double [5];
        double temperaturasMax [] = new double [5];
        
        double tempMin=0;
        double tempMax=0;
        Boolean ifMax=true;
        Boolean ifMin=true;
        Boolean flagMax=true;
        Boolean flagMin=true;
        
                
        Scanner input = new Scanner (System.in);
        
        for(int cont=0; cont < nombresCiudades.length; cont++)
        {
            System.out.println(" Dime el nombre de la ciudad " + (cont + 1));
            nombresCiudades[cont] = input.next();
            
            System.out.println(" Dime el la temperatura minima de la ciudad " + nombresCiudades[cont]);
            temperaturasMin[cont] = input.nextDouble();

            System.out.println(" Dime el la temperatura maxima de la ciudad " + nombresCiudades[cont]);
            temperaturasMax[cont] = input.nextDouble();
                        
            if(tempMin > temperaturasMin[cont] || ifMin == true)
            {
                ifMin = false;
                tempMin = temperaturasMin[cont];
            }
            if(tempMax < temperaturasMax[cont] || ifMax == true)
            {
                ifMax = false;
                tempMax = temperaturasMax[cont];
            }
        }

        for(int i=0; i < temperaturasMax.length; i++)
        {
            if(tempMin == temperaturasMin[i] && flagMin == true)
            {
                flagMin = false;
                System.out.println("La ciudad " + nombresCiudades[i] + " tiene la temperatura mas baja entre todas las ciudades con: "
                        + temperaturasMin[i] + " grados");
            }
            if(tempMax == temperaturasMax[i] && flagMax == true)
            {
                flagMax = false;
                System.out.println("La ciudad " + nombresCiudades[i] + " tiene la temperatura mas alta entre todas las ciudades con: "
                        + temperaturasMax[i] + " grados");
            }
        }
    }
}
