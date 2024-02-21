package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

import java.util.Set;

//Plantar plantas y saber que tenemos
public interface IMaceta {
    String getNombre();

    int getVolumen();
    int volDisponible();
    int getSuperficie();
    int Superficie();
    int SupergicieDis();
    int getProfun();

    FormaMaceta getForma();
    boolean plantar(IPlanta planta);
    Set<IPlanta> getPlantas();

}
