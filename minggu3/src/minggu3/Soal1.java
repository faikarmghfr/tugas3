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
public class Soal1 {
        public void jawab(){
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        String kata = input.nextLine();
        String Splitkata[] = kata.split("[!@,.'_\\s]+");
        System.out.println(Splitkata.length);
        
        for ( String s : Splitkata ){
            System.out.println(s);
        }
    }
}
        
