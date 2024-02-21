package EjercicosBasicos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        long tiempo = System.currentTimeMillis();
        String nombre = sc.nextLine();
        sc.close();
        long tiempoF = System.currentTimeMillis();
        
        long TR = tiempoF - tiempo;
        double tiempoR = TR /100.0;

        System.out.printf(nombre + " has tardado %.3f en introducir tu nombre %n", tiempoR);
    }
}
