/**
 * Clase abstracta Animal
 *  
 * Usamos esta clase como padre de otras clases.
 * Al ser una clase abstracta no se puede instanciar.
 */ 
public abstract class Animal{
    String nombre;
    int edad;
    double peso;
    boolean vacunas;

    // Constructor de la clase Animal.
    // lL ser abstracta no se puede instanciar pero sirve como base para constructores de clases hijas.
    public Animal(String nombre, int edad, double peso, boolean vacunas){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
    }

    // Método toString() con implementación base.
    public String toString(){
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nPeso: " + peso + "\n¿Esta vacunado?: " + vacunas;
    }

    // Lo métodos abstractos son métodos que se deben implementar en clases hijas
    // (Si la clase hija también es abstracta, no hace falta implementarla ahí)
    public abstract void sonido();

}