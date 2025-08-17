package trabajopractico2;

import java.util.Scanner;

/**7.	Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. 
* Si el usuario ingresa un número fuera de este rango, debe seguir 
* pidiéndole la nota hasta que ingrese un valor válido.
* @author Ludueña Bruno
 */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = 0;
        
        do {
           System.out.println("ingrese un numero (0-10)");
           nota =Double.parseDouble(input.nextLine());
           
            if(nota > 10 || nota <0 ){
                System.out.println("ERROR. Ingrese un numero dentro del rango");
      } 
        }    while (nota > 10 || nota <0);
        
            System.out.println("la nota ingresada es:" + nota);
           
        
             }
}
