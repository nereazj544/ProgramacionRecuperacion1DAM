package ClaseyObjetos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainAutomovil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Automovil> automoviles = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] datos = sc.nextLine().split(" ");

            // !Indicar que es cada uno de los elementos dentro del array
            String modelo = datos[0];
            double capacidad = Double.parseDouble(datos[1]);
            double combustible = Double.parseDouble(datos[2]);
            double consumo = Double.parseDouble(datos[3]);

            Automovil automovil = new Automovil(modelo, i, i, consumo, combustible, consumo);
            automoviles.put(modelo, automovil);

        }

        String cmd = sc.nextLine();
        while (!cmd.equals("fin")) {
            String [] partes = cmd.split(" ");
            String modelo = partes[1];
            double km = Double.parseDouble(partes[2]);

            Automovil automovil = automoviles.get(modelo);

            if (automovil != null) {
                try {
                    double KmRealizados = automovil.desplazar(km);
                    System.out.println(modelo + ", Combustibles restante: " + automovil.getComDeposito() + ", Combustible consumido: " + KmRealizados * automovil.getConsuKM());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                cmd = sc.nextLine();
            }
        }

        for (Automovil automovil : automoviles.values()) {
            System.out.println(automovil.getModelo() + ", combustible restante: " + automovil.getComDeposito() + ", km recorridos: " + automovil.getKmre() + ", combustible total consumido: " + automovil.getTotal());
        }
        sc.close();
    }
}
