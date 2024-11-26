
package clasesyobjetos;

/**
 *
 * @author Jeicob Murillo y Cristian Vidal
 */


import java.util.Scanner;

public class ClasesyObjetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta bancaria con un saldo inicial de 1000
        System.out.println("Bienvenido a su sistema bancario");
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(titular, 1000.0);

        boolean salir = false;
        while (!salir) {
            // Menú de opciones
            System.out.println("\n--- Menu de operaciones ---");
            System.out.println("1. Consignar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Ver historial de transacciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a consignar: ");
                    double montoConsignar = scanner.nextDouble();
                    cuenta.consignar(montoConsignar);
                    System.out.println("Dinero consignado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (cuenta.retirar(montoRetiro)) {
                        System.out.println("Retiro realizado con exito.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 4:
                    cuenta.mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro sistema bancario.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
