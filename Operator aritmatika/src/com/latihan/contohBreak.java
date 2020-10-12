package com.latihan;
import java.util.Scanner;
public class contohBreak {
    public static void main(String[] args) {
        Scanner myScan=new Scanner(System.in);
        int i=0;
        int jmlloop;
        System.out.print("Masukan jumlah loop: ");
        jmlloop=myScan.nextInt();
        while(i<jmlloop){
            System.out.print(i+" ");
            i++;
        }
    }
}
