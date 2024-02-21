package Examenes.Ev1;

import java.util.Scanner;

public class ejercico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nº de lxs alumnxs: ");
        int numAl = sc.nextInt();

        String[] nombres = new String[numAl];
        double[] notaBD = new double[numAl];
        double[] notaLM = new double[numAl];
        double[] notaFH = new double[numAl];

        System.out.println("Datos de lxs alumnxs: ");
        for (int i = 0; i < numAl; i++) {
            System.out.println("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            String enter = sc.nextLine();
            
            System.out.println("Nota BD: ");
            notaBD[i] = sc.nextDouble();
            
            System.out.println("Nota LM: ");
            notaLM[i] = sc.nextDouble();
            
            System.out.println("Nota FH: ");
            notaFH[i] = sc.nextDouble();
        }
        System.out.println("\nTabla de notas: ");
        System.out.format("%-10s | %10s | %10s | %10s | %10s%n","Nombre", "BD", "LM", "FH","Media");
        for (int i = 0; i < numAl; i++) {
            String nombre = nombres[i].length() > 10 ? nombres[i].substring(0,7) + "..." : nombres[i];
            double Media = (notaBD[i] + notaFH[i] + notaLM[i])/3;
            System.out.format("%-10s | %10.2f | %10.2f | %10.2f | %10.4f%n", nombre, notaBD[i], notaLM[i], notaFH[i], Media);
        }
        sc.close();
    }
}
