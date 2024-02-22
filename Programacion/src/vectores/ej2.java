package vectores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ej2 {
    public static void main(String[] args) {
        int t = (int) (Math.random() * 41) +10; //!Determinacion del tamaño aleatorio de enter 10 y 50
        List<Integer> v = IntStream.rangeClosed(-100, 100).boxed().collect(Collectors.toList());
        Collections.shuffle(v);
        v=v.subList(0, t);
        
        List<Integer> vi = new ArrayList<>(v);
        Collections.reverse(vi);

        System.out.println("Vector: " + v);
        System.out.println("Vector inverso: " + vi);

    }
}
