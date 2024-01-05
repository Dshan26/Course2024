import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        /*Crear un menu donde se le pide al usuario 4 opciones la primera seria
        * suma 2.resta 3.multiplicacion 4.division 5.default*/

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un  numero:");
        int number = sc.nextInt();

        switch (number) {
            case 1 -> System.out.println("El numero es: " + number);


            case 2 -> System.out.println("El numero es: " + number);


            case 3 -> System.out.println("El numero es: " + number);

            default -> System.out.println("El numero es: " + number);
        }

        /*Crear un algoritmo donde se le pida la usuario dos rangos uno menor y mayor
        * e imprimir los 10 primeros numeros pares.*/
    }
}
