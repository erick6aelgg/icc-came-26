/**
 *
 * Arreglos: 
 * - Espacios determinados (fijos) int[] asd = new int[n];
 * - Corchetes [Sintaxis] 
 * - Tiene índices y se puede recorrer asd[0] asd[9]
 * - Búsqueda de elementos 
 *
 * [][][]([0][1][2][3][4][5][6])[][][]
 * ([0][1][2][3][4][5][6]) -> 
 * ([0][1][2][3][4][5][6][7][][][][][][])
 *
 * - Tamaño fijo -> no podemos agregar + elementos
 * - Tipo definido -> Elementos de un mismo tipo
 *
 * Lista:
 * - Conjunto de cosas (pueden estar ordenadas)
 * - Tamaño es dinámico (no es fijo)
 * - Busqueda en tiempo lineal
 *
 * Otras estructuras de datos:
 * - Pilas
 * - Colas
 * - Árboles -> Arboles binarios -> Completos, ordenados, AVL y Rojinegros.
 * - Gráfica 
 * - Monticulos Mínimos
 * - Conjuntos
 * - HashMaps
 *
 * Dichas estructuras de datos siguen una misma interfaz.
 *
 * Las interfaces contienen solamente metodos abstractos.
 * Bastante útiles si queremos que cierto código se pueda acomplar a un sistema.
 * Si no se implementan todos los métodos, el programa no puede compilar.
 */
/**
 * Interfaz que define las operaciones básicas
 * que debe tener una colección.
 */
public interface Coleccion {

    /**
     * Agrega un objeto a la colección.
     */
    void agrega(Object objeto);

    /**
     * Elimina la primera aparición del objeto.
     */
    void elimina(Object objeto);

    /**
     * Verifica si el objeto existe en la colección.
     */
    boolean consulta(Object objeto);

    /**
     * Verifica si la colección está vacía.
     */
    boolean esVacio();

    /**
     * Regresa la cantidad de elementos almacenados.
     */
    int getElementos();

    /**
     * Elimina todos los elementos de la colección.
     */
    void limpia();
}