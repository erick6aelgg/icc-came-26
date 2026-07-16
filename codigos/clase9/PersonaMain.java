public class PersonaMain {
    public static void main(String[] args) {
        Persona persona = new Persona("Cassy Leon");
        System.out.println(persona);
        persona.setNombre("Luis Leon");
        System.out.println(persona);
        System.out.println(persona.getNombre());

        //persona.nombre = "Joel Leon"; No funciona porque el atributo es privado en la clase Persona
    }
}
