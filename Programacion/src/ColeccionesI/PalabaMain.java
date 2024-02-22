package ColeccionesI;

import java.util.List;
import java.util.Scanner;

public class PalabaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palaba palaba = new Palaba();
        String cmd;

        do {
            System.out.println("Introduce uno de los siguientes comandos:\n"+
            "add, lista, borrar, remplazar o fin");
            cmd = sc.nextLine();
            if (cmd.equals("add")) {
                String AgregarP = sc.nextLine(); 
                palaba.Agregars(AgregarP);

            } else if(cmd.equals("lista")) {
                System.out.println("Introduce la longitud");
                int longi = sc.nextInt();
                sc.nextLine();
                List<String> longiPa = palaba.ObtenerLong(longi);
                System.out.println("palabaras de longitud: " + longi + ". Las palabras que lo contienen: " + longiPa);
            
            } else if(cmd.equals("borrar")){
                System.out.println("Escribe la palabra que quieras borrar:");
                String borrar = sc.nextLine();
                palaba.Borrar(borrar);
            
            }else if (cmd.equals("fin")){
                System.out.println("Adiios");
            
            }else{
                System.out.println("Comando no valido");
            }



        } while (!cmd.equals("fin"));
    }
}
