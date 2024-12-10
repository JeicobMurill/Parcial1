/**
 *
 * @author Jeicob Murillo
 */

package parcial1;

import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                Bienvenido al Restaurante UNAL");

        boolean salir = false;
        while (!salir) {
            // Menú de opciones
            System.out.println("\n--- ¿Que desea hacer a continuacion? ---");
            System.out.println("1. Ver Menu Disponible");
            System.out.println("2. Realizar Pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenu();
                    break;
                case 2:
                    realizarPedido pedido = new realizarPedido();
                    pedido.tomarPedido();
                    break;
                case 3:
                    System.out.println("¡Hasta una proxima oportunidad!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion inválida. Intente nuevamente.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n                Menu del Día");
        System.out.println("Platos Fuertes:");
        System.out.println("1. Pasta Bolognesa - $25,000");
        System.out.println("2. Churrasco - $30,000");
        System.out.println("3. Hamburguesa Veggie - $35,000");
        System.out.println("Acompanantes:");
        System.out.println("1. Ensalada Cesar - $15,000");
        System.out.println("2. Porcion de Papas Fritas - $10,000");
        System.out.println("3. Platano Aborrajado - $25,000");
        System.out.println("Bebidas:");
        System.out.println("1. Gaseosa Coca-Cola - $5,000");
        System.out.println("2. Jugo Natural de Mora - $7,000");
        System.out.println("3. Soda de Sandia - $8,000");
    }
}
