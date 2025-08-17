package trabajopractico2;

/**9.	Composición de funciones para calcular costo de envío y total de compra.
a.	calcularCostoEnvio(double peso, String zona): Calcula el costo de envío 
* basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
Nacional: $5 por kg Internacional: $10 por kg
b.	calcularTotalCompra(double precioProducto, double costoEnvio): 
* Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y 
* el precio del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:

 *
 * @author Ludueña Bruno
 */
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, peso;
        String zonaEnvio;
        
        System.out.println("para saber el costo total de su compra ingrese el precio del producto");
        precio = Double.parseDouble(input.nextLine());

        System.out.println("ingrese el peso del paquete");
        peso = Double.parseDouble(input.nextLine());

        System.out.println("ahora ingrese la zona de envio (nacional/internacional)");    
        zonaEnvio = input.nextLine().toLowerCase();
        
//llamado a funciones
    double costo =calcularCostoEnvio(0,peso, zonaEnvio);
    double totalCompra = calcularTotalCompra(precio, costo);
        System.out.println("El costo del envio es: "+ costo);
        System.out.println("el valor total de la compra (producto + envio), es:  "+ totalCompra);
    input.close();
    }
//funciones
public static double calcularCostoEnvio(double costoEnvio,double peso, 
    String zonaEnvio){
    
    if (zonaEnvio.equals("nacional")){
        costoEnvio = (peso*5);        
}   else if (zonaEnvio.equals("internacional")){
        costoEnvio = (peso*10);
}   else{
        System.out.println("el destino se ingreso de manera erronea. Ingrese nacional o internacional");
        costoEnvio = 0;
        }
        return costoEnvio;
}
public static double calcularTotalCompra(double precio,double costoEnvio){
 
    return precio+costoEnvio;

}
}