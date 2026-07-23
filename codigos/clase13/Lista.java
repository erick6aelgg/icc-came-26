/**
 * Implementación de una lista doblemente ligada.
 *
 * Cada nodo guarda:
 * - Un elemento.
 * - Una referencia al nodo siguiente.
 * - Una referencia al nodo anterior.
 *
 * Ejemplo:
 *
 * null <- [Ana] <-> [Luis] <-> [Fernanda] -> null
 *           ↑                              ↑
 *        cabeza                          rabo
 */
public class Lista implements Coleccion {

    /**
     * Clase interna que representa un nodo de la lista.
     */
    private class Nodo {

        Object elemento;
        Nodo siguiente;
        Nodo anterior;

        /**
         * Construye un nodo con un elemento.
         *
         * @param elemento objeto almacenado en el nodo.
         */
        Nodo(Object elemento) {
            this.elemento = elemento;
        }
    }

    /**
     * Primer nodo de la lista.
     */
    private Nodo cabeza;

    /**
     * Último nodo de la lista.
     */
    private Nodo rabo;

    /**
     * Cantidad de elementos almacenados.
     */
    private int longitud;

    /**
     * Agrega un objeto al final de la lista.
     *
     * @param objeto objeto que se agregará.
     */
    @Override
    public void agrega(Object objeto) {
        Nodo nuevo = new Nodo(objeto);

        /*
         * Caso 1:
         * La lista está vacía.
         *
         * El nuevo nodo será cabeza y rabo.
         */
        if (esVacio()) {
            cabeza = nuevo;
            rabo = nuevo;
        } else {
            /*
             * Caso 2:
             * La lista ya tiene elementos.
             *
             * Conectamos el nuevo nodo después del rabo.
             */
            rabo.siguiente = nuevo;
            nuevo.anterior = rabo;
            rabo = nuevo;
        }

        longitud++;
    }

    /**
     * Verifica si un objeto existe dentro de la lista.
     *
     * @param objeto objeto que se buscará.
     * @return true si existe, false en otro caso.
     */
    @Override
    public boolean consulta(Object objeto) {
        Nodo actual = cabeza;

        /*
         * Recorremos la lista desde la cabeza
         * hasta llegar al final.
         */
        while (actual != null) {
            if (sonIguales(actual.elemento, objeto)) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    /**
     * Elimina la primera aparición del objeto.
     *
     * Si el objeto no existe, la lista no cambia.
     *
     * @param objeto objeto que se eliminará.
     */
    @Override
    public void elimina(Object objeto) {
        Nodo actual = cabeza;

        /*
         * Primero buscamos el nodo que contiene
         * el objeto que queremos eliminar.
         */

        while(actual != null){
            if(sonIguales(actual.elemento, objeto)) {
                eliminaNodo(actual);
                return;
            }

            actual = actual.siguiente;

        }

    }

    /**
     * Elimina un nodo específico de la lista.
     *
     * @param nodo nodo que será eliminado.
     */
    private void eliminaNodo(Nodo nodo) {

        /*
         * Caso 1:
         * La lista solamente tiene un nodo.
         */

        /*
         * Caso 1: único nodo
         *
         *             cabeza
         *                |
         *                v
         * null <- [ elemento ] -> null
         *                ^
         *                |
         *               rabo
         *
         * Después:
         *
         * cabeza -> null
         * rabo   -> null
         */

        if(cabeza == rabo){
            cabeza = null;
            rabo = null;
        }

        /*
         * Caso 2:
         * El nodo es la cabeza.
         */

        /*
         * Caso 2: eliminar la cabeza
         *
         * Antes:
         *
         * cabeza
         *    |
         *    v
         * [ A ] <-> [ B ] <-> [ C ]
         *                       ^
         *                       |
         *                      rabo
         *
         * Eliminamos A.
         *
         * Después:
         *
         *          cabeza
         *             |
         *             v
         * null <- [ B ] <-> [ C ]
         *                       ^
         *                       |
         *                      rabo
         *
         * B se convierte en la nueva cabeza.
         * Su referencia anterior debe ser null.
         */
        else if (nodo == cabeza){
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        }

        /*
         * Caso 3:
         * El nodo es el rabo.
         */
        /*
         * Caso 3: eliminar el rabo
         *
         * Antes:
         *
         * cabeza
         *    |
         *    v
         * [ A ] <-> [ B ] <-> [ C ]
         *                       ^
         *                       |
         *                      rabo
         *
         * Eliminamos C.
         *
         * Después:
         *
         * cabeza
         *    |
         *    v
         * [ A ] <-> [ B ] -> null
         *             ^
         *             |
         *            rabo
         *
         * B se convierte en el nuevo rabo.
         * Su referencia siguiente debe ser null.
         */

        else if (nodo == rabo){
            rabo = rabo.anterior;
            rabo.siguiente = null;
        }

        /*
         * Caso 4:
         * El nodo está en medio.
         */

        /*
         * Caso 4: eliminar un nodo intermedio
         *
         * Antes:
         *
         * [ A ] <-> [ B ] <-> [ C ]
         *             ^
         *             |
         *           eliminar
         *
         * A.siguiente apunta a B.
         * C.anterior apunta a B.
         *
         * Después:
         *
         * [ A ] <----------> [ C ]
         *
         * A.siguiente apunta a C.
         * C.anterior apunta a A.
         */

        else{
            nodo.anterior.siguiente = nodo.siguiente;
            nodo.siguiente.anterior = nodo.anterior;
        }

        longitud--;
    }

    /**
     * Compara dos objetos, incluyendo el caso null.
     *
     * @param objeto1 primer objeto.
     * @param objeto2 segundo objeto.
     * @return true si son iguales.
     */
    private boolean sonIguales(Object objeto1, Object objeto2) {
        if(objeto1 == null) {
            return objeto2 == null;
        }
        return objeto1.equals(objeto2);
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si no tiene elementos.
     */
    @Override
    public boolean esVacio() {
        return longitud == 0;
    }

    /**
     * Regresa la cantidad de elementos.
     *
     * @return longitud de la lista.
     */
    @Override
    public int getElementos() {
        return longitud;
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    @Override
    public void limpia() {
        /*
         * Al quitar las referencias a la cabeza y al rabo,
         * los nodos quedan disponibles para el recolector
         * de basura de Java.
         */
        cabeza = null;
        rabo = null;
        longitud = 0;
    }

    /**
     * Regresa una representación de la lista.
     *
     * Ejemplo:
     * [Ana, Luis, Fernanda]
     *
     * @return lista convertida a texto.
     */
    @Override
    public String toString() {
        String resultado = "[";
        Nodo actual = cabeza;

        while (actual != null) {
            resultado += String.valueOf(actual.elemento);

            if (actual.siguiente != null) {
                resultado += ", ";
            }

            actual = actual.siguiente;
        }

        resultado += "]";

        return resultado;
    }
}