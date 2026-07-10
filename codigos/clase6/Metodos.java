public class Metodos {
    public static void main(String[] args) {
        System.out.println("Bienvenida a la clase de Metodos");

        // Un metodo es un bloque de codigo que tiene un nombre y que podemos reutilizar

        // los metodos estasticos se declaran de la siguiente forma
        /**
         * public static [tipo de dato] [nombreDelMetodo](Parametros){
         * // lo que hace el metodo
         *
         * // Si el tipo de dato es diferente de void, agregarmos el return al final
         * return [resultado final];
         * }
         *
         * Un método se compone de los siguientes elementos clave:
         * Modificador de acceso: Define quién puede usarlo (ej. public, private).
         * Tipo de dato: El tipo de dato que el método devolverá (ej. int, String).
         * Si no devuelve nada, se usa la palabra reservada void.
         * Nombre: El identificador del método.
         * Parámetros (opcional): Valores de entrada que el método necesita para operar.
         * Cuerpo: El bloque de código encerrado entre llaves {} donde se ejecutan las acciones.
         * **/

        miMetodo();

        miNombre("Liam", 17);
        miNombre("Daniel", 6);

        System.out.println(suma(5, 6));
        int z = suma(5, 6);
        System.out.println(z);

        int c;
        System.out.println("El valor de c es: " + (c=suma(5, 6)));

        int resultadoSuma = sumar(10);
        System.out.println(resultadoSuma);

    }

    public static void miMetodo(){
        System.out.println("Hola k hace");
    }

    public static void miNombre(String nombre, int edad){
        System.out.println(nombre + " Leon, tiene " + edad + " años");
    }

    public static int suma(int x, int y){
        return x + y;
    }

    public static int sumar(int k){
        if ( k > 0){
            return k + sumar(k -1);
            // 10 + sumar (9)
            // 9 + sumar (8)
        } else{
            return 0;
        }
    }
}
