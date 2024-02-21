package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int NUM_Zanaorias = 5;
    
    public static void main(String[] args) {
        Huerto miHuerto = new Huerto("Huerto :)");

        //TIPOS DE MACETAS
        Maceta cuadrada = new MacetT("Cuadrada", 20, 20);
        Maceta botella = new MacetaR("botella", 20, 20, 20);
        Maceta granbotella = new MacetaR("Gran botella", 20, 20, 20);

        miHuerto.addMaceta(granbotella);
        miHuerto.addMaceta(botella);
        miHuerto.addMaceta(cuadrada);

        System.out.println("Nuevo huerto: " + miHuerto);


        //Plantas
        IPlanta tomates = new TomateCherry("Cherrys");
        IPlanta zanahoria = new Zanahoria("zanahorias");
        IPlanta lechuga = new Lechuga("Lechuga");
        IPlanta perejil = new Perejil("Perjil");
        IPlanta hinojo = new Hinojo("Hinojo");

        List<Zanahoria> zanahorias = new ArrayList<>();
        for (int i = 0; i < NUM_Zanaorias; i++) {
            Zanahoria z = new Zanahoria("z" + i);
            zanahorias.add(z);
        }

        IMaceta macetaTomates = miHuerto.plantar(tomates);
        ResultadoPlantar(tomates, macetaTomates);
        
        IMaceta macetaLechuha = miHuerto.plantar(lechuga);
        ResultadoPlantar(lechuga, macetaLechuha);
        
        IMaceta macetaZanahoria = miHuerto.plantar(zanahoria);
        ResultadoPlantar(zanahoria, macetaZanahoria);

        IMaceta macetaPerejil = miHuerto.plantar(perejil);
        ResultadoPlantar(perejil, macetaPerejil);
        
        IMaceta macetaHinojo = miHuerto.plantar(hinojo);
        ResultadoPlantar(hinojo, macetaHinojo);
        
       for (Zanahoria z : zanahorias) {
         IMaceta macetaZ = miHuerto.plantar(z);
         ResultadoPlantar(z, macetaZ);
       }

       System.out.println("Huerto con plantas: " + miHuerto);

    }

    private static void ResultadoPlantar( IPlanta planta, IMaceta maceta) {
        if (maceta != null) {
            System.out.println("Se ha plantado: " + planta.getNombre() + " en " +  maceta.getNombre());
        }else{
            System.out.println("no se ha podido plantar: " + planta.getNombre());
        }
    }
}
