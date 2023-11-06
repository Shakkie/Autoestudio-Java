import java.util.Scanner;

public class Operadores2 {
    public static void main(String[] args) {

        // declaracion de variables (concatenacion de variables )

        // se puede hacer con numeros o strings

        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("Escribe tu nombre: ");
        nombre = entrada.next();

        System.out.println("Tu nombre es: " + nombre);

        nombre += " Ponce";

        System.out.println(" ");

        System.out.println("Tu nombre completo es: " + nombre);

        // int numero = 10;

        // concatenacion de variables

        // numero = numero + 6; // por ejem, esto sera la suma del numero de la variable
        // "numero" "10" +
        // el nuevo valor asignado como suma "6" = "10+6"

        // tambien se puede escribir de la sigte. manera:
        // numero += 6; //
        // pero si escribimos numero += numero + 6, estaria sumando 10 + 10 + 6 //

        // System.out.println(numero);

    }
}
