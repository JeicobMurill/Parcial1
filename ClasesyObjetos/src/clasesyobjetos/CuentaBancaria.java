/**
 *
 * @author Jeicob Murillo y Cristian Vidal
 */

package clasesyobjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private List<Transaccion> historial;

    // Comisión para las consignaciones (1%)
    private static final double COMISION_CONSIGNACION = 0.01;
    // Impuesto para los retiros (4x1000, o 0.4%)
    private static final double IMPUESTO_RETIRO = 0.004;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    // Método para consignar dinero
    public void consignar(double monto) {
        if (monto > 0) {
            double comision = monto * COMISION_CONSIGNACION;  // Comisión del 1%
            double montoFinal = monto - comision;  // El monto final después de la comisión
            saldo += montoFinal;
            historial.add(new Transaccion("Consignacion", monto, comision));
            System.out.println("Comision aplicada: " + comision);
            System.out.println("Monto consignado despues de comision: " + montoFinal);
        }
    }

    // Método para retirar dinero
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            double impuesto = monto * IMPUESTO_RETIRO;  // Impuesto del 4x1000
            double montoFinal = monto + impuesto;  // El monto total que se cobrará
            if (saldo >= montoFinal) {
                saldo -= montoFinal;
                historial.add(new Transaccion("Retiro", monto, impuesto));
                System.out.println("Impuesto aplicado (4x1000): " + impuesto);
                System.out.println("Monto total retirado (incluyendo impuesto): " + montoFinal);
                return true;
            } else {
                System.out.println("Fondos insuficientes para cubrir el retiro mas el impuesto.");
                return false;
            }
        } else {
            System.out.println("Monto invalido.");
            return false;
        }
    }

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para mostrar el historial de transacciones
    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            for (Transaccion t : historial) {
                System.out.println(t);
            }
        }
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
        mostrarHistorial();
    }
}
