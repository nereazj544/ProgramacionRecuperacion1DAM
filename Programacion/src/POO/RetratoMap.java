package POO;

import java.util.HashMap;
import java.util.Map;

public class RetratoMap {

    private String pelo, ojos, NarizOrejas, boca, barbilla;

    


    private Map<String, String> partesRetrato;

    public RetratoMap() {
        partesRetrato = new HashMap<>();
        this.barbilla = "\\_____/";
    }

    public String getPelo() {
        return partesRetrato.get("pelo");
    }

    public void setPelo(String pelo) {
        partesRetrato.put("pelo", pelo);
    }

    public String getOjos() {
        return partesRetrato.get("ojos");
    }

    public void setOjos(String ojos) {
        partesRetrato.put("ojos", ojos);
    }

    public String getNarizOrejas() {
        return partesRetrato.get("NarizOrejas");
    }

    public void setNarizOrejas(String narizOrejas) {
        partesRetrato.put("NarizOrejas", narizOrejas);
    }

    public String getBoca() {
        return partesRetrato.get("boca");
    }

    public void setBoca(String boca) {
        partesRetrato.put("boca", boca);
    }

    public String getBarbilla() {
        return barbilla;
    }

    @Override
    public String toString() {
        return "RetratoMap{" +
                "pelo='" + pelo + '\'' +
                ", ojos='" + ojos + '\'' +
                ", NarizOrejas='" + NarizOrejas + '\'' +
                ", boca='" + boca + '\'' +
                ", barbilla='" + barbilla + '\'' +
                '}';
    }
}
