package ColeccionesII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ej11Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista1 = oblista (sc, "ingresa numeros a la primera lista (separados por espacios): ");
        List<Integer> lista2 = oblista (sc, "ingresa numeros a la segunda lista (separados por espacios): ");


        int canComunes = ej11Scanner.contarComunes(lista1, lista2);
        System.out.println("Cantidad: " + canComunes);
        

    }


    private static List<Integer> oblista(Scanner sc, String string) {
        System.out.println(string);
        String [] numStrings = sc.nextLine().split("\\s+");
        List<Integer> list = new ArrayList<>();

        for (String numS : numStrings) {
            try {
                int num = Integer.parseInt(numS);
                list.add(num);
            } catch (Exception e) {
                System.err.println();
                break;
            }
        }
        return list;
    }


    public static int  contarComunes (List<Integer> lista1, List<Integer> lista2){

        Set<Integer> set1 = new HashSet<>(lista1);
        Set<Integer> set2 = new HashSet<>(lista2);

        List<Integer> numComunes = new ArrayList<>();

        for (int num : set1) {
            if(set2.contains(num)){
                numComunes.add(num);
            }
        }



        return numComunes.size();

    }
}
