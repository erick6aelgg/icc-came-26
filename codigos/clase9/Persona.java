public class Persona {
    private String nombre; // Private = acceso restringido

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //Getter
    // Regresa el valor de la variable nombre
    public String getNombre(){
        return nombre;
    }

    //Setter
    //Toma un parametro (name) y se lo asigna a nombre
    public void setNombre(String name){
        this.nombre = name;
    }

    @Override
    public String toString(){
        return "\nNombre: " + this.nombre;
    }
}
