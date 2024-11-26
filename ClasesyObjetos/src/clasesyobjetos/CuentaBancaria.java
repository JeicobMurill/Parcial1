/**
 *
 * @author Jeicob Murillo y Cristian Vidal
 */

package clasesyobjetos;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private List<Transaccion> historial;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            historial.add(new Transaccion("Consignacion", monto));
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            historial.add(new Transaccion("Retiro", monto));
            return true;
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            for (Transaccion t : historial) {
                System.out.println(t);
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
        mostrarHistorial();
    }
}
