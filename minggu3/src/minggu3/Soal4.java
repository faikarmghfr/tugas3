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
public class Soal4 {
    public void jawab(){
    Scanner input = new Scanner(System.in);
        
        int jumlahjual = input.nextInt();
        int gaji;
        
        if(jumlahjual >= 40){
            gaji = 500000 + ((jumlahjual * 50000) * 25/100);
            System.out.println(gaji);
        }
        else if(jumlahjual >= 80){
            gaji = 500000 + ((jumlahjual * 50000) * 35/100);
            System.out.println(gaji);
        }
        else if(jumlahjual < 15){
            gaji = 500000 - ((50000 * (15 - jumlahjual)) * 15/100);
            System.out.println(gaji);
        }
        else{
            gaji = 500000 + ((50000 * 10/100) * jumlahjual);
            System.out.println(gaji);
        }
    }
}