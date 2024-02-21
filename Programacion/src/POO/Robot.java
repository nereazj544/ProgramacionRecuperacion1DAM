package POO;

import java.util.Scanner;

import POO.OpcionesR.OBoca;
import POO.OpcionesR.ONarizOrejas;
import POO.OpcionesR.OOjos;
import POO.OpcionesR.OPelo;

public class Robot {

    private String pelo, ojos, NarizOrejas, boca, barbialla;

    public Robot(String pelo, String ojos, String NarizOrejas, String boca, String barbialla) {
        this.pelo = pelo;
        this.ojos = ojos;
        this.NarizOrejas = NarizOrejas;
        this.boca = boca;
        this.barbialla = "\\_____/";
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getNarizOrejas() {
        return NarizOrejas;
    }

    public void setNarizOrejas(String narizOrejas) {
        NarizOrejas = narizOrejas;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

    public String getBarbialla() {
        return barbialla;
    }

    public void setBarbialla(String barbialla) {
        this.barbialla = barbialla;
    }

    @Override
    public String toString() {
        return "Robot\n " + pelo + "\n" + ojos + "\n" + NarizOrejas + "\n" + boca
                + "\n " + barbialla + "]";
    }

    public static void main(String[] args) {
        // ! Mostrar las opciones al usuario
        System.out.println("Opciones para el pelo: ");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". " + OPelo.pelo[i - 1]);
        }

        // !Seleccionar las Opciones
        int OpPelo = obternerOpc("Introduce un numero para seleccionar el pelo: ");

        System.out.println("Opcioens para los ojos: ");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". " + OOjos.ojos[i - 1]);
        }
        int OpOjos = obternerOpc("Introduce un numero para seleccionar el ojos: ");
        
        System.out.println("Opcioens para los orejas y narices: ");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". " + ONarizOrejas.NarizOrejas[i - 1]);
        }
        int OpNarizOrejas = obternerOpc("Introduce un numero para seleccionar la nariz y las orejas: ");
        
        System.out.println("Opcioens para la boca: ");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". " + OBoca.boca[i - 1]);
        }
        int OpBoca = obternerOpc("Introduce un numero para seleccionar la boca: ");
        

        //!OBJETO DE LA CLASE
       Robot rrobor = new Robot(
        OPelo.pelo[ OpPelo - 1],
        OOjos.ojos[OpOjos - 1],
        ONarizOrejas.NarizOrejas[OpNarizOrejas - 1],
        OBoca.boca[OpBoca - 1],
        "\\_____/"
        );

        System.err.println("RETRATO CREADO: ");
        System.out.println(rrobor);



        // !END MAI
    }

    private static int obternerOpc(String string) {
        Scanner sc = new Scanner(System.in);

        int opcionesS;
        do {
            System.out.println(string);
            while (!sc.hasNextLine()) {
                System.out.println("No has introduccido un numero valido");
                sc.nextLine();
            }
            opcionesS = sc.nextInt();
            
        } while (opcionesS < 1 || opcionesS > 4);
        return opcionesS;
    }

}