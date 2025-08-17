
import java.util.Scanner;

/**10.	Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
* NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, 
* y muestra el stock actualizado.
 * @author Ludueña Bruno
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual,cantidadVendida, cantidadRecibida;
//ingreso de datos
        System.out.println("Ingrese el stock actual");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la catindad vendida ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("ahora por ultimo ingrese la cantidad recibida");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
//llamado a la funcion
        int nuevoStock =actualizarStock(stockActual,cantidadVendida, cantidadRecibida);
        System.out.println("el nuevo stock es: "+nuevoStock);
         input.close();
         
    }
//funcion
public static int actualizarStock(int stockActual,int cantidadVendida, int cantidadRecibida){
    int nuevoStock = (stockActual - cantidadVendida + cantidadRecibida);
    return nuevoStock;
    
}   
}

