import java.util.Random;
import java.util.Scanner;

public class Mian4 {
    public static void main(String[] args) {
        /*Crear un juegon donde se generen dos numero aleatorio y sumarlos
         * pedir al usuario que intente adivinar la suma de los numero aleatorios*/
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Generando un numero aleatorio entre 1 y 10

        int var1 = 1 + random.nextInt(10);
        System.out.println("var1 = " + var1);
        int var2 = 1 + random.nextInt(10);
        System.out.println("var2 = " + var2);
        int sum = var1 + var2;
        System.out.println("sum = " + sum);

        System.out.println("Ingrese un numero para adivinar la suma:");
        int number = sc.nextInt();

        if(sum == number){
            System.out.println("\n\t\t-Felicitaciones has ganado con el numero: "+sum);
        }else {
            System.out.println("\n\t\t-Error no has adivinado la suma");
        }





    }
}
