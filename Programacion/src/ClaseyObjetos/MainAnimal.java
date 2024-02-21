package ClaseyObjetos;

import java.time.LocalDate;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leon", LocalDate.of(2004, 12, 24));
        Animal animal2 = new Animal("Tigre");

        System.out.println(animal1);
        System.out.println(animal2);

    }
}
