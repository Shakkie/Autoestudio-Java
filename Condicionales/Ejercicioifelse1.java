import java.util.Scanner;

public class Ejercicioifelse1 {

    /*
     * Crear un sofware que calcule el promedio de un alumno de 3 notas y si el
     * promedio es mayor a 15
     * el alumno esta aprobado, en caso contrario, estará desprobado.
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.println("Ingresa la primera nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Ingresa la segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.println("Ingresa la tercera: ");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio del alumno es: " + promedio);

        if (promedio >= 15) {
            System.out.println("El alumno está aprobado");
        }

        else if (promedio < 15) {
            System.out.println("El alumno está reprobado");
        }

        entrada.close();
    }
}
