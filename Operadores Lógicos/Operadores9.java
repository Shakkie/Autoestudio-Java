import java.util.Scanner;

// Calcular un numero  a un exponente x

public class Operadores9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base;
        int exponente;

        System.out.print("Ingresa un numero de la base: ");
        base = entrada.nextInt();

        System.out.print("Ingresa el exponente: ");
        exponente = entrada.nextInt();

        /*
         * Para calcular exponentes se usa la CLASE MATH
         * la clase math (ofrece METODOS matemáticos) e igual que la clase Scanner,
         * nos ofrece ejercicios matematicos con mayor complejidad
         * Por ejemplo, la clase Scanner nos ofrece metodos como
         * "nextint, nextfloat, nextdouble, etc"
         * La clase MATH nos ofrece metodos como el Math.pow que sirve para calcular
         * exponentes
         */
        // nos tira error porque el metodo pow, usa double
        // entonces tenemos que pasar los enteros int a double
        // Se "castea" que significa convertir
        // colocando el (int) antes del metodo math, lo convierte a int
        int resultado = (int) Math.pow(base, exponente);

        System.out.println("El numero " + base + " elevado al exponente " + exponente + " es: " + resultado);

    }
}
