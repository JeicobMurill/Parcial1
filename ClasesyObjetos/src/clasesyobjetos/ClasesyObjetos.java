/**
 *
 * @author Jeicob Murillo y Cristian Vidal
 */

package clasesyobjetos;

import java.util.Scanner;

public class ClasesyObjetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre y saldo inicial de la cuenta
        System.out.println("Bienvenido a su sistema bancario");
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        
        System.out.print("Ingrese el saldo inicial de la cuenta en Pesos Colombianos (COP): ");
        double saldoInicial = scanner.nextDouble();
        
        // Crear una cuenta bancaria con el saldo inicial ingresado
        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

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
                    System.out.print("Ingrese el monto a consignar en Pesos Colombianos (COP): ");
                    double montoConsignar = scanner.nextDouble();
                    cuenta.consignar(montoConsignar);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar en Pesos Colombianos (COP): ");
                    double montoRetiro = scanner.nextDouble();
                    if (cuenta.retirar(montoRetiro)) {
                        System.out.println("Retiro realizado con exito.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldo() + "COP");
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

    }
}
