import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura del triángulo: ");
        int altura = scanner.nextInt();

        // Bucle para las filas
        for (int i = 1; i <= altura; i++) {
            // Bucle para imprimir espacios en blanco
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Bucle para imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
