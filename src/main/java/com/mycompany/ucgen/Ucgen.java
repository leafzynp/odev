/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ucgen;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Ucgen {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);System.out.println("kenarlari giriniz");
 int sayi1 = sc.nextInt();
  int sayi2 = sc.nextInt();
  int sayi3 = sc.nextInt();if (sayi1+sayi2>sayi3&&sayi1+sayi3>sayi2&&sayi3+sayi2>sayi1){ if (sayi1==sayi2&&sayi2==sayi3){System.out.println("ESKENAR");
   }else if(sayi1==sayi2||sayi1==sayi3||sayi2==sayi3){System.out.println("İKİZKENAR");}else{System.out.println("CESİTKENAR");} 
  }else{System.out.println("UCGEN OLUSMAZ");}
}
}