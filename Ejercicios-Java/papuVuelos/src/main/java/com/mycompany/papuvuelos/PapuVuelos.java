
package com.mycompany.papuvuelos;

import java.util.Scanner;

class PapuVuelos {

    public static void main(String[] args) 
    {

        /*Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, 
        uno por la mañana, otro al mediodía y otro por la noche. 
        Para administrar estos datos, utiliza una matriz, 
        donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles. 

        Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.
        Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al que quiere dirigirse, 
        el número de vuelo (dependiendo si quiere viajar a la mañana, al mediodia o a la noche) y la cantidad de pasajes que necesita.
        A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficiente de asientos 
        para la cantidad de pasajes que se requiere. En caso de qu así sea, 
        se debe mostrar un cartel por pantalla que diga "su reserva fue realizader con éxito" y 
        se debe descontar del total de asientos los solicitados por el usuario. 
        En caso de no haber más asientos disponibles, 
        se debe informar otro cartel que diga "disculpe, no se pudo completar su operación dado que no hay asientos disponibles".
        la de la compañía de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se hacen por día. 
        Por lo cual, para finalizar las ventas se ingresa la palabra "finish".*/
        
        
        int vuelos [][] = new int [6][3];
        boolean corriendo=true;
        String seguir;
        int destino;
        int horario;
        int pasajes;
        
        Scanner input= new Scanner(System.in);
        
        
        vuelos[0][0] = 120;
        vuelos[0][1] = 15;
        vuelos[0][2] = 30;
        vuelos[1][0] = 65;
        vuelos[1][1] = 1;
        vuelos[1][2] = 2;   
        vuelos[2][0] = 4;
        vuelos[2][1] = 52;
        vuelos[2][2] = 7;        
        vuelos[3][0] = 46;
        vuelos[3][1] = 32;
        vuelos[3][2] = 16;     
        vuelos[4][0] = 64;
        vuelos[4][1] = 23;
        vuelos[4][2] = 11;
        vuelos[5][0] = 61;
        vuelos[5][1] = 12;
        vuelos[5][2] = 91;
        
        while(corriendo)
        {
            System.out.println("Elige un destino: "
                    + "0: Rio de Janeiro. 1: Cancun. 2: Madrid "
                    + "3: Roma. 4:Milan. 5: Iguazu");
            
            destino = input.nextInt();
            
            System.out.println("Ingrese el horario del vuelo: "
                    + "0: Mañana. 1: Tarde. 2: Noche");
            
            horario = input.nextInt();
            
            System.out.println("Ingrese la cantidad de pasajes: ");
            
            pasajes = input.nextInt();
            
            if(destino >= 0 && destino <= 5)
            {
                if(horario >= 0 && horario <= 3)
                {
                    if(vuelos[destino][horario] - pasajes >= 0)
                    {
                        vuelos[destino][horario] -= pasajes;
                        System.out.println("Su reserva fue realizada con exito");
                    }
                    else
                    {
                        System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
                    }
                }
                else
                {
                    System.out.println("El horario que ingreso no exsiste");
                }
            }
            else
            {
                System.out.println("El destino que ingreso no existe");
            }
            System.out.println("Desea realizar otro ingreso?. Escribe finish para terminar");
            seguir = input.next();
            if (seguir.equalsIgnoreCase("finish"))
            {
                corriendo = false;
            }
        
        }
    }
}
