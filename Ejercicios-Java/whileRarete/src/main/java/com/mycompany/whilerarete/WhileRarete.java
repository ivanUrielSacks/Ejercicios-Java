
package com.mycompany.whilerarete;
import java.util.Scanner;

public class WhileRarete {

    public static void main(String[] args) 
    {
        /*Realizar un programa que muestre por pantalla un texto ingresado por el usuario
        pero en el momento de ingresar la palarbra salir cerrar el programa*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa algo, si quieres salir, escribelo");

        String texto = input.nextLine();
        
        while(!texto.equalsIgnoreCase("salir"))
        {
            System.out.println(texto);  
            texto = input.nextLine();

        }   
    }
}
