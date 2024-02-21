package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public abstract class PlantaR extends Planta{
    private int ProfunR;
    protected PlantaR (String nombre, int distacia, int litros){
        super(nombre, distacia, litros);
        familia = familia.RAIZ;
    }
    public int getProfunR(){
        return ProfunR;
    }
    public void setProfunR(int ProfunR){
        this.ProfunR = ProfunR;
    }
    @Override
    public boolean EspacioSi(IMaceta maceta) {
        boolean proundidadOk = maceta.getProfun() > ProfunR;
        if (!proundidadOk) {
            System.out.println("Profundidad no para " + getNombre() + " en " + maceta.getNombre());
        }
        return super.EspacioSi(maceta) && proundidadOk;
    }


}
