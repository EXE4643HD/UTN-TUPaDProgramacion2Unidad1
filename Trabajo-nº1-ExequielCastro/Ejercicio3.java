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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca su nombre:");
        Scanner nom=new Scanner (System.in);
        String nombre=nom.nextLine();
        System.out.println("Introduzca su edad:");
        Scanner ed=new Scanner (System.in);
        int edad= Integer.parseInt(ed.nextLine());
        
        System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años.");
    }
    
}
