import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Arbol miArbol = new Arbol();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1 - Agregar nodo al árbol");
            System.out.println("2 - Eliminar nodo");
            System.out.println("3 - Mostrar PreOrden");
            System.out.println("4 - Mostrar InOrden");
            System.out.println("5 - Mostrar PostOrden");
            System.out.println("6 - Salir");
            System.out.print("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("Opción inválida");
                sc.next();
                continue;
            }

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Número a agregar: ");
                    miArbol.agregar(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Número a eliminar: ");
                    miArbol.eliminar(sc.nextInt());
                    break;
                case 3:
                    miArbol.mostrarPreOrden();
                    break;
                case 4:
                    miArbol.mostrarInOrden();
                    break;
                case 5:
                    miArbol.mostrarPostOrden();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (op != 6);

        sc.close();
    }
}
