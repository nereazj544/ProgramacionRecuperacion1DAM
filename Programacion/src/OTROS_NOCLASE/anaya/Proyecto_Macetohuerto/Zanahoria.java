package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class Zanahoria extends PlantaR{
    public Zanahoria (String nombre){
        super(nombre, 10, 3);
        especie = Especie.ZANAHORIA;
        incompatibles.add(Especie.ESPINACA);
        incompatibles.add(Especie.HINOJO);
        compatibles.add(Especie.TOMATE);
        compatibles.add(Especie.LECHUGA);
    }
}
