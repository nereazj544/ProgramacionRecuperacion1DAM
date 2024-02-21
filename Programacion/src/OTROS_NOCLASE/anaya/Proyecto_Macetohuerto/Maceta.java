package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

import java.util.HashSet;
import java.util.Set;

public abstract class Maceta implements IMaceta {
    private String nombre;
    private int alto;
    private Set<IPlanta> plantas;

    public Maceta(String nombre, int alto) {
        super();
        this.nombre = nombre;
        this.alto = alto;
        plantas = new HashSet<>();
    }

    
    @Override
    public String getNombre() {
        return nombre;
    }

    public int getAlto() {
        return alto;
    }

    public Set<IPlanta> getPlantas() {
        return plantas;
    }

    @Override
    public int SupergicieDis(){
        return getSuperficie() - superficieOcupada();
    }

    private int superficieOcupada(){
        int res = 0;
        for (IPlanta iPlanta : plantas) {
            res += iPlanta.getSuperRequerida();
        }
        return res;
    }

    public int volDisponible(){
        return getVolumen() - volOcupado();
    }
    private int volOcupado(){
        int res=0;
        for (IPlanta iPlanta : plantas) {
            res += iPlanta.getVolReq();
        }
        return res;
    }

    public boolean plantar(IPlanta planta){
          System.out.println("PLANTADO " + planta.getNombre() + " EN " + this.getNombre() );
        
        boolean compatiblesOK = true;
        for (IPlanta iPlanta : plantas) {
            boolean compatibleOK = !planta.esCompatible(iPlanta);
            if (compatibleOK) {
                System.out.println(iPlanta.getNombre()+ " no es compatible con " + planta.getNombre());
            }
            compatiblesOK &= compatibleOK;
        }

        boolean cabe = false;
        if (compatiblesOK) {
            cabe = planta.EspacioSi(this);
        }
        if (cabe) {
            plantas.add(planta);
        }
        return cabe;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Maceta " + nombre + " [" + getForma() + "] (sup" + getSuperficie() + " cm2- vol " + getVolumen() + " cm3). \n");

        if (plantas.isEmpty()) {
            sb.append("\t\tvacias\n");
        }
        for (IPlanta iPlanta : plantas) {
            sb.append("\t\t" + iPlanta + "\n");
        }
        sb.append("\t\t>> Disponible sup " + SupergicieDis() + " cm2 - vol " + volDisponible() + " cm3.");
        return sb.toString();
    }
}
