/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author faikar
 */
public class Soal6 {
    public void jawab(){
        Scanner input = new Scanner(System.in);
        
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
