package Examenes.Ev1;

public class ejercico1 {
    public static String Caracteres(String put) {
        String r = "";
        r += put.charAt(0);
        for (int i = 0; i < put.length() - 1; i++) {
            r = "*";
        }
        r += put.charAt(put.length() - 1);
        return r;
    }
}
