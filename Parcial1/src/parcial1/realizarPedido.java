/**
 *
 * @author Jeicob Murillo
 */

package parcial1;
import java.util.Scanner;

public class realizarPedido {
    
        public realizarPedido (){
            Scanner scanner = new Scanner(System.in);
            
            String Fuerte1 = "Pasta Bolognesa";
            String Fuerte2 = "Churrasco";
            String Fuerte3 = "Hamburguesa Veggie";
            String Acomp1 = "Ensalada Cesar";
            String Acomp2 = "Porcion de Papas Fritas";
            String Acomp3 = "Pasta Bolognesa";
            String Bebida1 = "Gaseosa Coca-Cola";
            String Bebida2 = "Jugo natural de Mora";
            String Bebida3 = "Soda de Sandia";


                System.out.println("selecciona entre los siguientes Platos fuertes: ");
                System.out.println("1. "+Fuerte1);
                System.out.println("2. "+Fuerte2);
                System.out.println("3. "+Fuerte3);
                int eleccionFuerte = scanner.nextInt();


                System.out.println("selecciona entre los siguientes Acompanamientos: ");
                System.out.println("1. "+Acomp1);
                System.out.println("2. "+Acomp2);
                System.out.println("3. "+Acomp3);
                int eleccionAcom = scanner.nextInt();
                
                System.out.println("selecciona entre las siguientes Bebidas: ");
                System.out.println("1. "+Bebida1);
                System.out.println("2. "+Bebida2);
                System.out.println("3. "+Bebida3);
                int eleccionBebida = scanner.nextInt();
     
                
           System.out.println("Su Pedido final fue el siguiente: ");
                
                if (eleccionFuerte == 1) {
                    System.out.println("Plato Fuerte: "+Fuerte1);
                }if (eleccionFuerte == 2) {
                    System.out.println("Plato Fuerte: "+Fuerte2);
                }if (eleccionFuerte == 3) {
                    System.out.println("Plato Fuerte: "+Fuerte3);
                }
                if (eleccionAcom == 1) {
                    System.out.println("Plato Fuerte: "+Acomp1);
                }if (eleccionAcom == 2) {
                    System.out.println(Fuerte2);
                    System.out.println("Plato Fuerte: "+Acomp2);
                }if (eleccionAcom == 3) {
                    System.out.println(Fuerte3);
                    System.out.println("Plato Fuerte: "+Acomp3);
                }
                if (eleccionBebida == 1) {
                    System.out.println("Plato Fuerte: "+Bebida1);
                }if (eleccionBebida == 2) {
                    System.out.println(Fuerte2);
                    System.out.println("Plato Fuerte: "+Bebida2);
                }if (eleccionBebida == 3) {
                    System.out.println(Fuerte3);
                    System.out.println("Plato Fuerte: "+Bebida3);
                }
                
        }
    }
