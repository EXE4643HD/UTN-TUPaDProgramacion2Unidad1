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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Intrroduzca un numero entero:");
        Scanner n1=new Scanner (System.in);
        int num1= Integer.parseInt(n1.nextLine());
        System.out.println("Intrroduzca un numero entero:");
        Scanner n2=new Scanner (System.in);
        int num2= Integer.parseInt(n2.nextLine());
        
        int suma= num1 + num2;
        int resta= num1 - num2;
        int multi= num1 * num2;
        int divi= num1 / num2;
        
        System.out.println("La suma de "+num1+" y "+num2+" es: "+suma);
        System.out.println("La resta de "+num1+" y "+num2+" es: "+resta);
        System.out.println("La multiplicacion de "+num1+" y "+num2+" es: "+multi);
        System.out.println("La division entre "+num1+" y "+num2+" es: "+divi);
    }
    
}
