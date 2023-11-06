import java.util.Scanner;

public class Operadores5 {
    

     // calcular el area de un triangulo
     // el area se calcula base x altura dividido por 2

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
         
         // indicamos las variables 

        double area_triangulo;
        double base_triangulo;
        double altura_triangulo;

        // pedimos datos por teclado (input) 

        System.out.println("Escribe la base del triangulo: ");
        
        // guardamos el valor de la variable pedida

        base_triangulo = entrada.nextDouble();

        System.out.println("Escribe la altura del triangulo: ");
        
        altura_triangulo = entrada.nextDouble();

         // hacemos el calculo de la area del triangulo

        area_triangulo = ((base_triangulo * altura_triangulo) / 2); // base x altura dividido por 2

        // imprimemos el resultado por pantalla

        System.out.println("El area del triangulo es: " + area_triangulo);


    }



}
