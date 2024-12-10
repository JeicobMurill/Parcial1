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
            int PrecioF1 = 25000;
            String Fuerte2 = "Churrasco";
            int PrecioF2 = 30000;
            String Fuerte3 = "Hamburguesa Veggie";
            int PrecioF3 = 35000;
            String Acomp1 = "Ensalada Cesar";
            int PrecioA1 = 15000;
            String Acomp2 = "Porcion de Papas Fritas";
            int PrecioA2 = 10000;
            String Acomp3 = "Platano Aborrajado";
            int PrecioA3 = 25000;
            String Bebida1 = "Gaseosa Coca-Cola";
            int PrecioB1 = 5000;
            String Bebida2 = "Jugo natural de Mora";
            int PrecioB2 = 7000;
            String Bebida3 = "Soda de Sandia";
            int PrecioB3 = 8000;


                System.out.println("selecciona entre los siguientes Platos fuertes: ");
                System.out.println("1. "+Fuerte1 + "  " +PrecioF1 );
                System.out.println("2. "+Fuerte2 + "  " +PrecioF2 );
                System.out.println("3. "+Fuerte3 + "  " +PrecioF3 );
                int eleccionFuerte = scanner.nextInt();


                System.out.println("selecciona entre los siguientes Acompanamientos: ");
                System.out.println("1. "+Acomp1+ "  " +PrecioA1 );
                System.out.println("2. "+Acomp2+ "  " +PrecioA2 );
                System.out.println("3. "+Acomp3+ "  " +PrecioA3 );
                int eleccionAcom = scanner.nextInt();
                
                System.out.println("selecciona entre las siguientes Bebidas: ");
                System.out.println("1. "+Bebida1+ "  " +PrecioB1 );
                System.out.println("2. "+Bebida2+ "  " +PrecioB2 );
                System.out.println("3. "+Bebida3+ "  " +PrecioB3 );
                int eleccionBebida = scanner.nextInt();
     
                
           System.out.println("Su Pedido final fue el siguiente: ");
                
                if (eleccionFuerte == 1) {
                    System.out.println("Plato Fuerte: "+Fuerte1);
                    int preciototalF = PrecioF1;
                if (eleccionFuerte == 2) {
                    System.out.println("Plato Fuerte: "+Fuerte2);
                    preciototalF = PrecioF2;
                if (eleccionFuerte == 3) {
                    System.out.println("Plato Fuerte: "+Fuerte3);
                    preciototalF = PrecioF3;
                
                if (eleccionAcom == 1) {
                    System.out.println("Plato Fuerte: "+Acomp1);
                    int preciototalA = PrecioA1;
                if (eleccionAcom == 2) {
                    System.out.println(Fuerte2);
                    System.out.println("Plato Fuerte: "+Acomp2);
                    preciototalA = PrecioA2;
                if (eleccionAcom == 3) {
                    System.out.println(Fuerte3);
                    System.out.println("Plato Fuerte: "+Acomp3);
                    preciototalA = PrecioA3;
                
                if (eleccionBebida == 1) {
                    System.out.println("Plato Fuerte: "+Bebida1);
                    int preciototalB = PrecioB1;
                if (eleccionBebida == 2) {
                    System.out.println(Fuerte2);
                    System.out.println("Plato Fuerte: "+Bebida2);
                    preciototalB = PrecioB2;
                if (eleccionBebida == 3) {
                    System.out.println(Fuerte3);
                    System.out.println("Plato Fuerte: "+Bebida3);
                    preciototalB = PrecioB3;
                    
                System.out.println("Costo Total: "+preciototalF+preciototalA+preciototalB);
                }
                }
                }
                }
                }
                }
                }
                }
                }
        }
    }
