
package com.mycompany.carreradelinmigrante;
import java.util.Scanner;


public class CarreraDelInmigrante 
{

    public static void main(String[] args)
    {
        
        /*Menores A (de 6 a 10 años) 
        Menores B (de 11 a 17 años) 
        Juveniles (de 18 a 30 años) 
        Adultos (de 31 a 50 años)
        Adultos mayores (mayores de 50 años)
        Se necesita un programa que, a partir del ingreso de los datos
        y edad de cada participante, se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, 
        al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0, y que su nombre sea "fin".*/
        
        Scanner inputDni = new Scanner(System.in);
        Scanner inputEdad = new Scanner(System.in);
        Scanner inputNombre = new Scanner(System.in);
        String categoria = "ninguna";
        int dni;
        int edad;
        String nombre;
        
            do
            {   categoria = "ninguna";
            
                System.out.print("Ingrese su dni ");
                dni = inputDni.nextInt();  

                System.out.print("Ingrese su edad ");
                edad = inputEdad.nextInt();
                
                System.out.print("Ingrese su nombre ");
                nombre = inputNombre.next();  
                
                if(edad >= 6 && edad <= 10)
                {
                    categoria = "Menores A ";
                }
                else if(edad >= 11 && edad <= 17)
                {
                    categoria = "Menores B ";
                }
                else if(edad >= 18 && edad <= 30)
                {
                    categoria = "Juveniles ";
                }
                else if(edad >= 31 && edad <= 50)
                {
                    categoria = "Adultos ";
                }
                else if(edad >= 50)
                {
                    categoria = "Adultos mayores ";
                }
                else
                {
                    System.out.println("La edad que pusiste no es valida en ninguna de las categorias");
                }

                if(!categoria.equals("ninguna"))
                {
                    System.out.println("Categoria: " + categoria + "/ Nombre: " +  nombre + " / Edad: " + edad + " / Dni: " + dni);
                }
            } 
            while(dni != 0 && !nombre.equalsIgnoreCase("fin"));
        
                
                
        System.out.println("El dia ha finalizado");
        
        
    }
}
