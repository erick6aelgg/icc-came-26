public class Arreglos{

    public static void main(String[] args){
        /* A */
    // [numero][cadena]([][][][][][][])[][][][][][][]
    int numero;
    String cadena;

    int[] numeros = new int[10];
    String[] frutas = {"Manzana", "Uva", "Pera"};

    String[] palabras = new String[3];

    // Manzana = ['M'][a][n][z][a][n][a]
    // Manzana =  0    1  2  3 4  5  6

    //System.out.println(palabras[1]);
    //System.out.println(numeros[0]);

    // [numero][cadena]([0][6][0][0][5][0][0][0][0][2 mil millones y cacho])[][][][]
    numeros[1] = 6;
    numeros[4] = 5;
    numeros[9] = Integer.MAX_VALUE;

    int longitud = numeros.length;

    int[][] matriz = new int[5][6];

    matriz[0][3] = 8;

    int numerito = matriz[0][3];

    /**   0  1 2 3  4 5  
     * 0 ([][][][8][][])
     * 1 ([][][][][][]
     * 2 ([][][][][][]
     * 3 ([][][][][][]
     * 4 ([][][][][][]
     */

    // System.out.println(numerito);

    int[] arreglito = longitudes(frutas);
    imprimeArreglo(arreglito);

    // int[][][][][] numerotes = new int[5][6][7][8][9];
    // numerotes[0][0][0][0][0] = 1;
    // System.out.println(numerotes[0][0][0][0][0]);

    }

    public static void imprimeArreglo(int[] arreglo){ 
        for(int i = 0; i < arreglo.length; i++){
            int elemento = arreglo[i];
            System.out.println(elemento);
        }
    }

    public static void imprimeArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            String elemento = arreglo[i];
            System.out.println(elemento);
        }
    }

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