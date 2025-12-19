using ArbolesBinariosEjem;

Árbol miarbol = new Árbol();
int op;
do
{
    Console.WriteLine("=====MENU PRINCIPAL=====");
    Console.WriteLine("1-agregar nodo a la arbol");
    Console.WriteLine("2-eliminar un nodo");
    Console.WriteLine("3-mostrar el árbol en PreOrden");
    Console.WriteLine("4-mostrar el árbol en InOrden");
    Console.WriteLine("5-mostrar el árbol en PostOrden");
    Console.WriteLine("6-salir del menú");
    Console.WriteLine("Selecciona una opción (1-6): ");
    if (!int.TryParse(Console.ReadLine(), out op))
    {
        Console.WriteLine("opción no valida");
        continue;
    }

    switch (op)
    {
        case 1:
            Console.Clear();
            Console.WriteLine("que numero quieres agregar al árbol");
            if (!int.TryParse(Console.ReadLine(), out int numero))
            {
                Console.WriteLine("Número inválido. Intenta nuevamente.");
                break;
            }

            miarbol.Agregar(numero);
            Console.WriteLine("numero agregado correctamente");
            Console.WriteLine("enter para continuar");
            Console.ReadKey();
            Console.Clear();

        break;

        case 2:
            Console.Clear();
            Console.WriteLine("que numero quieres eliminar del árbol");
            if (!int.TryParse(Console.ReadLine(), out int numeroE))
            {
                Console.WriteLine("Número inválido. Intenta nuevamente.");
                break;
            }

            miarbol.Eliminar(numeroE);
            Console.WriteLine("numero eliminado correctamente");
            Console.WriteLine("enter para continuar");
            Console.ReadKey();
            Console.Clear();
            break;

        case 3:
            Console.Clear();
            Console.WriteLine("árbol en PreOrden");
            miarbol.MostrarPreOrden();
            Console.WriteLine("enter para continuar");
            Console.ReadKey();
            Console.Clear();
        break;

        case 4:
            Console.Clear();
            Console.WriteLine("árbol en InOrden");
            miarbol.MostrarInOrden();
            Console.WriteLine("enter para continuar");
            Console.ReadKey();
            Console.Clear();
        break;

        case 5:
            Console.Clear();
            Console.WriteLine("árbol en PostOrden");
            miarbol.MostrarPostOrden();
            Console.WriteLine("enter para continuar");
            Console.ReadKey();
            Console.Clear();
        break;
            
        case 6:
            Console.Clear();
            Console.WriteLine("Saliendo...");
            Console.ReadKey();
            Console.Clear();
        break;

        default:
            Console.WriteLine("Opción no válida.");
        break;
    }

} while (op != 6);