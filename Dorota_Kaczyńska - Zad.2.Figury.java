package figury;

import java.util.Scanner;

public class Figury {


    public static void main(String[] args) {
        int wybor; Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Wybierz opcję");
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: Kwadrat();
                    break;
                case 2: Trojkat1();
                    break;
                case 3: Trojkat2();
                    break;
                case 4: Ramka();
                    break;
                case 5: RamkaZPrzekatnymi();
                    break;
                case 6: Piramidka();
                    break;
                case 7: System.out.println("Do widzenia");
                    break;
                default : System.out.println("Nie ma takiej figury");
            }
        } while (wybor != 7);
    }
    
    public static void menu(){
        System.out.println("1 - kwadrat");
        System.out.println("2 - trójkąt 1");
        System.out.println("3 - trójkąt 2");
        System.out.println("4 - ramka");
        System.out.println("5 - ramka z przekątnymi");
        System.out.println("6 - piramidka");
        System.out.println("7 - koniec");
    }
    
    public static int poprawnoscDanych()
    {
        int dane = 0;
        do 
        {
            System.out.println("Proszę wpisać wielkość: ");
            Scanner sc = new Scanner(System.in);
            dane = sc.nextInt();sc.nextLine();  
            if (dane <= 0) 
            {
                System.out.println("Nieprawidłowe dane! Proszę wpisać je ponownie.");
            }
        }
        while (dane <= 0);
        return dane;
    }
    
    public static void Gwiazdka(){
        System.out.print("*");
    }
    
    public static void Spacja(){
        System.out.print(" ");
    }
    
     public static void Linia(){
        System.out.println("");
    }
    
    public static void Kwadrat(){

        int wielkosc = poprawnoscDanych();
        for(int i = 1; i <= wielkosc; i++)
        {
            for(int j = 1; j <= wielkosc; j++)
            {
                Gwiazdka();
                Spacja();
            }
            Linia();
        }
    }
    
    public static void Trojkat2(){
       int wielkosc = poprawnoscDanych();
       int wielkosc2 = wielkosc;
        for(int i = 1; i <= wielkosc; i++)
        {
            for(int j = 1; j <= wielkosc; j++)
            {
                if(j >= wielkosc2)
                {
                    Gwiazdka();
                    Spacja();
                }else
                {
                    Spacja();
                    Spacja();
                }
                
            }
            wielkosc2--;
            Linia();
        }
    }
        
    public static void Trojkat1()
    {
       int wielkosc = poprawnoscDanych();
        for(int i = 1; i <= wielkosc; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                Gwiazdka();
                Spacja();
            }
            Linia();
        } 
    }

    public static void Ramka(){
       int wielkosc = poprawnoscDanych();
        for(int i = 1; i <= wielkosc; i++)
        {
           
            for(int j = 1; j <= wielkosc; j++)
            {
                if(i == 1 || i == wielkosc || j == 1 || j == wielkosc)
                {
                    Gwiazdka();
                    Spacja();
                } 
                else
                {
                    Spacja();
                    Spacja();
                }
            }
            Linia();
        } 
    }
 
    public static void RamkaZPrzekatnymi(){
     int wielkosc = poprawnoscDanych();
        for(int i = 1; i <= wielkosc; i++)
        {
           
            for(int j = 1; j <= wielkosc; j++)
            {
                if( (i == 1 || i == wielkosc || j == 1 || j == wielkosc) || (j == i || j == wielkosc - (i - 1)) )
                {
                    Gwiazdka();
                    Spacja();
                } 
                else
                {
                    Spacja();
                    Spacja();
                }
            }
            Linia();
        } 
    }
    
    public static void Piramidka()
    {
        int wielkosc = poprawnoscDanych();
        int podstawa = wielkosc + wielkosc - 1;
        for(int i = 1; i <= wielkosc; i++)
        {
            for(int j = 1; j <= podstawa; j++)
            {
                
                if(j < (wielkosc + i) && j > (wielkosc - i))
                {
                    Gwiazdka();
                    Spacja();
                } 
                else
                {
                    Spacja();
                    Spacja();
                }
                
            }
            Linia();
        } 
    }
    
    
}


