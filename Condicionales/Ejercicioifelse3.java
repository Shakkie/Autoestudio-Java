import java.util.Scanner;

public class Ejercicioifelse3 {

    /*
     * Crear programa que pida por teclado 3 notas de un alumno
     * calcular el promedio e imprimir alguno de estos mensajes:
     * 
     * Si el promedio es >=7 mostrar "Promocionado"
     * Si el promedio es >=4 y <7 mostrar "Regular"
     * si el promedio es <4 mostrar "Reprobado"
     * 
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.println("Ingresa la nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingresa la nota 2:");
        nota2 = entrada.nextDouble();
        System.out.println("Ingresa la nota 3");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio de notas es: " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4 && promedio < 7)
            System.out.println("Regular");
        else if (promedio < 4) {
            System.out.println("Reprobado");
        }

        entrada.close();
    }
}
