/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.nº1;

import java.util.Scanner;

/**
 *
 * @author execa
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un numero entero: ");
        Scanner n1=new Scanner (System.in);
        double num1= Double.parseDouble(n1.nextLine());
        
        System.out.println("Introduzca un numero entero: ");
        Scanner n2=new Scanner (System.in);
        double num2= Double.parseDouble(n2.nextLine());
        
        double dividir= num1 / num2;
        
        System.out.println("El resultado de la division es: "+dividir);
    }
    
}
