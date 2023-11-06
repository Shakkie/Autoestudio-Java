import java.util.Scanner;

public class Operadores7 {

    // Calcular la edad de una persona //
    // necesitamos su fecha de nacimiento y la fecha actual //

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // declaro mis variables //

        int edad;
        int añoNacimiento;
        int añoActual;

        System.out.println("Ingresa tu año de nacimiento: ");
        añoNacimiento = entrada.nextInt();

        System.out.println("Ingresa tu año actual: ");
        añoActual = entrada.nextInt();

        // resuelvo la ecuacion
        
        edad = añoActual - añoNacimiento;

        System.out.println("Tu edad es: " + edad);

    }
}
