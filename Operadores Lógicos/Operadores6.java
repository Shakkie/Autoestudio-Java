import java.util.Scanner;

public class Operadores6 {


    // crear una aplicacion que calcule el promedio de 5 notas de un alumno//
    public static void main(String[] args){
 
        Scanner entrada = new Scanner(System.in);
        
        // tambien se puede escribir "float nota1, nota2, nota3, nota4, nota5"//
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float nota5;
        float promedio;

        System.out.println("Ingresa la nota 1: ");
        nota1 = entrada.nextFloat();

        System.out.println("Ingresa la nota 2: ");
        nota2 = entrada.nextFloat();

        System.out.println("Ingresa la nota 3: ");
        nota3 = entrada.nextFloat();

        System.out.println("Ingresa la nota 4: ");
        nota4 = entrada.nextFloat();

        System.out.println("Ingresa la nota 5: ");
        nota5 = entrada.nextFloat();

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("El promedio de los 5 notas es: " + promedio);

    }
}
