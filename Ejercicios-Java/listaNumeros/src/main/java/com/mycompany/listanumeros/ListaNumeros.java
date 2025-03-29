

package com.mycompany.listanumeros;
import java.util.Scanner;


public class ListaNumeros 
{

    public static void main(String[] args)
    {
        //Tenemos un limite(Ingresado por el usuario) hasta el que tenemos que contar
        //Arranca en uno
        int numero;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese hasta que numero quieres que el sistema cuente");
        numero = input.nextInt();
        
        for(int cont=1; cont <= numero; cont ++)
        {
            System.out.println(cont);
        }
    }
}
