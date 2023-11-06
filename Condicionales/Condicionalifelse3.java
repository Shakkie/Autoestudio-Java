import java.util.Scanner;

public class Condicionalifelse3 {

    // crear una aplicacion que dado a un numero,
    // comprobar si ese numero es negativo, positivo o cero.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa cualquier numero: ");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero == 0) {
            System.out.println("El numero es cero");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("No es un numero valido");
        }

        entrada.close();

    }
}
