package ClaseyObjetos.EJEMPLO;


//!El objeto de persona
public class Persona {
    
    //!Estos son los objetos de persona
    int num;
    String nombre;
    int edad;

    public Persona(int num, String nombre, int edad) {
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }

    //!Getters y Settes
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
