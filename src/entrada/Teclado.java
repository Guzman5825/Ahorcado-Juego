package entrada;

import java.util.Scanner;

public class Teclado {

	public static char obtenerCaracter()  {
        Scanner scanner = new Scanner(System.in);
        char letra = '\0'; // Inicializamos la variable
        boolean entradaValida = false;

        while (!entradaValida) {
            String input = scanner.nextLine();
            
            if (input.length() == 1 && input.charAt(0)!='\0' && input.charAt(0)!='\n') {
                letra = input.charAt(0);
                entradaValida = true;
            } 
        }

        return letra;
    }
}
