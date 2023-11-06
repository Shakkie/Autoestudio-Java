import java.util.Scanner;

public class Operadores10 {
    

    // aplicacion que calcule la raiz cuadrada de un numero

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         // declaramos variables, usaremos double

         double numero;

         System.out.println(" Ingresa un numero para calcular su raiz cuadrada: ");
         numero = entrada.nextDouble();

        // le asigamos una variable a la raiz cuadrada
        // llamaremos la clase Math.sqrt que es la que calcula raiz cuadrada
        // recordar que la clase math trabaja con doubles

        // hacemos la ecuacion ! no olvidar! 

         double raizCuadrada = Math.sqrt(numero);
        // existe otro metodo que es Math.cbrt que calcula la raiz cubica de un numero
        // por ejemplo la raiz cubica de 27 es 3, 3x3x3



         // imprimimos el resultado

         System.out.println(" La raiz cuadrada de " + numero + " es: " + raizCuadrada);
 
    }

}
