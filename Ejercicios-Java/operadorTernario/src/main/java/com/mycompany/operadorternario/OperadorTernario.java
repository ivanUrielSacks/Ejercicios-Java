
package com.mycompany.operadorternario;
import java.util.Scanner;
public class OperadorTernario 
{

    public static void main(String[] args) 
    {
        Double nota;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su nota ");
        nota = input.nextDouble();
        
        String notaFinal = (nota >= 7) ? "Aprobado" : "Desaprobado";
        
        System.out.println("Usted esta " + notaFinal);
            
        
        
        
    }
}
