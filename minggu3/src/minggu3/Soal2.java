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
public class Soal2 {
    public void jawab(){
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        String baca;
        String kata[] = new String[3];
        int angka[] = new int[3];
        
        while(i < 3){
            baca = input.nextLine();
            String val[] = baca.split(" ");
            kata[i] = val[0];
            angka[i] = Integer.parseInt(val[1]);
            if(kata[i].length() >= 10 || angka[1] >= 999){
                System.out.println("Kata atau angka melebihi limit");
                break;
            }
            i++;
        }
        i = 0;
        System.out.println("==============================");
        while(i < 3){
            System.out.println(String.format("%-15s", kata[i]) + String.format("%03d", angka[i]));
            i++;
        }
        System.out.println("==============================");
    }
}

