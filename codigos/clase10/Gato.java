/***
 * Clase Gato que hererda de Animal
 * */
public class Gato extends Animal{
    public enum RazaGato{
        NARANJA, BLANCO, BICOLOR
    }

    protected RazaGato raza;

    public Gato(String nombre, int edad, double peso, boolean vacunas,  RazaGato raza){
        //Llama directamente al constructor de Animal
        super(nombre, edad, peso, vacunas);
        this.raza = raza;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRaza: " + this.raza;
    }

    // Implementación del método abstracto
    @Override
    public void sonido(){
        System.out.println("Miau");
    }

    // Método exclusivo de la clase Perro y posibles clases hijas.
    public void maullar(){
        System.out.println("Miau, miau");
    }
}
