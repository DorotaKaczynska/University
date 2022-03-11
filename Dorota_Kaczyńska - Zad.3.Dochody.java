/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dochody2;

import java.util.Scanner;

/**
 *
 * @author Dorota
 */
public class Dochody2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int wybor; Scanner sc = new Scanner(System.in);
    double[] dochody = new double[12];
        do {
            menu();
            System.out.println("Wybierz opcję");
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: WczytajDochody(dochody);
                    break;
                case 2: WyswietlDochody(dochody);
                    break;
                case 3: SredniaSumaDochodow(dochody);
                    break;
                case 4: MaksymalnyMinimalnyDochod(dochody);
                    break;
                case 5: Sortuj(dochody);
                    break;
                case 6: PodNadSrednimDochodem(dochody);
                    break;
                case 7: System.out.println("Do widzenia");
                    break;
                default : System.out.println("Nie ma takiej opcji");
            }
        } while (wybor != 7);
    }
    
        public static void menu(){
        System.out.println("1 - wczytaj dochody");
        System.out.println("2 - wyświetl dochody");
        System.out.println("3 - wyświetl średnią sumę dochodów");
        System.out.println("4 - wyświetl maksymalny i minimalny dochod");
        System.out.println("5 - sortuj dochody");
        System.out.println("6 - wyświetl pod i nad średnim dochodem");
        System.out.println("7 - koniec");
    }
        
    static void WczytajDochody(double[] dochody )
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < dochody.length; i++)
        {
            System.out.println("Proszę podać przychód nr: " +(i+1));
            dochody[i] = sc.nextDouble(); sc.nextLine();
        }
    }
    
    static void WyswietlDochody( double[] dochody )
    {
        for(int i = 0; i < dochody.length; i++)
        {
            System.out.println("Przychód nr " + (i+1) + " wynosi: " + dochody[i]);
                
        }
    }
    
    
    static void SredniaSumaDochodow( double[] dochody )
    {
        double suma = 0;
        for(int i = 0; i < dochody.length; i++)
        {
        suma += dochody[i];
        }
        System.out.println("Suma dochodów wynosi: " + suma);
        System.out.println("Średnia dochodów wynosi: " + (suma / dochody.length));
    }
    
    static void MaksymalnyMinimalnyDochod( double[] dochody )
    {
        double min = 0;
        double max = 0;
        for(int i = 0; i < dochody.length; i++)
        {
            if (i == 0)
            {
                min = dochody[i];
                max = dochody[i];
            }
            else 
            {
                if (dochody[i] < min) min = dochody[i];
                if (dochody[i]> max) max = dochody[i];
            }
        }
        System.out.println("Minimalny przychód wynosi: " + min);
        System.out.println("Maksymalny przychoód wynosi: " + max);
    }
    
    static void Sortuj( double[] dochody )
    {
       int rozmiar = dochody.length;
       double temp = 0;
       for(int i = 0; i < rozmiar; i++)
       {
           for(int j = 1; j < (rozmiar - i); j++)
           {
               if(dochody[j - 1] > dochody[j])
               {
                   temp = dochody[j - 1];
                   dochody[j - 1] = dochody[j];
                   dochody[j] = temp;
               }
           }
       }
       
       for(int i = 0; i < rozmiar; i++)
       {
           System.out.println("Dochód nr: " + (i+1) + " wynosi: " + dochody[i]);
       }
    }
    
    static void PodNadSrednimDochodem( double[] dochody)
    {
       double suma = 0;
        for(int i = 0; i < dochody.length; i++)
        {
            suma += dochody[i];
        }
        double srednia = suma / dochody.length;
        System.out.println("Dochody ponad śednią: ");
        for(int i = 0; i < dochody.length; i++)
        {
            if(dochody[i] > srednia)
            {
                System.out.println("dochód nr: " + i + ", wartość: " + dochody[i]);
            }
        }
        System.out.println("Dochody poniżej średniej: ");
        for(int i = 0; i < dochody.length; i++)
        {
            if(dochody[i] < srednia)
            {
                System.out.println("dochód nr: " + i + ", wartość: " + dochody[i]);
            }
        }
        
    }
    
}
