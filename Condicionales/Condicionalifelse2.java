import java.util.Scanner;

public class Condicionalifelse2 {

    // Crear un software que calcule el mayor de 3 numeros

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        numero3 = entrada.nextInt();
        // que le estoy diciendo con el &&, que además de ser mayor que numero 2,
        // tambien
        // tiene que ser mayor que numero 3.
        // Recordar lo siguiente: "&&" sirve para decir que se cumple ambas condiciones
        // sino se cumplen ambias condiciones, seguirá a la proxima condicional.
        // boca grande mayor > boca chica menor

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primero numero es el mayor");
        } else if (numero1 < numero2 && numero2 > numero3) {
            System.out.println("El segundo numero es el mayor");
        } else if (numero1 < numero3 && numero3 > numero2) {
            System.out.println("El tercer numero es mayor");
        } else {
            System.out.println("Los numeros son iguales");

        }

        entrada.close();

    }
}
