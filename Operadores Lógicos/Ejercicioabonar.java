import java.util.Scanner;

// programa que pida el ingreso del precio de un producto y la cantidad que lleva el cliente
// mostrar lo que debe abonar el cliente

public class Ejercicioabonar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int precio;
        int cantidad;
        int abono;

        System.out.println("Ingresa el precio del producto: ");
        precio = entrada.nextInt();

        System.out.println("Ingresa la cantidad de productos que lleva el cliente: ");
        cantidad = entrada.nextInt();

        abono = precio * cantidad;

        System.out.println("Total a abonar el cliente es: " + abono);

    }
}
