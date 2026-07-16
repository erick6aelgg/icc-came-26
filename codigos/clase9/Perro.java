/**
 * Clase Perro
 * Características: Nombre, edad, peso, vacunas, raza...
 * Acciones: Ladrar (Sonido), ...
 */
public class Perro extends Animal{

    // Enumeración para las razas de perros.
    public enum RazaPerro{
        GOLDEN, LABRADOR, CHIUAHUA;
    }

    // Atributos de la clase Perro.
    protected RazaPerro raza;

    // Constructor de la clase Perro, se basa en el constructor de Animal y agrega otros campos.
    public Perro(String nombre, int edad, double peso, boolean vacunas, RazaPerro raza){
        super(nombre, edad, peso, vacunas);
        this.raza = raza;
    }

    // Usamos el metodo toString() implementado en Animal y agregamos información de esta clase. 
    @Override
    public String toString(){
        return super.toString() + "\nRaza: " + this.raza;
    }

    // Implementación del método abstracto
    @Override
    public void sonido(){
        System.out.println("Guaf");
    }

    // Método exclusivo de la clase Perro y posibles clases hijas.
    public void ladrar(){
        System.out.println("guaf, guaf");
    }

}

// Clase Animal
//   |
//   Clase Perro
//   |
//   Clase Gato