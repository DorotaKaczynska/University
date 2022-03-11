/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Wykonuje operacje arytmetyczne na dwóch liczbach");
       
       double liczba1;
       double liczba2;
       char znak;
        Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj pierwszą liczbę: ");
        liczba1 = scanner.nextDouble();
       
       System.out.println("Podaj działanie [+, -, *, /]: ");
       znak = scanner.next().charAt(0);
       
       System.out.println("Podaj drugą liczbę: ");
       liczba2 = scanner.nextDouble();
       String space = scanner.nextLine();
       switch (znak) {
           
           case '+':   
           {
               System.out.println(liczba1 + liczba2);
               break;
           }
           case '-':  
           {
               System.out.println(liczba1 - liczba2);
                break;
           }
           case '*':
           {
                System.out.println(liczba1 * liczba2);
                 break;
           }
           case '/': 
           {
               if(liczba2 !=0)
               System.out.println(liczba1 / liczba2);
           
               else {
                   System.out.println("Nie dzielimy przez zero!");
               }
               break;
           }
           default:
           {
                 System.out.println("Niedozwolone działanie");
                  break;
           }
        }
        System.out.println("Naciśnij Enter aby zakończyć");
                String enter = scanner.nextLine();
                System.exit(0);  
    } 
}
    






   
    

