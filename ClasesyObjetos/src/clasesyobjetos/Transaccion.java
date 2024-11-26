/**
 *
 * @author Jeicob Murillo y Cristian Vidal
 */

package clasesyobjetos;

import java.time.LocalDateTime;

public class Transaccion {
    private String tipo;    // Tipo de transacción (consignación, retiro, etc.)
    private double monto;   // Monto de la transacción
    private double comision; // Comisión aplicada
    private LocalDateTime fecha; // Fecha y hora de la transacción

    // Constructor actualizado para aceptar el tipo de transacción, monto y comisión
    public Transaccion(String tipo, double monto, double comision) {
        this.tipo = tipo;
        this.monto = monto;
        this.comision = comision;
        this.fecha = LocalDateTime.now();  // La fecha y hora se asignan automáticamente al momento de la transacción
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Monto: " + monto + ", Comisión: " + comision + ", Fecha: " + fecha;
    }
}

