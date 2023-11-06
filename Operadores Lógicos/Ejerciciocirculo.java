import java.util.Scanner;

public class Ejerciciocirculo {

    // Calcular el area de un circulo
    // se calcula el radio con pi
    // se pide el radio por teclado


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area;
        double radio;
        double pi = 3.14f;

        System.out.println("Introduzca el radio del circulo: ");
        radio = entrada.nextDouble();

       // podria ser una opcion pero usaremos math.pow area = pi * radio * radio;
       // recordar que math.pow es para calcular exponenten y se saca radio elevado a 2

       area = pi * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);



    }
}
