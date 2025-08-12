package trabajopractico2;

import java.util.Scanner;

/*
@author Ludueña Bruno
1.Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
*/
public class TrabajoPractico2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int anio;                                                                 //definicion de variable entera
        
       System.out.println("Ingrese el anio para saber si es o no bisiesto");     //ingreso de datos
       anio = Integer.parseInt(input.nextLine());
        
       if ((anio % 4 == 0 && anio % 100 != 0) ||(anio % 400 == 0)){
           System.out.println("El anio es bisiesto");
       }else{
           System.out.println("El anio no es bisiesto");
       }
    }
} 
