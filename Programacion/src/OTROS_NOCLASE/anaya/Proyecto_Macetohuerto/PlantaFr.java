package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public abstract class PlantaFr extends Planta{
    protected PlantaFr (String nombre, int distacia, int litros){
        super(nombre, distacia, litros);
        familia = familia.FRUTO;
    }
    
}
