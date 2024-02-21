package EjercicosBasicos;

import java.text.DecimalFormat;

public class Ejercico2 {
    public static void main(String[] args) {
        double a = 1234.0;
        double b = 532.0;
        double c = a / b;

        DecimalFormat DecimalFormat = new DecimalFormat("0.000000000000000"); //Segun se va aumentando los ceros se van poniendo más decimales.

        String resultado = DecimalFormat.format(c);
        System.out.println("nº a = " + a + " nº b = " + b + ". \n Si lo dividimos el numero seria: " + resultado);
    }
}
