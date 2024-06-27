/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquesoft.javauno;

import java.util.Scanner;

/**
 *
 * @author edwin andres gonzalez romero
 * DDS-C25 (2024-4)
 * PROGRAMACION EN JAVA 1
 * 
 */
public class InvertirPalabraMain {

    /**
     * Codigo para invertir una palabra o cifra;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println(" ingrese una palabra o cifra");
        str= input.next();
        System.out.println(reverse(str));
        
        }
    
    public static String reverse(String text){
        if (text==null){
            throw new IllegalArgumentException("tienen que escribir algo");
    
        }
        StringBuilder textOut= new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = chars.length-1; i >=0; i--) {
            textOut.append(chars[i]);
        }
        return textOut.toString();

    }
}
