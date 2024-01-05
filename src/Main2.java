import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Ingres su tipo de sexo: ");
        String name = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc1.nextInt();
        System.out.println("Ingrese un numer:");
        int a=sc.nextInt();

        /*crear un algoritmo con las vocales y arrojar el nombre cuando se ilija una
        * A */

        if(Objects.equals(name, "masculino") || Objects.equals(name, "Masculino")){
            int num_pulsaciones = (210 - edad) / 10;
            System.out.println("El numero de pulsaciones es: "+num_pulsaciones);
        }else{
            int num_femenino = (220 - edad) / 10;
            System.out.println("El numero de pulsaciones es: "+num_femenino);


        }
    }
}
