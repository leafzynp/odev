/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ucsayininbuyugu;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Ucsayininbuyugu {

    public static void  main(String[] args) {
    Scanner sc = new Scanner(System.in);System.out.println("1.Sayiyi giriniz");
    int sayi1 = sc.nextInt();System.out.println("2.sayiyi giriniz");int sayi2 = sc.nextInt();
        System.out.println("3.sayiyi giriniz");int sayi3 = sc.nextInt();
        if (sayi1>sayi2&&sayi1>sayi3){
        System.out.println( sayi1+ "en buyugu") ;}else{ 
       if(sayi2>sayi3&&sayi2>sayi1) {System.out.println(sayi2+ "en buyugu");
       }else{ System.out.println( sayi3+ " en buyugu");
       }
            
            
    }
}
}