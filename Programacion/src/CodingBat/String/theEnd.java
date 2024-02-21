package CodingBat.String;

public class theEnd {
    public static void main(String[] args) {
        System.out.println(TheEnd("hello", true));
        System.out.println(TheEnd("Hello", false));
        System.out.println(TheEnd("oh", true));
    }
    public static String TheEnd(String string, boolean front){
        if (front) {
            return string.substring(0,1);
        }
        return string.substring(string.length() -1);
    }
}
