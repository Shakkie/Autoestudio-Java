import java.util.Scanner;

// aplicacion que pida 3 numeros en teclado, calcular su promedio
// y ese promedio lo muestre en cubo

public class Ejerciciopromediocubo {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        // declaramos variables

        double numero1;
        double numero2;
        double numero3;
        double promedio;
        double promedio_alcubo;

        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextDouble();

        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada.nextDouble();

        System.out.println("Ingresa el tercer numero: ");
        numero3 = entrada.nextDouble();


        promedio = (numero1 + numero2 +  numero3) / 3;
        
        System.out.println("El promedio de los 3 numeros es: " + promedio);

        // para hacerlo al cubo se coloca math pow 
        //(variable promedio coma, el numero que quieres que este elevado)
    
        promedio_alcubo = Math.pow(promedio, 3);

        System.out.println("El promedio elevado al cubo es: " + promedio_alcubo);


    }


}
