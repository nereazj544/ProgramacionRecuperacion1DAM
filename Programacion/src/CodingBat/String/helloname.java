package CodingBat.String;

/*
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
public class helloname {
   
     public static void main(String[] args) {
         System.out.println(helloName("bob"));
         System.out.println(helloName("Alice"));
         System.out.println(helloName("X"));
         
        }
        
        public static String helloName (String name){
            return "Hola " + name + "!";
        }

  
}
