
package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Ej3Empresa 
{

    public static void main(String args[]) 
    {
            
        /* Una pequeña despensa desea calcular los sueldos de sus empleados. 
        Los puestos de los mismos pueden tener 3 categorías: 
        1- repositor, 2-cajero y 3- supervisor.
        Los repositores cobran $15.890 + un bono del 10%
        Los cajeros cobran $25.630,89 fijos
        Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
        Se necesita un programa que, dependiendo del tipo de empleado
        del que se trate, calcule y muestre en pantalla el
        correspondiente sueldo.*/
        
        int empleado;
        double sueldo;
        
        System.out.print("Dime que categoria eres:  1-repositor, 2-cajero y 3-supervisor ");
        
        Scanner teclado = new Scanner (System.in);
        empleado = teclado.nextInt();
        
        if(empleado == 1)
        {
            sueldo = (15890 * 1.1);
            System.out.println("El empleado cobra: $" + sueldo );
        }
        else if(empleado == 2)
        {
            sueldo = 25630.89;
            System.out.println("El empleado cobra: $" + sueldo );
        }
        else if(empleado == 3)
        {
            sueldo = 35560.20 * 0.89;
            System.out.println("El empleado cobra: $" + sueldo );
        }    
        else
        {
            System.out.println("Ha ocurrido un error");
        }  
    }
}
