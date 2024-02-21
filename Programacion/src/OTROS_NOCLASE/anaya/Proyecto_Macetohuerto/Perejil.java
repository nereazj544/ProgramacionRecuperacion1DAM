package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class Perejil extends PlantaAr {
    public Perejil (String nombre){
        super(nombre, 8, 5);
        incompatibles.add(especie.LECHUGA);
        incompatibles.add(especie.ZANAHORIA);
        compatibles.add(especie.TOMATE);
    }
}
