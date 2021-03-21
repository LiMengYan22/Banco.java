import java.util.*;
public class banco {
    public static void main(String[] args) {
      
                // programa que muestra el nombre y el capital del cliente que más gana
        Scanner sc = new Scanner(System.in);
      
                // creamos los arrays
        String[] clientes = new String[5];
        double[] capital = new double[5];
      
                // variables donde guardar el nombre y capital del cliente que más gana
        String nombreMayor;
        double mayorCapital;
 
        int i = 0;
 
                // se lee el primer cliente
        System.out.println("Lectura de nombres y capital de clientes: ");
        System.out.print("Cliente " + (i + 1) + ": ");
        clientes[i] = sc.nextLine();
        System.out.print("Capital: ");
        capital[i] = sc.nextDouble();
 
                // se toma el primero como mayor
        mayorCapital = capital[i];
        nombreMayor = clientes[i];
 
                // se leen el resto de empleados
        for (i = 1; i < clientes.length; i++) {
            sc.nextLine(); // limpiar el buffer
            System.out.print("Cliente " + (i + 1) + ": ");
            clientes[i] = sc.nextLine();
            System.out.print("Capital: ");
            capital[i] = sc.nextDouble();
          
                // se compara el capitasl leído con el mayor
            if (capital[i] > mayorCapital) {
                mayorCapital = capital[i];
                nombreMayor = clientes[i];
            }
        }
                // mostrar resultados
        System.out.println("Cliente con mayor capital: " + nombreMayor);
        System.out.println("Capital: " + mayorCapital);
    }
}
