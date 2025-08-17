package trabajopractico2;

import java.util.Scanner;

/**3.	Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y 
* clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto" 60 años o más: "Adulto mayor" 
  * @author Ludueña Bruno
 */
public class ejercicio3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int edad;       //Variable establecida
                    //Ingreso de datos
        System.out.println("Ingrese su edad y le dire a que grupo etareo pertenece");
        edad = Integer.parseInt(input.nextLine());
        
                    //Condicionales y salida de datos
        if(edad< 12){
            System.out.println("la edad de "+edad+" corresponde a un niño ");
        } else if (edad > 12 && edad <= 17){
            System.out.println("la edad de "+edad+" orresponde a un adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("la edad de "+edad+"corresponde a un adulto");
        } else {
            System.out.println("la edad de "+edad+"corresponde a un adulto mayor");
        }                            
    
    }
}
   
    

