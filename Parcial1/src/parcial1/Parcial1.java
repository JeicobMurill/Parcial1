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
            System.out.println("\n--- Que desdea hacer a continuacion? ---");
            System.out.println("1. Ver Menu Disponible");
            System.out.println("2. Realizar Pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("                Menu del dia");
                    System.out.println("Para los Platos fuertes tenemos disponible las siguientes opciones:");
                    System.out.println("Pasta Bolognesa");
                    System.out.println("Churrasco");
                    System.out.println("Hamburguesa Veggie");
                    System.out.println("Para los Acompanantes tenemos disponible las siguientes opciones:");
                    System.out.println("Ensalada Cesar");
                    System.out.println("Porcion de Papas Fritas");
                    System.out.println("Platano Aborrajado");
                    System.out.println("Para Bebidas tenemos disponible las siguientes opciones:");
                    System.out.println("Gaseosa Coca-Cola");
                    System.out.println("Jugo natural de Mora");
                    System.out.println("Soda de Sandia");
                    break;
                case 2:
                    realizarPedido pedido = new realizarPedido();
                    break;
                case 3:
                    System.out.println("Hasta una proxima oportunidad!...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        
    
        }
    }
}
    
