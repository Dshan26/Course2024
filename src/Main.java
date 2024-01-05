import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        System.out.println(" -"+b+"+-√(pow("+b+"^2)-4*"+a+"*"+c+"))/2"+a);


        double discriminante = pow( b , 2) - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - sqrt(discriminante)) / (2 * a);
            System.out.println("Dos soluciones reales: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Una solución real: " + raiz);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        /*crear un algoritmo donde se le pida al usuario dos numero y diga cual es el mayor y tambein si es
        * par o impar.*/
    }
}