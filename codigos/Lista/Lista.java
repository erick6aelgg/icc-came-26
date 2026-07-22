
// De momento no imlementa la interfaz para evitar errores de compilación
public class Lista implements Coleccion{

    /** Lista -> Cjto. de nodos.
     *  
     * Definición recursiva de lista: () / Un elemento "a" de tipo "A" seguido de otra lista. 
     * 
     * Lista:
     * ([cabeza] elemento) <-> (otro elemento) <-> ([rabo])
     * longitud
     * 
     * Nodos:
     * elemento
     * siguiente
     * anterior
     * 
     * Lista:
     * Nodo cabeza
     * Nodo rabo
     * longitud
     * 
     * 
     */ 


    /**
     *  <- (elemento) ->
     * 
     * [][][][][][][]([cabeza] -----0)[][][]][][](0---->)
     */
    private class Nodo{

        Object elemento;
        Nodo siguiente; // null
        Nodo anterior; // null

        Nodo(Object elemento){
            this.elemento = elemento;
        }

    }

    private Nodo cabeza; // Primer nodo de la lista, en una lista vacía -> apunta a null, anterior == null
    private Nodo rabo; // Último nodo de la lista, siguiente == null
    private int longitud; // Cantidad de nodos

    // Agregamos un nuevo elemento al final de la lista
    @Override
    public void agrega(Object objeto){

        Nodo node = new(objeto);
        longitud++;

        if(cabeza == null){
            cabeza = node;
            rabo = node;
            return;
        }

        // Buscar el rabo
        // Realizar conexion
        rabo.siguiente = node;
        node.anterior = rabo;
        rabo = node;
    }

    // Dado un objeto, se verifica que este exista en la lista.
    @Override
    public boolean consulta(Object objeto){
        Node dummy = cabeza;

        while(dummy == null){
            if(dummy.elemento.equals(objeto))
                return true;

            dummy = dummy.siguiente;
        }

        return false;
    }

    // Se implementará posteriormente
    @Override
    public void elimina(){}

    // Se implementará posteriormente
    @Override
    public boolean esVacio(){
        return false;
    }

    // Cantidad de elementos almacenados
    @Override
    public int getElementos(){
        return longitud;
    }

    // Vaciamos la estructura de datos
    // En java basta con quitar las referencias por el recolector de basura
    @Override
    public void limpia(){
        cabeza = null;
        rabo = null;
        longitud = 0;
    }


}