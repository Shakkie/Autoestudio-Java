import java.util.Scanner;

public class Operadores3 {

    public static void main(String[] args) {

        // https://www.youtube.com/watch?v=bKiNVP9SbSE voy aqui en este video

        Scanner entrada = new Scanner(System.in);
        
        float superficie;
        float lado;

        System.out.print("Ingresa un lado del cuadrado: ");

         // aqui le asigno a la variable lado, el valor que nos dieron por pantalla

        lado = entrada.nextFloat();
        
        // ahora se calculan las variables

        superficie = lado * lado;   // la superficie es lado x lado.

        System.out.println("La superficie de una cuadrado es: " + superficie);
        
     
       
    }
    
}



 
