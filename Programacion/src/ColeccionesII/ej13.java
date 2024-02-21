package ColeccionesII;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Método llamado colapsar que acepte un parámetro de tipo Deque que represente
 * una pila de números
 * enteros y modifique su contenido reemplazando cada par de números
 * consecutivos por la suma de ambos.
 * Por ejemplo:
 * Contenido inicial: [5, 11, -3, 14, 9, 4, 21, -42, 13, 2]  Tope
 * Contenido final: [16, 11, 13, -21, 15]  Tope
 * Si la pila original almacena un número impar de números, el número que está
 * en el fondo de la pila se
 * quedará como está. Por ejemplo:
 * Contenido inicial: [3, -5, 7, -9, 11]  Tope
 * Contenido final: [3, 2, 2]  Tope
 * Se han de respetar las restricciones siguientes para resolver el problema:
 * • No está permitido usar ningún método de iteración.
 * • No está permitido el uso del método stream() de ninguna colección.
 * • Si fuese necesario usar estructuras de datos auxiliares para resolver el
 * problema, sólo se permitirán
 * pilas y/o colas.
 * • Sólo se permite el uso de las operaciones propias de pilas y colas simples.
 */
public class ej13 {
    public static void main(String[] args) {
        Deque<Integer> p = new LinkedList<>();
        p.push(2);
        p.push(6);
        p.push(8);
        p.push(7);
        p.push(9);
        p.push(5);
        p.push(3);
        p.push(8);
        p.push(-9);

        System.out.println("Contenido inicial: " + p);
        colasar(p);
        System.out.println("Final: " + p);
    }

    private static void colasar(Deque<Integer> p) {
        Deque <Integer> cDeque = new LinkedList<>();

        while (p.size() >= 2) {
            int n1 = p.pop();
            int n2 = p.pop();
            cDeque.offer(n1 + n2);
        }

        if (!p.isEmpty()) {
            cDeque.offer(p.pop());
        }
        while (!cDeque.isEmpty()){
            p.push(cDeque.pollLast());
        }
    }
}
