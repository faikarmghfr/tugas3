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
public class Soal5 {
    public void jawab(){
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        String val = str.replaceAll("\\s", "");
        
        if((Long.parseLong(val) - 999999) % 5 == 0){
            System.out.println("Berhenti");
        }
        else{
            System.out.println("Jalan");
        }
    }
}
