package OTROS_NOCLASE.anaya.Proyecto_Macetohuerto;

public interface IPlanta{
    String getNombre();

    int getSuperRequerida();
    int getVolReq();

    Familia getFamilia();
    Especie getEspecia();

    boolean esCompatible(IPlanta planta);
    boolean EspacioSi(IMaceta maceta);
    void plantar (IMaceta maceta);
}
