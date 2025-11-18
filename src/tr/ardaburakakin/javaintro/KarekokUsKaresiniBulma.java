/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tr.ardaburakakin.javaintro;


import java.util.Scanner;

/**
 *
 * @author Arda B
 */
public class KarekokUsKaresiniBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          //Sayının Karekökü , 5. Üssü Veya Karesini Bulma
         Scanner girdi=new Scanner(System.in);
     System.out.println("Bir Sayi Giriniz");
      int sayi=girdi.nextInt();
      System.out.println("Yapılacak İslemi Giriniz");
      System.out.println("1 = Sayinin Karekökü");
      System.out.println("2 = Sayinin 5.Ussünü");  
      System.out.println("3 = Sayinin Karesini");
      int islem=girdi.nextInt();
      
      switch (islem) {
          
          case 1 :
              System.out.println( Math.pow(sayi, 1/2));
              break;
              
          case 2:
              System.out.println( Math.pow(sayi,5));
              break;
          case 3 :
              System.out.println( Math.pow(sayi, 2));
              break;
              
          default:
              System.out.println("Hatali İslem Yaptiniz"); 
    }
}
}
