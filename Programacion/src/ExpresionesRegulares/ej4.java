package ExpresionesRegulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej4 {
    public static void main(String[] args) {


        //!Args
    
        if (args.length != 1) {
            System.out.println("Especifica en los parametos");
            return;
        }

        String ruta = args[0];
        /* 
        !pidiendo la ruta
         Scanner sc = new Scanner(System.in);
         System.out.println("Introducce la ruta: \n");
         String ruta = sc.nextLine();
         */
         BufferedReader r = null;
         

        try {
            r = new BufferedReader(new FileReader(ruta));
            String l;
            Pattern url = Pattern.compile("(http|https)://[^\\s]+");

            while ((l = r.readLine()) != null) {
                Matcher matcher = url.matcher(l);
                while (matcher.find()) {
                 System.out.println(matcher.group());   
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
          if (r!=null) {
            r.close();
          }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
