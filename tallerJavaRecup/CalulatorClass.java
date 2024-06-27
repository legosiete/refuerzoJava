
package parquesoft.javauno;

import java.time.temporal.Temporal;
import java.util.Scanner;
/**
 *
 * @author edwin andres gonzalez romero
 * DDS-C25 (2024-4)
 * PROGRAMACION EN JAVA 1
 * 
 */
public class CalulatorClass {
    /**
     * Codigo para hacer operaciones basicas entre dos cifras;
     */
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        
        boolean continuo = true;
        System.out.println("Esta calculadora puede sumar, multiplicar, dividir dos numeros");
        System.out.println();
        System.out.println();
        
        do {            
            System.out.println("Ingresa un número:  ");
            double numb1=input.nextDouble();
        
            System.out.println("Ingresa un segundo número:  ");
            double numb2=input.nextDouble();
            
            System.out.println("----------------------------");
            System.out.println("-Selecciona una operación-");
            System.out.println("1. -Sumar- ");
            System.out.println("2. -Restar- ");
            System.out.println("3. -Multiplicar- ");
            System.out.println("4. -División- ");
            
            int operando = input.nextInt();
            double respuesta = 0;
            
            
            switch (operando) {
                
                case 1:
                    respuesta = (numb1 + numb2);
                    break;
                case 2:
                    respuesta = (numb1 - numb2);
                    break;
                case 3:
                    respuesta = (numb1 * numb2);
                    break;
                case 4:
                    respuesta = (numb1 / numb2);
                    break;
                    
                default:
                    System.out.println("-opcion no valida-");
                    System.out.println("recuerda: ");
                    System.out.println("1. -Sumar- ");
                    System.out.println("2. -Restar- ");
                    System.out.println("3. -Multiplicar- ");
                    System.out.println("4. -División- ");
                    System.out.println("-------------------");
            }
            System.out.println("-----------------------");
            System.out.println(" el resultado es:  "+respuesta);
            System.out.println(" ");
            System.out.println("¿Quiere realizar otra operacion...? (true/false)");
            continuo = input.nextBoolean();
            System.out.println(" ");
        } while (continuo);
        
    }
}        
        
        
      

