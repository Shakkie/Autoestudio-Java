import java.util.Scanner;

public class Ejercicioifelse2 {

    /*
     * Crear un software que ingrese el sueldo de un empleado
     * y si el sueldo es mayor que o igual a 3000 nos daran un aumento del 1500
     * euros,
     * caso contrario, simplemente mostrara un mensaje que diga:
     * tu sueldo tiene que estar en el promedio de los 3000.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sueldo;

        System.out.println("Ingresa tu sueldo");
        sueldo = entrada.nextInt();

        if (sueldo >= 3000) {
            System.out.println("Sueldo tendrá un aumento total de: " + (sueldo + 1500) + " euros");
        } else {
            System.out.println("Tu sueldo tiene que estar en el promedio de 3000 euros");
        }
        entrada.close();
    }
}
