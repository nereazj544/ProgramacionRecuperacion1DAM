package EjercicosBasicos;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducce un nº: ");
        int num = sc.nextInt();
        sc.close();

        if (num > 0) {
            System.out.println("el numero introduccido es: " + num +" es positivo");
        }else if (num < 0) {
            System.out.println("el numero introduccido es: " + num +" es negativo");
            
        }else{
            System.out.println("el numero introduccido es: " + num +" es cero");
        }
    }
}
