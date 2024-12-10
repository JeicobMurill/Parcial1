package parcial1;

import java.util.Scanner;

public class realizarPedido {

    // Datos del menú
    private final String[] platosFuertes = {"Pasta Bolognesa", "Churrasco", "Hamburguesa Veggie"};
    private final int[] preciosFuertes = {25000, 30000, 35000};
    private final String[] acompanantes = {"Ensalada Cesar", "Porcion de Papas Fritas", "Platano Aborrajado"};
    private final int[] preciosAcompanantes = {15000, 10000, 25000};
    private final String[] bebidas = {"Gaseosa Coca-Cola", "Jugo Natural de Mora", "Soda de Sandia"};
    private final int[] preciosBebidas = {5000, 7000, 8000};

    public void tomarPedido() {
        Scanner scanner = new Scanner(System.in);

        // Selección de Plato Fuerte
        System.out.println("Seleccione un Plato Fuerte:");
        for (int i = 0; i < platosFuertes.length; i++) {
            System.out.println((i + 1) + ". " + platosFuertes[i] + " - $" + preciosFuertes[i]);
        }
        int eleccionFuerte = scanner.nextInt() - 1;

        // Selección de Acompañante
        System.out.println("Seleccione un Acompanante:");
        for (int i = 0; i < acompanantes.length; i++) {
            System.out.println((i + 1) + ". " + acompanantes[i] + " - $" + preciosAcompanantes[i]);
        }
        int eleccionAcom = scanner.nextInt() - 1;

        // Selección de Bebida
        System.out.println("Seleccione una Bebida:");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println((i + 1) + ". " + bebidas[i] + " - $" + preciosBebidas[i]);
        }
        int eleccionBebida = scanner.nextInt() - 1;

        // Mostrar resumen y calcular el costo total
        int costoTotal = preciosFuertes[eleccionFuerte] + preciosAcompanantes[eleccionAcom] + preciosBebidas[eleccionBebida];

        System.out.println("\nSu Pedido Final es:");
        System.out.println("Plato Fuerte: " + platosFuertes[eleccionFuerte]);
        System.out.println("Acompanante: " + acompanantes[eleccionAcom]);
        System.out.println("Bebida: " + bebidas[eleccionBebida]);
        System.out.println("Costo Total: $" + costoTotal);
    }
}
