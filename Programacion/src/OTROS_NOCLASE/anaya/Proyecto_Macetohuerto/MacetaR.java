package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public class MacetaR extends Maceta{
    private int largo;
    private int ancho;

    public MacetaR (String nombre, int alto, int ancho, int largo){
        super(nombre, alto);
        this.ancho = ancho;
        this.largo = largo;
    }
    @Override
    public int getSuperficie(){
        return ancho * largo;
    }
    public FormaMaceta getForma(){
        return FormaMaceta.RECTANGULAR;
    }
    @Override
    public int getVolumen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVolumen'");
    }
    @Override
    public int Superficie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Superficie'");
    }
    @Override
    public int getProfun() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfun'");
    }
}
