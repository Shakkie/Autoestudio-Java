import java.util.Scanner;

public class Condicionalifelse1 {

    // Crear un Sofware que calcule el mayor de dos numeros
    // usando if, if else, else

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // pedimos 2 numeros enteros dado que me pide buscar el mayor

        int numero1;
        int numero2;

        System.out.println("Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();

        // Aqui podemos tener 3 condiciones:
        // si el primero numero es mayor que el segundo
        // si el segundo numero es mayor que el primero
        // si ninguno es mayor que el otro

        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor");

        }

        else if (numero1 < numero2) {
            System.out.println("El segundo numero es mayor");
        }

        // en el caso de que no se cumplan las condiciones

        else {
            System.out.println(" Los numeros son iguales");
        }

    }

}
