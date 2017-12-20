/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatingotp;

import java.util.Random;



/**
 *
 * @author MR Buddy
 */
public class GeneratingOTP {
    
    static char[] sendOTP(int length)
    {
    System.out.println(" your otp for this transaction is : ");
    String numbers="123456789";
    Random r=new Random();
    char[] otp=new char[length];
       for(int i=0;i<length;i++){
           otp[i]=numbers.charAt(r.nextInt(numbers.length()));
       }
       return otp;
       }
    
    

    public static void main(String[] args) {
        
        System.out.println("generating otp....");
        System.out.println(sendOTP(6));  //call the abouve methode and give the otp length
    }
    
}
