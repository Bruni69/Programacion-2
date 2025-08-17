package trabajopractico2;

import java.util.Scanner;

/**6.	Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y 
* cuente cuántos son positivos, negativos y cuántos son ceros.
 * @author Ludueña Bruno
 */


public class ejercicio6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int num;
        int resultadoPos  = 0;
        int resultadoNeg = 0;
        int ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero "+ (i+1)); 
            num = Integer.parseInt(input.nextLine());
            
            if (num > 0){
                resultadoPos = resultadoPos + 1;                         
            }else if (num < 0){
                resultadoNeg = resultadoNeg + 1;
            }else{
                 ceros = ceros + 1;                
            } 
                                            } 
        System.out.println("la cantidad de todos los numeros positivos es: " +resultadoPos);
        System.out.println("la suma de todos los numeros negativos es:  "+ resultadoNeg);
        System.out.println("la suma de las cantidad de ceros es: "+ceros);
            }
        }
    

