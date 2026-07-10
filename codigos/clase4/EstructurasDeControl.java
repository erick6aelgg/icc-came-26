public class EstructurasDeControl {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la clase de Estructuras de Control\n");
        // Las estructuras de control nos permiten decidir que caminar tomara el programa
        // Como hace rque el programa tome deciones correctas o repita instrucciones

        /**
         * 1 Estructura If
         * Nos ayuda a controlar el flujo del progama
         * Todo if necesita una condicion que resulte en true o false, es decir, los ifs funcionan con valores
         * booleanos
         * **/

        System.out.println("IF");
        boolean estaLloviendo = true;

        if(estaLloviendo == true){
            System.out.println("Saca el paraguas para caminar en la calle");
        } else {
            System.out.println("Puedes caminar en la calle sin mojarte");
        }

        // podemos usar operadores de comparacion < >, <=, ==, !=

        if (20 > 18){
            System.out.println("20 es mayor que 18\n");
        }

        /**
         * Estructura Switch
         * En vez de escribir muchos if else, podemos usar el switch
         * Selecciona un codigo de bloque para ejecutar
         *
         * switch(expresion){
         *    case x:
         *     //bloque de codigo
         *      break;
         *    case y:
         *    //bloque de codigo
         *      break;
         *    default:
         *     //bloque de codigo
         *
         * }
         *
         * **/

        System.out.println("SWITCH");
        int dia = 1;
        switch(dia){
            case 1:
                System.out.println("Lunes\n");
                break;
            case 2:
                System.out.println("Martes\n");
                break;
            case 3:
                System.out.printf("Miercoles\n");
                break;
            default:
                System.out.println("Dia no encontrado\n");
                break;
        }

        /**
         * Estructura While
         * Evalua una condicion y repite el ciclo hasta que la condicion deje de ser verdadera
         *
         * while(condicion){
         *     //Bloque de codigo a ejecutar
         *
         * }
         *
         * **/
        System.out.println("While");
        int i = 5;
        while(i > 0){
            System.out.println(i);
            //i = i + 1;
            i--;
        }
        System.out.println("\n");

        /**
         * Estructura Do-While
         * Hace lo mismo que el while, solo que ejectua el codigo una vez y luego evalua la condicion
         *
         * do{
         *     //Bloque de codigo a ejecutar
         *
         * } while(condicion);
         *
         * **/
        System.out.println("Do while");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        } while(j < 5);
        System.out.println("\n");
        /**
         * for (int i = 0, i < 5, i++){
         *     // bloque de codigo
         * }
         * for (variale, condicion, detener){
         *      *     // bloque de codigo
         *      * }
         * **/

        System.out.println("FOR");
        for(int k = 0; k < 5; k++){
            System.out.println(k);
        }

        System.out.println("Numeros pares del 1 al 10");
        // Imprime numeros pares del 1 al 10
        for(int l = 0; l <= 10; l = l + 2){
            System.out.println(l);
        }
    }



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
     * Tipo de retorno: El tipo de dato que el método devolverá (ej. int, String).
     * Si no devuelve nada, se usa la palabra reservada void.
     * Nombre: El identificador del método.
     * Parámetros (opcional): Valores de entrada que el método necesita para operar.
     * Cuerpo: El bloque de código encerrado entre llaves {} donde se ejecutan las acciones.
     * **/
}
