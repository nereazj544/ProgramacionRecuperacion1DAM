package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public abstract class PlantaHoja extends Planta{
    protected PlantaHoja (String nombre, int distacia, int litros){
        super(nombre, distacia, litros);
        familia = familia.HOJA;
    }
    
}
