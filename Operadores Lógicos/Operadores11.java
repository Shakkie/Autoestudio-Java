import java.util.Scanner;


//Calcular el mayor de dos números usando la clase Math


public class Operadores11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // si es math hay que usar double
        // tambien puede sen int pero lo podemos transformar

        int numero1, numero2;

        System.out.println(" Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println(" Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();


        //pasar los enteros int a double
        // Se "castea" que significa convertir
        // colocando el (int) antes del metodo math, lo convierte a int 

        // !!! aunque la clase Math.max/Math.min nos ofrece int/double/float !!!

        int Nmayor = Math.max(numero1, numero2);

        // luego imprimimos el resultado 

        System.out.println(" El mayor de " + numero1 + " y " + numero2 + " es: " + Nmayor);


        // para cerrar el scannner llamado en este ejercicio "entrada"

        entrada.close();

    }
        

}


