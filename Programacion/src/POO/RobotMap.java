package POO;

import java.util.Map;
import java.util.Scanner;

public class RobotMap {
    public static void main(String[] args) {
        OpcioneRM opcioneRM = new OpcioneRM(); // Objeto de la clase de opcionesRM
        Map<String, String[]> opMap = opcioneRM.getOpciones();

        Scanner sc = new Scanner(System.in);

        for (Map.Entry<String, String[]> entry : opMap.entrySet()) {
            String t = entry.getKey();
            String[] o = entry.getValue();

            System.out.println("Opciones para " + t + ": ");

            for (int i = 0; i < o.length; i++) {
                System.out.println((i + 1) + ". " + o[i]);
            }
            System.out.println("Introducir un numero " + t + ": ");
            int opcinS = sc.nextInt();

            if (opcinS >= 1 && opcinS <= o.length) {
                String opcion = o[opcinS - 1];
                System.out.println("Seleccionado: " + opcion);
            } else {
                System.out.println("No valido");
            }
        }

        //!Retrato
        RetratoMap retrato = new RetratoMap();
        retrato.setPelo(retrato.get("pelo"));
        retrato.setOjos(retrato.get("ojos"));
        retrato.setNarizOrejas(retrato.get("NarizOrejas"));
        retrato.setBoca(retrato.get("boca"));
       

        System.out.println(retrato);


    }
}