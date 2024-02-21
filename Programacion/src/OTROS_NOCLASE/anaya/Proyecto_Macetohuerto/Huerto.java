package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

import java.util.HashSet;
import java.util.Set;

import Tareasdeclase.robot;

public class Huerto implements IHuerto {
    private String nombre;
    private Set<IMaceta> macetas;

    public Huerto(String nombre){
        this.nombre = nombre;
        macetas = new HashSet<>();
    }

    @Override
    public void addMaceta(IMaceta maceta) {
        macetas.add(maceta);
    }

    @Override
    public IMaceta plantar(IPlanta planta) {
        for (IMaceta iMaceta : macetas) {
            if (iMaceta.plantar(planta)) {
                return iMaceta;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Huerto " + nombre + "\n");
        for (IMaceta iMaceta : macetas) {
            sBuilder.append("\t" + iMaceta + "\n");
        }
        return sBuilder.toString();
    }
    


}
