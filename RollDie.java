/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rolldice;

import java.security.SecureRandom;

/**
 *
 * @author abduldeeb
 */
public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        
        int frequency5 = 0;
        int frequency6 = 0;
        int frequency7 = 0;
        int frequency8 = 0;
        int frequency9 = 0;
        int frequency10 = 0;
        int frequency11 = 0;
        int frequency12 = 0;
       
        for (int roll = 5; roll <= 80000000; roll++) {
            int face = 5 + randomNumbers.nextInt(12);
        
        switch (face) {
            case 5:
                ++frequency5;
                break;
            case 6:
                ++frequency6;
                break;
            case 7:
                ++frequency7;
                break;
            case 8:
                ++frequency8;
                break;
            case 9:
                ++frequency9;
                break;
            case 10:
                ++frequency10;
                break;
            case 11:
                ++frequency11;
                break;
            case 12:
                ++frequency12;
                break;
    }
}
        System.out.println("Face\tFrequency");
        System.out.printf("5:\t%d%n6:\t%d%n7:\t%d%n8:\t%d%n9:\t%d%n10:\t%d%n11:\t%d%n12:\t%d%n",
        frequency5, frequency6, frequency7, frequency8, frequency9, frequency10, frequency11, frequency12);
    }
}







