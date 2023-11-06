
import java.util.Scanner;

public class Calculadora {
    /*
     * Crear una calculadora
     * Sumar
     * Restar
     * Multiplicar
     * Dividir
     * Raiz cuadrada
     * Raiz cubica
     * Elevar exponente
     * Hallar porcentaje
     * Salir
     */
    // podemos trabajar con switch case o if else
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        int primer_numero;
        int segundo_numero;
        int resultado;

        System.out.println("Digite una opcion: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Raiz cuadrada");
        System.out.println("6. Raiz cubica");
        System.out.println("7. Elevar exponente");
        System.out.println("8. Hallar porcentaje");
        System.out.println("9. Salir");
        System.out.println("");
        System.out.print("Digita la opcion : ");

        opcion = entrada.nextInt();

        switch (opcion) {
            // suma
            case 1:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                primer_numero = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                segundo_numero = entrada.nextInt();
                System.out.println("");

                resultado = primer_numero + segundo_numero;
                System.out.println("=========================================");
                System.out.println("El resultado de la suma es: " + resultado);
                System.out.println("=========================================");
                break;

            // resta
            case 2:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                primer_numero = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                segundo_numero = entrada.nextInt();
                System.out.println("");

                resultado = primer_numero - segundo_numero;
                System.out.println("=========================================");
                System.out.println("El resultado de la resta es: " + resultado);
                System.out.println("=========================================");
                break;

            // multiplicacion
            case 3:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                primer_numero = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                segundo_numero = entrada.nextInt();
                System.out.println("");

                resultado = primer_numero * segundo_numero;
                System.out.println("=========================================");
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                System.out.println("=========================================");
                break;

            // division
            case 4:
                System.out.println("");
                System.out.print("Digite el primer numero: ");
                primer_numero = entrada.nextInt();
                System.out.print("Digite el segundo numero: ");
                segundo_numero = entrada.nextInt();
                System.out.println("");

                if (segundo_numero == 0) {
                    System.out.println("");
                    System.out.println("=========================================");
                    System.out.println("Ningun numero se puede dividir por cero");
                    System.out.println("=========================================");
                } else {
                    resultado = primer_numero / segundo_numero;
                    System.out.println("=========================================");
                    System.out.println("El resultado de la division es: " + resultado);
                    System.out.println("=========================================");
                }
                break;

            // raiz cuadrada

            case 5:
                System.out.println("");
                System.out.print("Digite el numero que desea raiz cuadrada: ");
                primer_numero = entrada.nextInt();

                resultado = (int) Math.sqrt(primer_numero);

                System.out.println("=========================================");
                System.out.println("El resultado de la raiz cuadrada es: " + resultado);
                System.out.println("=========================================");
                break;

            // raiz cubica

            case 6:
                System.out.println("");
                System.out.print("Digite el numero que desea raiz cubica: ");
                primer_numero = entrada.nextInt();

                resultado = (int) Math.cbrt(primer_numero);

                System.out.println("=========================================");
                System.out.println("El resultado de la raiz cubica es: " + resultado);
                System.out.println("=========================================");
                break;

            // Elevar potencia

            case 7:
                System.out.print("Digite el numero que desea elevar a la potencia o base: ");
                primer_numero = entrada.nextInt();

                System.out.print("Digite el exponente: ");
                segundo_numero = entrada.nextInt();

                resultado = (int) Math.pow(primer_numero, segundo_numero);

                System.out.println("=========================================");
                System.out.println("El resultado de elevar a la potencia es: " + resultado);
                System.out.println("=========================================");
                break;

            // Porcentaje

            case 8:
                System.out.print("Digite el numero: ");
                primer_numero = entrada.nextInt();

                System.out.print("Digite el porcentaje: ");
                segundo_numero = entrada.nextInt();

                // recordar regla de 3 simple
                // la calculadora no estoy convencida de que realmente funcione esta operacion
                // y todos los que puedan ser doubles.

                resultado = (segundo_numero / 100) * primer_numero;

                System.out.println("=========================================");
                System.out.println("El " + segundo_numero + " % de: " + primer_numero + " es " + resultado);
                System.out.println("=========================================");
                break;

            // Saliendo de la calculadora

            case 9:
                System.out.println("");
                System.out.println("=========================================");
                System.out.println("Saliendo...de la calculadora");
                System.out.println("=========================================");
                System.out.println("");
                break;

            // si se ingresa un numero no valido

            default:

                System.out.println("");
                System.out.println("=========================================");
                System.out.println("Numero ingresado no válido");
                System.out.println("=========================================");
                break;
        }

        entrada.close();
    }
}
