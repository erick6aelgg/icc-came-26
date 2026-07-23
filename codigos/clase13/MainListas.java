/**
 * Clase para probar el funcionamiento de la lista.
 */
public class MainListas {

    public static void main(String[] args) {
        Lista lista = new Lista();

        /*
         * Probamos una lista vacía.
         */
        System.out.println("Lista inicial:");
        System.out.println(lista);
        System.out.println("¿Está vacía? " + lista.esVacio());
        System.out.println("Elementos: " + lista.getElementos());

        /*
         * Agregamos varios elementos.
         */
        System.out.println("\nAgregando elementos...");

        lista.agrega("Ana");
        lista.agrega("Luis");
        lista.agrega("Fernanda");
        lista.agrega("Pedro");
        lista.agrega("Luis");

        System.out.println("Lista: " + lista);
        System.out.println("Elementos: " + lista.getElementos());
        System.out.println("¿Está vacía? " + lista.esVacio());

        /*
         * Probamos el método consulta.
         */
        System.out.println("\nBuscando elementos...");

        System.out.println("¿Contiene a Fernanda? "
                + lista.consulta("Fernanda"));

        System.out.println("¿Contiene a Carlos? "
                + lista.consulta("Carlos"));

        /*
         * Eliminamos un elemento que está en medio.
         */
        System.out.println("\nEliminando a Fernanda...");

        lista.elimina("Fernanda");

        System.out.println("Lista: " + lista);
        System.out.println("Elementos: " + lista.getElementos());

        /*
         * Eliminamos la cabeza.
         */
        System.out.println("\nEliminando a Ana...");

        lista.elimina("Ana");

        System.out.println("Lista: " + lista);
        System.out.println("Elementos: " + lista.getElementos());

        System.out.println("\nEliminando a Luis...");

        /*
         * Como Luis aparece dos veces, elimina
         * solamente la primera aparición.
         */
        lista.elimina("Luis");

        System.out.println("Lista: " + lista);
        System.out.println("Elementos: " + lista.getElementos());

        /*
         * Intentamos eliminar un objeto inexistente.
         */
        System.out.println("\nIntentando eliminar a Carlos...");

        lista.elimina("Carlos");

        System.out.println("Lista: " + lista);
        System.out.println("Elementos: " + lista.getElementos());

        /*
         * Probamos el método limpia.
         */
        System.out.println("\nLimpiando la lista...");

        lista.limpia();

        System.out.println("Lista: " + lista);
        System.out.println("Elementos: " + lista.getElementos());
        System.out.println("¿Está vacía? " + lista.esVacio());
    }
}






