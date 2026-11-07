/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notdagilimi;

import java.util.Scanner;

/**
 *
 * @author sss
 */
public class Notdagilimi {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); System.out.println("Not girinizz");int not = sc.nextInt();
     if  (not<0||not>100){System.out.println("GECERIZ NOT"); 
    }else if (not>=90){System.out.println("aa");}
     else if (not>=80){System.out.println("ba");
    }else if (not>=70){System.out.println("bb");
    }else if (not>=60){System.out.println("cb");
    }else if (not>=90){System.out.println("cc");}else{System.out.println("ff");
    }
}
}