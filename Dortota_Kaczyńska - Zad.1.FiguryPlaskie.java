package figuryplaskie;

import java.util.Scanner;

public class FiguryPlaskie {


    public static void main(String[] args) {
        int wybor; Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Wybierz opcję");
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: obliczeniaDlaKwadratu();
                    break;
                case 2: obliczeniaDlaProstokata();
                    break;
                case 3: obliczeniaDlaKola();
                    break;
                case 4: obliczeniaDlaTrojkata();
                    break;
                case 5: obliczeniaDlaTrapezu();
                    break;
                case 6: System.out.println("Do widzenia");
                    break;
                default : System.out.println("Nie ma takiej figury");
            }
        } while (wybor != 6);
    }
    
    public static void menu(){
        System.out.println("1 - kwadrat");
        System.out.println("2 - prostokąt");
        System.out.println("3 - koło");
        System.out.println("4 - trójkąt");
        System.out.println("5 - trapez");
        System.out.println("6 - koniec");
    }
    
    public static void podmenu() 
    {
        System.out.println("Wybierz co liczymy");
        System.out.println("1 - pole");
        System.out.println("2 - obwód");     
    }
    
    public static double poprawnoscDanych()
    {
        double dane = 0;
        do 
        {
            Scanner sc = new Scanner(System.in);
            dane = sc.nextDouble();sc.nextLine();  
            if (dane <= 0) 
            {
                System.out.println("Nieprawidłowe dane! Proszę wpisać je ponownie.");
            }
        }
        while (dane <= 0);
        return dane;
    }
    
    public static void obliczeniaDlaKwadratu(){
        podmenu();
        int podwybor; Scanner sc = new Scanner(System.in);
        podwybor = sc.nextInt();sc.nextLine();
        switch (podwybor)
        {
            case 1: poleKwadratuDane();
                    break;
            case 2: obwodKwadratuDane();
                    break;
            default : System.out.println("Nie ma takiego działania.");
        }
    }
    
    public static void poleKwadratuDane() 
    {
        System.out.println("Proszę podać długość boku kwadratu:");
        double bok = poprawnoscDanych();
        System.out.println("Pole kwadratu wynosi: " + poleKwadratu(bok));
    }
    
    public static void obwodKwadratuDane() 
    {
        System.out.println("Proszę podać długość boku kwadratu:");
        double bok = poprawnoscDanych();
        System.out.println("Obwód kwadratu wynosi: " + obwodKwadratu(bok));
    }
    
    public static double poleKwadratu(double bok){
        return bok * bok;
    }
    
    public static double obwodKwadratu(double bok){
        return 4 * bok;
    }
    
    public static void obliczeniaDlaProstokata(){
        podmenu();
        int podwybor; Scanner sc = new Scanner(System.in);
        podwybor = sc.nextInt();sc.nextLine();
        switch (podwybor)
        {
            case 1: poleProstokataDane();
                    break;
            case 2: obwodProstokatDane();
                    break;
            default : System.out.println("Nie ma takiego działania.");
        }
    }
    
    public static void poleProstokataDane() 
    {
        System.out.println("Proszę podać długość pierwszego boku prostokąta:");
        double bok1 = poprawnoscDanych();
        System.out.println("Proszę podać długość drugiego boku prostokąta:");
        double bok2 = poprawnoscDanych();
        System.out.println("Pole prostokąta wynosi: " + poleProstokat(bok1, bok2));
    }
    
    public static void obwodProstokatDane() 
    {
        System.out.println("Proszę podać długość pierwszego boku prostokąta:");
        double bok1 = poprawnoscDanych();
        System.out.println("Proszę podać długość drugiego boku prostokąta:");
        double bok2 = poprawnoscDanych();
        System.out.println("Obów prostokąta wynosi: " + obwodProstokat(bok1, bok2));
    }
    
    public static double poleProstokat(double bok1, double bok2){
        return bok1 * bok2;
    }
    public static double obwodProstokat(double bok1, double bok2){
        return 2 * bok1 + 2 * bok2;
    }
        
    public static void obliczeniaDlaKola()
    {
        podmenu();
        int podwybor; Scanner sc = new Scanner(System.in);
        podwybor = sc.nextInt();sc.nextLine();
        switch (podwybor)
        {
            case 1: poleKolaDane();
                    break;
            case 2: obwodKolaDane();
                    break;
            default : System.out.println("Nie ma takiego działania.");
        } 
    }
    
    public static void poleKolaDane() 
    {
        System.out.println("Proszę podać długość promienia koła:");
        double promien = poprawnoscDanych();
        System.out.println("Pole koła wynosi: " + poleKola(promien));
    }
    
    public static void obwodKolaDane() 
    {
        System.out.println("Proszę podać długość promienia koła:");
        double promien = poprawnoscDanych();
        System.out.println("Obwód koła wynosi: " + obwodKola(promien));
    }
    
     public static double poleKola(double promien){
        return (Math.PI) * (Math.pow(promien, 2.0d));
    }
    
    public static double obwodKola(double promien){
        return 2 * (Math.PI) * promien;
    }
    
    public static void obliczeniaDlaTrojkata(){
        podmenu();
        int podwybor; Scanner sc = new Scanner(System.in);
        podwybor = sc.nextInt();sc.nextLine();
        switch (podwybor)
        {
            case 1: poleTrojkataDane();
                    break;
            case 2: obwodTrojkataDane();
                    break;
            default : System.out.println("Nie ma takiego działania.");
        }
    }
    
    public static void poleTrojkataDane() 
    {
        System.out.println("Proszę podać długość boku tójkąta:");
        double bok = poprawnoscDanych();
        System.out.println("Proszę podać wysokość trójkąta opuszczoną na podany bok:");
        double wysokosc = poprawnoscDanych();
        System.out.println("Pole kwadratu wynosi: " + poleTrojkata(bok, wysokosc));
    }
    
    public static void obwodTrojkataDane() 
    {
        System.out.println("Proszę podać długość pierwszego boku trójkąta:");
        double bok1 = poprawnoscDanych();
        System.out.println("Proszę podać długość drugiego boku trójkąta:");
        double bok2 = poprawnoscDanych();
        System.out.println("Proszę podać długość trzeciego boku trójkąta:");
        double bok3 = poprawnoscDanych();
        System.out.println("Obwód kwadratu wynosi: " + obwodTrojkata(bok1, bok2, bok3));
    }
    
    public static double poleTrojkata(double bok, double wysokosc){
        return (bok * wysokosc) / 2;
    }
    
    public static double obwodTrojkata(double bok1, double bok2, double bok3){
        return bok1 + bok2 + bok3;
    }
    
        public static void obliczeniaDlaTrapezu(){
        podmenu();
        int podwybor; Scanner sc = new Scanner(System.in);
        podwybor = sc.nextInt();sc.nextLine();
        switch (podwybor)
        {
            case 1: poleTrapezuDane();
                    break;
            case 2: obwodTrapezuDane();
                    break;
            default : System.out.println("Nie ma takiego działania.");
        }
    }
    
    public static void poleTrapezuDane() 
    {
        System.out.println("Proszę podać długość pierwszej podstawy trapezu:");
        double podstawa1 = poprawnoscDanych();
        System.out.println("Proszę podać długość drugiej podstawy trapezu:");
        double podstawa2 = poprawnoscDanych();
        System.out.println("Proszę podać wysokość trapezu:");
        double wysokosc = poprawnoscDanych();
        System.out.println("Pole trapezu wynosi: " + poleTrapezu(podstawa1, podstawa2, wysokosc));
    }
    
    public static void obwodTrapezuDane() 
    {
        System.out.println("Proszę podać długość pierwszej podstawy trapezu:");
        double podstawa1 = poprawnoscDanych();
        System.out.println("Proszę podać długość drugiej podstawy trapezu:");
        double podstawa2 = poprawnoscDanych();
        System.out.println("Proszę podać długość pierwszego ramienia trapezu:");
        double ramie1 = poprawnoscDanych();
        System.out.println("Proszę podać długość drugiego ramienia trapezu:");
        double ramie2 = poprawnoscDanych();
        System.out.println("Obwód trapezu wynosi: " + obwodTrapezu(podstawa1, podstawa2, ramie1, ramie2));
    }
    
    public static double poleTrapezu(double podstawa1, double podstawa2, double wysokosc){
        return ((podstawa1 + podstawa2) * wysokosc) / 2;
    }
    
    public static double obwodTrapezu(double podstawa1, double podstawa2, double ramie1, double ramie2){
        return podstawa1 + podstawa2 + ramie1 + ramie2;
    }
    
}

