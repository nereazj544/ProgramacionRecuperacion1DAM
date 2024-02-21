package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class Tomate extends PlantaFr {
    public Tomate(String nombre) {
        super(nombre, 30, 18);
    }

    //CONSTRUCTOR PARA TOMATEC
    public Tomate(String nombre, int superfici, int vol) {
        super(nombre, superfici, vol);
        especie = Especie.TOMATE;
        compatibles.add(especie.LECHUGA);
        compatibles.add(especie.PEREJIL);
        compatibles.add(especie.ZANAHORIA);
        incompatibles.add(especie.HINOJO);
    }
}
