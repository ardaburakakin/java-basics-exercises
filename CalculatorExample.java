/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dracoias;

import java.util.Scanner;

/**
 *
 * @author Arda Burak
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner girdi=new Scanner(System.in);
         int sayi1;
         System.out.println("Ilk Sayiyi Giriniz");
         sayi1=girdi.nextInt();
         int sayi2;
         System.out.println("ikinci sayiyi Giriniz");
         sayi2=girdi.nextInt();
         System.out.println("Yapmak istediginiz islemi seciniz");
         System.out.println("1=Toplama , 2=Cikarma , 3=Bolme , 4=Carpma ");
         int secim;
         secim=girdi.nextInt();
          if(secim==1) {
              System.out.println("Toplama isleminin sonucu : "+(sayi1+sayi2));
          }
          
          else if(secim==2) {
              System.out.println("Cikarma isleminin sonucu : "+(sayi1-sayi2));
          }
         else if(secim==3) {
              System.out.println("Bolme isleminin sonucu : "+(sayi1/sayi2));
          }
          else if(secim==4) {
              System.out.println("Carpma isleminin sonucu : "+(sayi1*sayi2));
          }
          
          else 
              System.out.println("Yanlıs Operatör Sectiniz");
          
         
         
       
             
             
         
        
    }      
         
        // TODO code application logic here
    }

