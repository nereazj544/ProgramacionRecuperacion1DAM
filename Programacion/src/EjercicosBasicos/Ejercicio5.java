package EjercicosBasicos;

public class Ejercicio5 {
    public static void main(String[] args) {
        int VI = 5;
        int A = 2;
        int espacio = 5;

        double tiempo = VI / A;
        System.out.println("Tiempo: " + tiempo);
        double ER = espacio + (VI * tiempo) + (0.5 * A * Math.pow(tiempo, 2));
        System.out.println("Recorrido: " + ER);
    }
}
