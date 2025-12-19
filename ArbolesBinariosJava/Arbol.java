public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private Nodo agregarRecursivo(Nodo actual, int numero) {
        if (actual == null) {
            return new Nodo(numero);
        }

        if (numero == actual.valor) {
            System.out.println("El número ya existe en el árbol");
            return actual;
        }

        if (numero < actual.valor) {
            actual.izquierda = agregarRecursivo(actual.izquierda, numero);
        } else {
            actual.derecha = agregarRecursivo(actual.derecha, numero);
        }

        return actual;
    }

    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo actual, int numero) {
        if (actual == null) {
            System.out.println("El número no se encuentra en el árbol.");
            return null;
        }

        if (numero < actual.valor) {
            actual.izquierda = eliminarRecursivo(actual.izquierda, numero);
        } else if (numero > actual.valor) {
            actual.derecha = eliminarRecursivo(actual.derecha, numero);
        } else {
            if (actual.izquierda == null && actual.derecha == null) {
                return null;
            }
            if (actual.izquierda == null) {
                return actual.derecha;
            }
            if (actual.derecha == null) {
                return actual.izquierda;
            }

            Nodo sucesor = encontrarMinimo(actual.derecha);
            actual.valor = sucesor.valor;
            actual.derecha = eliminarRecursivo(actual.derecha, sucesor.valor);
        }

        return actual;
    }

    private Nodo encontrarMinimo(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    public void mostrarPreOrden() {
        preOrden(raiz);
        System.out.println();
    }

    private void preOrden(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.valor + " ");
        preOrden(nodo.izquierda);
        preOrden(nodo.derecha);
    }

    public void mostrarInOrden() {
        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(Nodo nodo) {
        if (nodo == null) return;
        inOrden(nodo.izquierda);
        System.out.print(nodo.valor + " ");
        inOrden(nodo.derecha);
    }

    public void mostrarPostOrden() {
        postOrden(raiz);
        System.out.println();
    }

    private void postOrden(Nodo nodo) {
        if (nodo == null) return;
        postOrden(nodo.izquierda);
        postOrden(nodo.derecha);
        System.out.print(nodo.valor + " ");
    }
}
