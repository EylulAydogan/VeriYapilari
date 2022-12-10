/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huffman;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

// Makbule Eylül Aydoğan
// 02190201042 


public class HuffmanList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uzunlugu max 8 olan bir string giriniz ( Girilmesi beklenen alfabe : EYLU ) ;");

        String string = scan.nextLine();

        

        int[] frekans = new int[string.length()];
        char str[] = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            frekans[i] = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (str[i] == str[j]) {
                    frekans[i]++;
                    str[j] = '0';
                }
            }
        }

        

        System.out.println("Frekanslar sıralanmadan once=");
        for (int i = 0; i < frekans.length; i++) {
            if (str[i] != ' ' && str[i] != '0')
                System.out.println(str[i] + "              " + frekans[i]);
        }




        System.out.println("Frekansların sıralanmasının gerçekleşme aşaması");
        int temp;
        char temp2;
        for (int i = 0; i < frekans.length; i++) {
            for (int j = i + 1; j < frekans.length; j++) {
                if (frekans[i] > frekans[j]) {      
                    temp = frekans[i];
                    temp2 = str[i];
                    str[i] = str[j];
                    str[j] = temp2;
                    frekans[i] = frekans[j];
                    frekans[j] = temp;
                }
            }
        }

        System.out.println("Frekanslar sıralandıktan sonra oluşan durum:");
        for (int i = 0; i < frekans.length; i++) {
            if (str[i] != ' ' && str[i] != '0')
                System.out.println(str[i] + "              " + frekans[i]);
        }

        
        for (int i = 0; str.length > i; i++) {
            int n = i;
            if (str[i] != '0' && i != 0) {
                while (str[n - 1] == '0' && n != 0 && n - 1 != 0) {
                    str[n - 1] = str[n];
                    frekans[n - 1] = frekans[n];
                    str[n] = '0';
                    n = n - 1;
                }
            }
        }

        

        int n = 1;
        while (str[n] != '0') {
            str[n - 1] = str[n];
            str[n] = '0';
            n = n + 1;
        }

        

        String sikistirilmisKodSag = "0";
        String sikistirilmisKodSol = "0";
        System.out.println("Kodumuz : "+ str[0] + ", sıkıştırılmış kodu  0");
        int maks = str.length;
        for (int i = 0; i < str.length; i++) {
            if (2 * i + 1 < maks ) {
                if (str[2*i+1] != '0'){
                    sikistirilmisKodSag += "1";
                    System.out.println(str[i] + "'nin sag cocugu: " + str[2 * i + 1] + " sıkıştırılmış kodu " + sikistirilmisKodSag);
                }
            }
            if (2 * i + 2 < maks) {
                if (str[2*i+2] != '0'){
                    sikistirilmisKodSol += "0";
                    System.out.println(str[i] + "'in sol cocugu: " + str[2 * i + 2] + " sıkıştırılmış kodu " + sikistirilmisKodSol);
                }
            }
        }
    }
}