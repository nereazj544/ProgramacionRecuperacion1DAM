package ExamenesAntiguos.segundaevaluacion;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    String matricula;
    private static final double PrecioB = 50;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public abstract double getPrecioAlquiler(int dias);

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static double getPreciob() {
        return PrecioB;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + "]";
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.matricula.compareTo(o.matricula);
    }

    protected double getPreciob(int dias) {
        return PrecioB * dias;
    }

}
