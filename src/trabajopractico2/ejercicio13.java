package trabajopractico2;

/**Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
 *
 * @author Ludueña Bruno
 */
public class ejercicio13 {
   public static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99}; 
   public static void main(String[] args) {
        System.out.println("lista de precios original");
        mostrarPrecios(0); //recursion a partir del indice 0
        precios[2] = 129.99;
        System.out.println("lista de precios actualizada");
        mostrarPrecios(0); //recursion a partir del indice 0
         }
  public static double mostrarPrecios(int indice){
        if (indice < precios.length){
            System.out.println("PRECIO EN POSICION"+indice+":"+precios[indice]);
            mostrarPrecios(indice + 1);
        }
       return 0;
    }
}    

    
