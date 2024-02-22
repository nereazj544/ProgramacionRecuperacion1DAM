package ColeccionesII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ej2 {

    public boolean contieneImpares(List<Integer> num){
        for (Integer nume : num) {
            if (nume % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ej2 v = new ej2();
        List<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducce numeros de uno en uno. Para terminar 'Fin'");

        while (sc.hasNextLine()) {
            String fi = sc.nextLine();
            if (fi.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int n = Integer.parseInt(fi);
            num.add(n);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //!Verifica si es par o impar
        if (v.contieneImpares(num)) {
            System.out.println("Contiene impares");
        } else{
            System.out.println("Contiene pares");

        }
        sc.close();
    }

}
