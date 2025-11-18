/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dracoias;

import java.util.Scanner;

/**
 *
 * @author Arda B
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner girdi=new Scanner(System.in);
        // Basit Tek İşlemli ATM Yapısı  
   int Bakiye=1000; // Bakiyeniz 1000 TL
    System.out.println("Yapılacak islemi seciniz");
    System.out.println("1 : Para Cekme");
    System.out.println("2 : Para Yatırma");
    System.out.println("3 : Bakiye Sorgulama"); 
    System.out.println("4 : Kart Iade"); 
    int islem=girdi.nextInt();
    
    switch (islem) {
        
        case 1 :
            System.out.println("Çekilecek Miktarı Giriniz");
                    int miktar=girdi.nextInt();
                    if (miktar>1000) {
                        System.out.println("Hesabinizda Bu Kadar Bakiye Bulunmamaktadir");
                    }
                    else {
                        int NBakiye=Bakiye-miktar;
                        System.out.println("Kalan Miktar : "+ NBakiye);
                    }
                    break;
                    
        case 2 :
            System.out.println("Yatirilacak Bakiyeyi Giriniz");
                  int ekmiktar=girdi.nextInt();
                 int XBakiye=Bakiye+ekmiktar;
                  System.out.println("Yeni Bakiyeniz : "+ XBakiye);
                 break;
            
        case 3 : 
            System.out.println("Güncel Bakiyeniz : "+Bakiye);
            break;
            
        case 4 :
            System.out.println("Kart Iade Ediliyor");
            
        default :
            System.out.println("Yanlis Islem Girdiniz"); 
    }
}
}
