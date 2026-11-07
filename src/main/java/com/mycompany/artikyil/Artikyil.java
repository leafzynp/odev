/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.artikyil;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Artikyil {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); System.out.println("yili giriniz");
       int yil = sc.nextInt();
       if (yil%4==0&&yil%100!=0){System.out.println("artik yil");
       }else{ if (yil%400==0){System.out.println("artik yil");
       }else{ System.out.println("artik yil değil");
       }
       
       }
    }
}
