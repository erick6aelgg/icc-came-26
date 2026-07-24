public class BubbleSort {

    public static int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = aux;
                }
            }
        }
        return array;
    }

    public static void imprimirArreglo(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {11, 100, 221, 15, 17, 43, 72};
        System.out.println("Arreglo original");
        imprimirArreglo(numeros);

        bubbleSort(numeros);
        System.out.println("Arreglo ordenado");
        imprimirArreglo(numeros);
    }
}
