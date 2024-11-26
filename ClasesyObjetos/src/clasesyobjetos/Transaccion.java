/**
 *
 * @author Jeicob Murillo y Cristian Vidal
 */

package clasesyobjetos;

import java.time.LocalDateTime;

public class Transaccion {
    private String tipo;
    private double monto;
    private LocalDateTime fecha;

    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Monto: " + monto + ", Fecha: " + fecha;
    }
}
