import java.util.Scanner;

public class Operadores {

    // videito del peruano en operadores//

    public static void main(String[] args) {

        /*
         * estan son para variables con datos fijos ya escritos
         * int numero1 = 10;
         * int numero2 = 5;
         */

        // llamaremos a la clase Scanner//
        // cuando quieres pedir datos al operador leido por teclado se usa Scanner //
        Scanner entrada = new Scanner(System.in);

        // se declaran las variables a pedir
        int numero1;
        int numero2;

        // se piden por teclado los imput//

        System.out.println("Escriba el primer numero");
        numero1 = entrada.nextInt(); // aqui lo lee el scanner para hacer las operaciones (int porque es un numero
                                     // entero)

        System.out.println("Escriba el segundo numero");
        numero2 = entrada.nextInt();

        System.out.println(" ");
        // operaciones que se quieren realizar con las variables
        // son int nuevamente porque son numeros enteros
        // se hacen operaciones simples como sumar restar, etc.
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        // luego se imprimen en pantalla los resultados

        System.out.println("Las suma de los dos numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los dos numeros es: " + multiplicacion);
        System.out.println("La division de los dos numeros es: " + division);

    }

} 
