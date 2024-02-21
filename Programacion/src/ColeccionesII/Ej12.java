package ColeccionesII;

import java.util.Stack;

/* 
 * Método llamado duplicar que acepte una pila de números enteros como parámetro y sustituya cada
valor almacenado por el mismo duplicado, manteniendo el orden original.
Por ejemplo, dada la pila:
[7, 6, 2, 9, 5]  Tope
Almacenará en ella los valores:
[7, 7, 6, 6, 2, 2, 9, 9, 5, 5]  Tope
*/

public class Ej12 {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>();
        p.push(5);
        p.push(2);
        p.push(9);
        p.push(7);
        p.push(6);

        System.out.println("Pila Original: " + p);
        duplicar(p);
        System.out.println("Pila *: " + p);
    }

    private static void duplicar(Stack<Integer> p) {
        Stack<Integer> pStack = new Stack<>();
        while (!p.isEmpty()) {
            int e = p.pop();
            pStack.push(e);
            pStack.push(e);
        }

        while (!pStack.isEmpty()) {
            p.push(pStack.pop());
        }

    }
}
