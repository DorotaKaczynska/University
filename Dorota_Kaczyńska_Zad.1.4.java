/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gra;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class Gra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char znak;
        do
        {  
            System.out.println("Gra 'Za dużo, za mało'");
            Random losowa = new Random();
           
            System.out.println("Podaj największą liczbę");
            int max = scanner.nextInt();
            int l = losowa.nextInt(max) + 1;
            //System.out.println("los = "  + l);
            System.out.println("Odgadnij wylosowaną liczbę: ");
            int i;
            int proby = 0;
            do
            {
                i = scanner.nextInt();
                String clean = scanner.nextLine();
                if (i < l)
                {
                     System.out.println("Za mało");
                }
                else if (i > l)
                {
                     System.out.println("Za dużo"); 
                }
                proby++;
             } while(i != l);
               System.out.println("Wygrana! Liczba prób = " + proby);
               System.out.println("Czy chcesz zagrać jeszcze raz? [T = tak, Inny znak = nie]");
             
               znak = scanner.next().charAt(0);
              
        }
        while (znak == 'T');   
        
    }
    
}
