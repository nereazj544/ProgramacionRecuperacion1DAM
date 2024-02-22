package ExpresionesRegulares;

import java.io.File;
import java.text.FieldPosition;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        try {
            File file = new File("Programacion\\src\\ExpresionesRegulares\\ejercicio6.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = mayus(linea);
                System.out.println(linea);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace(); //!Para que te salte el error bien guapo
        }
    }

    private static String mayus(String linea) {
        while (linea.contains("<uppercase>") && linea.contains("</uppercase>")) {
            int inicio = linea.indexOf("<uppercase>");
            int fin = linea.indexOf("</uppercase>");
            String tran = linea.substring(inicio + "<uppercase>".length(), fin);
            String t = tran.toUpperCase();
            linea =  linea.substring(0, inicio) + t + linea.substring(fin + "</uppercase>".length());
        }
        return linea; //!comentario
    }

    
}
