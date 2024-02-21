package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class Hinojo extends PlantaAr{
    public Hinojo (String nombre){
        super(nombre,10,8); 
        especie = Especie.HINOJO;
        incompatibles.add(especie.TOMATE);
        incompatibles.add(especie.ZANAHORIA);
        compatibles.add(especie.LECHUGA);
    
    }
}
