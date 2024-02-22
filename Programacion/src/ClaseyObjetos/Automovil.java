package ClaseyObjetos;

public class Automovil {
    String modelo;
    double capDeposito;
    double comDeposito;
    double consuKM;
    double kmre;
    double total;

    // !CONSTRUCTORES
    public Automovil(String modelo, double capDeposito, double comDeposito, double consuKM, double kmre, double total) {
        this.modelo = modelo;
        this.capDeposito = capDeposito;
        this.comDeposito = comDeposito;
        this.consuKM = consuKM;
        this.kmre = kmre;
        this.total = total;
    }

    public Automovil(String modelo, double capDeposito, double consuKM) {
        this(modelo, capDeposito, capDeposito, consuKM, capDeposito, consuKM);
    }

    //!Metodos

    public void llenarDepo(){
        this.comDeposito = capDeposito;
    }

    public double llenarDepo(double litros){
        double sobra =0;
        if (this.comDeposito +  litros > this.capDeposito) {
            sobra = (this.comDeposito + litros) - this.capDeposito;
            this.comDeposito = this.capDeposito;
        }else{
            this.comDeposito += litros;
        }
        return sobra;
    }

    public double desplazar(double km) {
        double comNecesario = km * this.consuKM;
        if (comNecesario > this.comDeposito) {
            double kmPos = this.comDeposito / this.consuKM;
            this.kmre += kmPos;
            this.total += this.comDeposito;
            this.comDeposito =0;
            System.out.println("Insuficiente, solo se ha podido recorrer: " + kmPos+ " km.");
            return kmPos;
        }else{
            this.comDeposito -= comNecesario;
            this.kmre += km;
            this.total += comNecesario;
            return km;
        }
    }

    // !Getters y settes
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapDeposito() {
        return capDeposito;
    }

    public void setCapDeposito(double capDeposito) {
        this.capDeposito = capDeposito;
    }

    public double getComDeposito() {
        return comDeposito;
    }

    public void setComDeposito(double comDeposito) {
        this.comDeposito = comDeposito;
    }

    public double getConsuKM() {
        return consuKM;
    }

    public void setConsuKM(double consuKM) {
        this.consuKM = consuKM;
    }

    public double getKmre() {
        return kmre;
    }

    public void setKmre(double kmre) {
        this.kmre = kmre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
