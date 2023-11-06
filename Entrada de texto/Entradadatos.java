import java.util.Scanner;


public class Entradadatos {
    
    public static void main (String[] args){

        // entrada de datos
       Scanner teclado = new Scanner(System.in); // con el System.in le indicamos que guardaremos datos desde la entrada teclado (in significa entrada)

        // creamos variables que es donde guardamos los datos que pedimos

       int edad; // no le damos valor de inicio porque es un dato que pediremos por teclado
       String nombre;
       float altura;

       System.out.println("Escribe tu edad: "); // creamos un print para pedir la edad por pantalla (input)
       edad = teclado.nextInt();  
       // como guardamos el valor de la variable edad? 
       // con el nombre que se le asigno al Scanner,
       // en este caso "teclado" y como la variable que pedimos es un int, se pide:
       // teclado.nextInt

       System.out.println("Escribe tu nombre: ");
       nombre = teclado.next(); // solo tiene nombre next, dado que apunta a strings.

       System.out.println("Escribe tu altura: ");
       altura = teclado.nextFloat();

       System.out.println("Tu edad es: " + edad); 
       // aqui lo que hacemos es que la pantalla nos imprima el texto que esta en comillas + la variable edad
       System.out.println("Tu nombre es: " + nombre);                                                                             
       System.out.println("Tu altura es: " + altura);






        teclado.close(); 


    }
}
