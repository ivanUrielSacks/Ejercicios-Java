
public class Ej2Switch
{
    public static void main(String args[]) 
    {
        int dia = 12;
        String nombreDia;
        
        switch(dia)
        {
            case 1: 
                nombreDia = "Lunes";
                break;
            case 2: 
                nombreDia = "Martes";
                break;
            case 3: 
                nombreDia = "Miercoles";
                break;
            case 4: 
                nombreDia = "Jueves";
                break;
            case 5: 
                nombreDia = "Viernes";
                break;    
            default:
                nombreDia = "El dia no existe";
        }
        System.out.println(nombreDia);
        
    }
}
