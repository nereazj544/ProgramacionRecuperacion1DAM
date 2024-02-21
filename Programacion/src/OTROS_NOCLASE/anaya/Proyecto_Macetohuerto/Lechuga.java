package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class Lechuga extends PlantaAr{
    public Lechuga (String nombre){
        super(nombre,12, 22);
        especie = Especie.LECHUGA;
        compatibles.add(especie.TOMATE);
        compatibles.add(especie.ZANAHORIA);
    }
}
