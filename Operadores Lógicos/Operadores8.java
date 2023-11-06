import java.util.Scanner;

// nos pide 2 caracteres por pantalla, sumarlos y mostrarlos

public class Operadores8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char caracter1;
        char caracter2;
        // Para sumar caracteres a este String tenemos que darle un valor de inicio
        // se deja un espacio en blanco, le decimos que tendra un espacio donde sumar
        // "suma_caracter += caracter1 + caracter2"
        // recordar ! suma = suma + numero
        String suma_caracter = " ";

        System.out.println("Ingresa el primer caracter: ");
        // para los char despues del next();, se le agrega charAt()
        // el numero entre () indica la cantidad de caracter a guardar
        // next() me guarda texto
        // charAt() me guarda "x" cantidad de caracter
        caracter1 = entrada.next().charAt(0);

        System.out.println("Ingresa el segundo caracter: ");
        // recordar que colocar 0 dentro del charAt() quiere decir 1 caracter
        caracter2 = entrada.next().charAt(0);

        /*
         * ESTA NO ES LA FORMA DE HACER SUMA DE CARACTERES, ¡¡NO OLVIDAR!!
         * suma_caracter = caracter1 + caracter2
         */
        // Si dejo la suma de variables asi, me los sumara en formato ASCII a=97 b=98
        // total: 195
        // en cambio si dejo un espacio entre la suma de caracteres me sumara las letras
        // por ejemplo: caracter1 + " " + caracter2(el espacio los deja juntos o
        // separados)
        suma_caracter += caracter1 + " + " + caracter2;

        System.out.println("La suma de los dos caracteres es: " + suma_caracter);

    }
}