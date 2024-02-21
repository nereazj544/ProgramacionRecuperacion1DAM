package ColeccionesII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ej11 {
    public static void main(String[] args) {
        //!Para añadir datos a una lista (opcion 1)
        List<Integer> lista1 = List.of(1,2,3,4,5);
        
        //!Para añadir datos a una lista (opcion 2)
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        int canComunes = ej11.contarComunes(lista1, lista2);
        System.out.println("Cantidad: " + canComunes);
        

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
