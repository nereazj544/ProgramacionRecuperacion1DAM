package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class MacetT extends Maceta {
    private int diametro;
    
    public MacetT (String nombre, int alto, int diametro){
        super(nombre, alto);
        this.diametro=diametro;

    }

    @Override
    public int getSuperficie(){
        return (int) (Math.PI * (diametro/2) * (diametro/2));
    }
    
    @Override
    public FormaMaceta getForma(){
        return FormaMaceta.TUBULAR;
    }
   
}
