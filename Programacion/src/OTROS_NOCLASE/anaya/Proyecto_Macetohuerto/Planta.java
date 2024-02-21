package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Planta implements IPlanta{
    protected Especie especie;
    protected Familia familia;
    protected Set<Especie> compatibles;
    protected Set<Especie> incompatibles;


    private String nombre;
    private int SuperRequerida;
    private int VolReq;
    private Date fechaSiembra;
    private IMaceta maceta;

    protected Planta (String nombre, int distacia, int litros){
        this.nombre = nombre;
        SuperRequerida = distacia^2;
        VolReq = litros* 1000;
        incompatibles = new HashSet<>();
        compatibles = new HashSet<>();
    }
    
  


    public void plantar (IMaceta maceta){
        fechaSiembra = new Date(); 
        this.maceta = maceta;
    }

    


    public Familia getFamilia() {
        return familia;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getSuperRequerida(){
        return SuperRequerida;
    }

    public void setSuperRequerida(int SuperRequerida){
        this.SuperRequerida = SuperRequerida;
    }

    public int getVolReq(){
        return VolReq;
    }
    public void setVolReq(int VolReq){
        this.VolReq = VolReq;
    }

    public void setEspecia(Especie especie){
        this.especie = especie;

    }

    public void setFamilia(Familia familia){
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Planta " + nombre + " [especie=" + especie + ", familia=" + familia + ", superficie = " + SuperRequerida + ", volRequerido " + VolReq + " incompatibles =" + incompatibles + ", fechaSiembra= " + fechaSiembra + (maceta != null ? ", maceta= " + maceta.getNombre() : "") + "]";
    }




    @Override
    public Especie getEspecia() {
        return especie;        
    }




    @Override
    public boolean esCompatible(IPlanta planta) {
        boolean compatible = true;
		if (!especie.equals(planta.getEspecia())) {
			if (!compatibles.contains(planta.getEspecia())) {
				compatible &= !familia.equals(planta.getFamilia());
				compatible &= !incompatibles.contains(planta.getEspecia());
			}
		}
		return compatible;
    }




    @Override
    public boolean EspacioSi(IMaceta maceta) {
        boolean superficieOk = maceta.Superficie() > getSuperRequerida();
		if (!superficieOk) {
			System.out.println("--- Superficie ko para " + getNombre() + " en " + maceta.getNombre()); 
		}

		boolean volumenOk = maceta.volDisponible() > getVolReq();
		if (!volumenOk) {
			System.out.println("--- Volumen ko para " + getNombre() + " en " + maceta.getNombre()); 
		}
		
		return superficieOk && volumenOk;
    }

    

    
}
