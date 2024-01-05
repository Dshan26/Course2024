import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        /*Realice un programa que solicite al usuario
        la longitud de los 3 lados de un triángulo y
        determinar qué tipo de triangulo es teniendo
        en cuenta la siguiente clasificación:
         Si los tres lados son iguales es equilátero
         Si solo dos lados son iguales isósceles
         Si todos son diferentes escalenos */

        Random random = new Random();

        //Generando un numero aleatorio entre 1 y 10
        int lado1 = 1 + random.nextInt(3);
        System.out.println("lado1 = " + lado1);
        int lado2 = 1 + random.nextInt(3);
        System.out.println("lado2 = " + lado2);
        int lado3 = 1 + random.nextInt(3);
        System.out.println("lado3 = " + lado3);

        if(lado1 == lado2 && lado2 == lado3){ // ||
            System.out.println("\n\t\tEs un triangulo equilatero");
        }else {
            if (lado1 != lado2 && lado1 !=lado3 && lado2 != lado3) {
                System.out.println("\n\t\tEs un triangulo escaleno");
            }else {
                System.out.println("\n\t\tEs un triangulo isosceles");
            }
        }

    }
}
