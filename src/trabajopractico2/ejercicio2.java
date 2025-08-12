
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author ludueña bruno
 */
/*2.Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y 
determine cuál es el mayor.*/

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("ingrese el primer numero de tres para evaluar cual es el mayor");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("ingrese el segundo numero de tres ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("ingrese el tercer numero");
        num3 = Integer.parseInt(input.nextLine());
        
        if(num1 > num2 && num1 > num3){
            System.out.println("El numero " + num1+ " es el mayor"); 
        } else if (num2 > num3 && num2 > num1){
            System.out.println("El numero " + num2+ " es el mayor");
        } else { 
            System.out.println("El numero " + num3+ " es el mayor");
        } 
    }
}   

