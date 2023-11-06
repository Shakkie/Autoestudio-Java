import java.util.Scanner;

// calcular el area de un trapecio
// se calcula el area= base mayor + base menor x 2 divido en 2


public class Ejerciciotrapecio {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      
      // declaramos variables

      float base_mayor, base_menor, altura_trapecio;
      float area_trapecio;

      System.out.println("Ingresa la base mayor: ");
      base_mayor = entrada.nextFloat();

      System.out.println("Ingresa la base menor: ");
      base_menor = entrada.nextFloat();

      System.out.println("Ingresa la altura de la trapecio: ");
      altura_trapecio = entrada.nextFloat();

      //resolvemos ecuacion
      
      area_trapecio = altura_trapecio * (base_mayor + base_menor) / 2;

      System.out.println("El area del trapecio es de: " + area_trapecio);








    }
}
