public class Perrito extends Perro{
    private boolean jugueton;

    public Perrito(String nombre, int edad, double peso, boolean vacunas,
    RazaPerro raza, boolean jugueton){
        // Llamar a constructor de perro
        super(nombre, edad, peso, vacunas, raza);
        this.jugueton = jugueton;
    }

    @Override
    public String toString(){
        return super.toString() + "\nEs jugueton?: " + this.jugueton;
    }

    @Override
    public void sonido(){
        System.out.println("Guaf pequeñito");
    }
}
