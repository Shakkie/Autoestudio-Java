import java.util.Scanner;


public class Operadores4 {

            // calcular el perimetro de un cuadrado
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            int perimetro;
            int lado;

            System.out.println("Escribe un lado del cuadrado: ");
            lado = entrada.nextInt(); 
            // guardamos la variable lado, porque se usa el lado para sacar perimetro

            perimetro = lado * 4; // el perimetro es la suma de los 4 lados del cuadrado

            System.out.println("El perimetro de un cuadrado es: " + perimetro);



        }
    
}
