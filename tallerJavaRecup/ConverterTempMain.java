
package parquesoft.javauno;

import java.util.Scanner;
/**
 *
 * @author edwin andres gonzalez romero
 * DDS-C25 (2024-4)
 * PROGRAMACION EN JAVA 1
 * 
 */
public class ConverterTempMain {

    /**
     * Codigo para realizar conversion de grados farenheit a celsios y de modo contrario;
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float celsio, farent, tempera;
         String seleccion;
         System.out.println(" Ingrese los grados de temperatura: ");
         tempera= input.nextFloat();
         System.out.println(" ahora selecciona que conversion quieres hacer ? ");
         System.out.println(" Convertir farenheit a celsios; Selecciona (a) ");
         System.out.println(" Convertir farenheit a celsios; Selecciona (b) ");
         seleccion= input.next();
        
         if("a".equals(seleccion)){
             celsio = (tempera-32)*5/9;
             System.out.println(tempera +" grados farenheit a celsio es: " +celsio);
        } 
         else if("b".equals(seleccion)){
             farent = (tempera*9/5)+32;
             System.out.println(tempera +" grados farenheit a celsio es: " +farent);
         } 
         else {
            System.out.println("valor incorrecto vuelva a intentar");
                 }
        }
}
