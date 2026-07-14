public class Estudiante {
    
    // Características de un estudiante de la UNAM
    // Nombre, apellidos, num de cuenta
    // Edad, carrera, semestre, inscrito
    // calificaciones


    // Atributos
    private String nombre;
    private String apellidos;
    private String numDeCuenta; // Lo dejamos como String dado que no operaremos con el
    private int edad; // Por ejemplo, 18
    private String carrera; // Ejemplos: Ciencias de la computación, matemáticas, fisica, actuaria
    private int semestre; // Por ejemplo: 2, podemos hacer comparaciones > <
    private boolean inscrito; // Esta inscrito? -> true/false
    private int[] calificaciones; // No tiene tamaño asignado, puede ser incluso [10, 9, 10, 8, 10]

    // Métodos constructores
    // Constructor por omisión
    public Estudiante(){}

    // Constructor por parámetros
    public Estudiante(String nombre, String apellidos, String numDeCuenta, int edad, String carrera, int semestre, boolean inscrito, int[] calificaciones){
        System.out.println(this.nombre);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numDeCuenta = numDeCuenta;
        this.edad = edad;
        this.carrera = carrera;
        this.semestre = semestre;
        this.inscrito = inscrito;
        this.calificaciones = calificaciones;
    }

    // Métodos setters y getters
    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setNumDeCuenta(String numDeCuenta){
        this.numDeCuenta = numDeCuenta;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void setInscrito(boolean inscrito){
        this.inscrito = inscrito;
    }

    public void setCalificaciones(int[] calificaciones){
        this.calificaciones = calificaciones;
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public String getNumDeCuenta(){
        return this.numDeCuenta;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getCarrera(){
        return this.carrera;
    }

    public int getSemestre(){
        return this.semestre;
    }

    public boolean getInscrito(){
        return this.inscrito;
    }

    public int[] getCalificaciones(){
        return this.calificaciones;
    }

    // Métodos adicionales
    public static void presentarse(){
        System.out.println("Hola soy " + nombre + " " + apellidos);
    }


}