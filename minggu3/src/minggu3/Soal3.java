/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author faikar
 */
public class Soal3 {
    public void jawab(){
       Scanner input = new Scanner(System.in);
        
        int a, b;
        String str;
        str = input.nextLine();
        String val[] = str.split(" ");
        a = Integer.parseInt(val[0]);
        b = Integer.parseInt(val[2]);
        
        if(a >= 1 && a <= 1000 && b >= 1 && b <= 1000){
            switch(val[1]){
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Operator salah");
                    break;
            }
        }
        else{
            System.out.println("Angka melebihi limit");
        }
    }
}
