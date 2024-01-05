import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        /*Realice un programa para que halle todos los números pares que se encuentran dentro de un
        intervalo dado por el usuario. (Nota: No importa el orden menor o mayor primero del intervalo) y
        diga cuantos números pares hay.

        1: do-while
        2: while
        3: for*/

        //inicializador
        //Crear un algorimto donde se imprima los numeros pares de 1 a 10
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el rango menor: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el rango mayor: ");
        int num2 = sc.nextInt();

        System.out.println("Imprimiendo numeros pares con do while");

        int var_1 = num1;

        do{
          if(var_1 % 2 == 0){
              System.out.println("El numero :"+ var_1);
          }
            var_1 ++;

        }while(var_1 <= num2);

        System.out.println("Imprimiendo numeros pares con while");

        int num = num1;
        while (num <= num2){
            if(num % 2 == 1){
                System.out.println("El numero :"+ num);
            }
            num ++;
        }
        System.out.println("Imprimiendo numeros pares con for");

        for(int var1 = num1 ; var1 <= num2; var1++){
            if(var1 % 2 == 1){
                System.out.println("El numero :"+ var1);
            }
        }
    }
}
