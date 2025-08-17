package trabajopractico2;

import java.util.Scanner;
import static trabajopractico2.ejercicio8.calcularPrecioFinal;

/**8.	Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) 
* que calcule el precio final de un producto en un e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
* PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y 
* el porcentaje de descuento, llama al método y muestra el precio final.
 * @author Ludueña Bruno
 */
public class ejercicio8 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         //declaro variables
        double precio, impuesto, descuento;
        
        //ingreso de datos
        System.out.println("Ingrese el precio del producto ");
        precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el impuesto del producto ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el descuento del producto ");
        descuento = Double.parseDouble(input.nextLine());
        
        //llamado a la funcion
        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        System.out.print("El precio final del producto es: "+ precioFinal);
    }
    // funcion
    public static double calcularPrecioFinal(double precio, double impuesto, double descuento) {
        double resultado = precio + (precio * impuesto/100) - (precio * descuento/100);
        return resultado;
    }
    }   

