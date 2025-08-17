package trabajopractico2;

import java.util.Scanner;

/**5.	Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y 
* sume solo los números pares. El ciclo debe continuar 
* hasta que el usuario ingrese el número 0, momento en el que se debe
* mostrar la suma total de los pares ingresados.
 * @author Ludueña Bruno
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        // variable
        int num;
        int resultado = 0;
        
        //ingreso de dato inicial
        System.out.println("ingrese un numero o (0)para salir");
        num = Integer.parseInt(input.nextLine());
        
        //Condicional
        while ( num != 0){
            if (num % 2 == 0) {              //tengo en cuenta el num fuera del while
                resultado = resultado + num; //si es par se acumula
            }
            System.out.println("ingrese un numero o (0)para salir");
            num = Integer.parseInt(input.nextLine());
            
                   
        }System.out.println("la suma de todos los numero pares es: " + resultado);
        
        }              
}
