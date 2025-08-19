/**11.	Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a.Declare e inicialice un array con los precios de algunos productos.
b.Muestre los valores originales de los precios.
c.Modifique el precio de un producto específico.
d.Muestre los valores modificados.
 * @author Ludueña Bruno
 */
public class ejercicio12 {
    public static double miVariableGlobal = 0.10;
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
         System.out.println("--------------------------------------");
        precios[2] = 129.99;
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }               
              
}  

