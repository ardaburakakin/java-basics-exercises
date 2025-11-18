/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tr.ardaburakakin.javaintro;


import java.util.Scanner;

/**
 *
 * @author Arda
 */
public class SwitchCaseHesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        
        System.out.println("ISLEMINIZI SECINIZ");
        System.out.println("1. TOPLAMA , 2.CIKARTMA , 3.CARPMA , 4.BOLME ");
        
        System.out.print("Secimininizi giriniz: ");
        int secim = scan.nextInt();
        
        switch(secim) {
        case 1:
            System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
            break;
        case 2:
            System.out.println("Cikarma isleminin sonucu = " + (sayi1 - sayi2));
            break;
        case 3:
            System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
            break;
        case 4:
            System.out.println("Bolme isleminin sonucu = " + (float)sayi1 / sayi2);
            break;
        default:
            System.out.println("Yanlıs Secim");
        }
    }
}
        // TODO code application logic here
    

