package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public abstract class PlantaAr extends Planta{
    protected PlantaAr(String nombre, int distacia, int litros){
        super(nombre, distacia, litros);
        familia = familia.AROMATICA;
    }
    
}
