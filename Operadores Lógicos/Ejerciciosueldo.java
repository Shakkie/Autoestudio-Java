import java.util.Scanner;

public class Ejerciciosueldo {
    
    public static void main(String[] args) {

        // indicamos que los valores seran entregados por teclado (input) 
        //crear una aplicacion que calcule el sueldo de un empleado

        Scanner entrada = new Scanner(System.in);
        
         int sueldo_empleado;
         int horas_trabajados;
         int dias_trabajados;

         System.out.println("Ingresar horas trabajadas: ");
         horas_trabajados = entrada.nextInt();

         System.out.println("Ingresar dias trabajados: ");
         dias_trabajados = entrada.nextInt();

         sueldo_empleado = horas_trabajados * dias_trabajados;

         System.out.println("El sueldo del empleado es: " + sueldo_empleado);




        









    }
}
