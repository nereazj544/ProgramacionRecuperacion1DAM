package Tareasdeclase;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] mesa = new int[10];
        for (int i = 0; i < 10; i++) {
            mesa[i] = (int) (Math.random() * 5);
        }

        int clientes;
        do {
            System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
            System.out.print("│Mesa nº: ");
            for (int i = 1; i < 11; i++) {
                System.out.printf("| %2d", i);
            }
            System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
            System.out.print("│Ocupación");
            for (int m : mesa) {
                System.out.printf("│ %2d ", m);
            }
            System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");

            System.out.println("¿Cuanta gente es? (-1 para finalizar)");
            // clientes = sc.nextInt();
            clientes = Integer.parseInt(sc.nextLine());
            sc.close();

            if (clientes >= 4) {
                System.out.println("Son muchas personas");
            } else {
                int Vacia = 0;
                boolean Mesa = false;
                for (int i = 9; i >= 0; i--) {
                    if (mesa[i] == 0) {
                        Vacia = i;
                        Mesa = true;
                    }
                }

                if (Mesa) {
                    mesa[Vacia] = clientes;
                    System.out.println("Numero de mesa: " + (Vacia + 1) + ".");
                } else {
                    int Hueco = 0;
                    boolean hueco = false;
                    for (int i = 9; i >= 0; i--) {
                        if (clientes <= (4 - mesa[i])) {
                            Hueco = i;
                            hueco = true;
                        }
                    }
                    if (hueco) {
                        mesa[Hueco] += clientes;
                        System.out.println("Compartir mesa, en el numero: " + (Hueco + 1));
                    } else {
                        System.err.println("No hay sitio");
                    }
                }
            }
        } while (clientes != -1);

    }
}
