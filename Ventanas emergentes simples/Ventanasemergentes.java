import javax.swing.JOptionPane;

// Aqui no es necesario usar la clase Scanner porque usamos Joption

public class Ventanasemergentes {
    public static void main(String[] args) {

        // ejemplo de ventanas emergentes
        // creamos variables

        int numero_entero;
        double numero_decimal;
        float numero_flotante;
        String cadena;
        char caracter;

        // Aplicamos las ventanas emergentes
        // ¿Cómo lo aplicamos?
        // Hay que llamar a la variable en cual voy a guardar algo
        // Integer hace referencia a clase entero
        // ParseInt es que se va a transformar entero
        // JOptionPane son ventanitas
        // Showinputdialog va a mostrar una entrada para digitar algo y que lo guarde
        // en esa variable entero.
        // ¿por qué se usa integer? porque JOptionPane trabaja con String, entonces hay
        // que transformarlo a enteros

        numero_entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero_decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));
        numero_flotante = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero flotante: "));

        // los strings y char son más fáciles porque no necesitan transformarse

        cadena = JOptionPane.showInputDialog("Digite una frase: ");
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        // recordar que para char se usa charAt(0) para guardar un caracter.

        // recordar que lo anterior fue guardar las variables que pedimos por la ventana
        // emergente

        // ¿como lo imprimimos?
        // por eso el showMessagesDialog para mostrar el mensaje en pantalla
        // se pasa null primero, luego el texto a imprimir y la variable

        JOptionPane.showMessageDialog(null, "El numero entero es: " + numero_entero);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + numero_decimal);
        JOptionPane.showMessageDialog(null, "El numero flotante es: " + numero_flotante);
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El caracter es: " + caracter);

    }
}
