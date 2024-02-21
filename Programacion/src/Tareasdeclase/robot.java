package Tareasdeclase;

import java.util.Scanner;

public class robot {
    public static void main(String[] args) {
        String [][] arrays = {
                {"el pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
				{"los ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|" ,"|  \\ /  |"},
				{"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
				{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
				{"la barbilla", " \\_____/ ", " \\,,,,,/ "}
        };

        String [] robot = new String[arrays.length];
        for (int i = 0; i < robot.length; i++) 
            robot[i] = Opcion(arrays[i]);
        for (int i = 0; i < robot.length; i++) 
            System.out.println(robot[i]);
    }

    private static String Opcion(String[] op) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opcion: " + op[0]);
        for (int i = 0; i < op.length; i++) {
            System.out.println(i + ": " + op[i]);
        }
        int opciones;
        do{
            try {
                opciones = Integer.parseInt(sc.nextLine());
                sc.close();
            } catch (Exception e) {
                opciones = 0;
                e.printStackTrace();
            }
            if (opciones < 1 || opciones >= op.length) {
                System.out.println("Error");
            }
        }while(opciones < 1 || opciones >= op.length);
            return op[opciones];
        }
        
    }

