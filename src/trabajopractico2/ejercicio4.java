
package trabajopractico2;


import java.util.Scanner;

/**4.	Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y 
* su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento Categoría B: 15% de descuento 
* Categoría C: 20% de descuento
 * @author Ludueña Bruno
 */
public class ejercicio4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    //declaro variables
    String categoria = "categoria";
    double precio;
    
    //Ingreso de dato y bucle
    
        do {
           System.out.println("Ingrese la categoria A/B/C");
           categoria = input.nextLine();
           if (!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") &&!categoria.equalsIgnoreCase("C")){
               System.out.println("ERROR. ingrese una categoria de las opciones");   
            }
        }while (!(categoria.equalsIgnoreCase("A")) && categoria.equalsIgnoreCase("B") && categoria.equalsIgnoreCase("C"));
        
        System.out.println("Ingrese el precio del producto");
        precio = Double.parseDouble(input.nextLine());
        
    //Condicional
    
        if (categoria.equalsIgnoreCase("A")){
            System.out.println("el precio del producto es: "+ (precio*0.9) + " pesos");
        }
        else if (categoria.equalsIgnoreCase("B")){
            System.out.println("el precio del producto es: "+ (precio*0.85) + " pesos");
        }
        else if (categoria.equalsIgnoreCase("C")){
            System.out.println("el precio del producto es: "+ (precio*0.8) + " pesos");
        }
        else{
            System.out.println("Ingreso un valor que no es valido");
        }
        
           
            } 
  } 

