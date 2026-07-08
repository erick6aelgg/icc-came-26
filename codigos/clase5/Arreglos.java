public class Arreglos{

    public static void main(String[] args){
    
    /* Arreglos */
        /** Breve explicación
         *  {int numero, char caracter, boolean propAtom, String frase, int[] arreglo = [1,2,3,4,5]} <- Variables del programa en memoria.
         *  [numero][caracter][propAtom][frase][1][2][3][4][5] <- Como se ve la memoria
         */

        // Declaración de variables normal
        int numero;
        String cadena;

        // Podemos hacer arreglos de cualquier dato primitivo o clase de Java
        int[] numeros = new int[10]; // Espacio ocupado para este arreglo [32][32][32][32][32][32] = 32*6 bits
        String[] frutas = {"Manzana", "Uva", "Pera"}; // El arreglo se ve así: ["Manzana"]["Uva"]["Pera"]

        // Al no inicializar los valores de un arreglo de datos primitivos, sus 'espacios' se inicializan con 0
        String[] palabras = new String[3]; // Al no inicializar valores, el arreglo de una clase se ve como [null][null][null]

        // Recordatorio: Los strings son arreglos de caracteres (char).
        // Manzana = ['M'][a][n][z][a][n][a]
        // Manzana =  0    1  2  3 4  5  6

        // Los arreglos utilizan indices para recorrer sus elementos, los indices van desde [0, longitud)
        numeros[1] = 6;
        numeros[4] = 5;
        numeros[9] = Integer.MAX_VALUE;
        // El arreglo se verá así: [0][6][0][0][5][0][0][0][0][2 mil millones y cacho]

        // Los arreglos cuentan con una propiedad que nos permite conocer su longitud
        int longitud = numeros.length;

        // Podemos tener arreglos con arreglos adentro
        int[][] matriz = new int[5][6];
        
        // Tenemos el indice del arreglo y el indice de la posición dentro de dicho arreglo
        matriz[0][3] = 8;
        int numerito = matriz[0][3];

        /** Se ve así
         *     0 1 2 3  4 5  
         * 0 ([][][][8][][])
         * 1 ([][][][][][])
         * 2 ([][][][][][])
         * 3 ([][][][][][])
         * 4 ([][][][][][])
         */

        // Se pueden tener arreglos de diversas dimensiones
        int[][][][][] numerotes = new int[5][6][7][8][9];
        numerotes[0][0][0][0][0] = 17;
        System.out.println(numerotes[0][0][0][0][0]);


        // Métodos estáticos para arreglos
        System.out.println("Arreglo numeros: ");
        imprimeArreglo(numeros);

        System.out.println("Arreglo frutas: ");
        imprimeArreglo(frutas);
        int[] longFrutas = longitudes(frutas);
        imprimeArreglo(longFrutas);

    }

    /**
     * Imprime los elementos de un arreglo de int linea por linea
     * @param arreglo el arreglo a analizar
     */
    public static void imprimeArreglo(int[] arreglo){ 
        for(int i = 0; i < arreglo.length; i++){
            int elemento = arreglo[i];
            System.out.println(elemento);
        }
    }

    /**
     * Imprime los elementos de un arreglo de String linea por linea
     * @param arreglo el arreglo a analizar
     */
    public static void imprimeArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            String elemento = arreglo[i];
            System.out.println(elemento);
        }
    }

    /**
     * Dado un arreglo de String, obtiene la longitud de cada uno de sus elementos
     * y las devuelve un arreglo de int.
     * (donde la cadena y su longitud comparten el mismo indice en sus respectivos arreglos).
     * @param arreglo, el arreglo de String.
     * @return el arreglo con las longitudes.
     */
    public static int[] longitudes(String[] arreglo){
        int[] longitudes = new int[arreglo.length];
        for(int i = 0; i < arreglo.length; i++){
            String elemento = arreglo[i];
            int longitud = elemento.length();
            longitudes[i] = longitud;
        }
        return longitudes;
    }

}