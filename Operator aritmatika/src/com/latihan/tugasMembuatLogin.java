package com.latihan;

import java.util.Scanner;

public class tugasMembuatLogin {
    public static void main(String[] args) {

        Scanner myScan=new Scanner(System.in);
        String username="pedro";
        String password="12345";


        System.out.print("Masukan Username : ");
        String loginusername=myScan.next();
        System.out.print("Masukan Password : ");
        String loginpassword=myScan.next();

        if(loginusername.equals(username)&&loginpassword.equals(password)){
                System.out.println("Username dan password benar!");
        }else{
            System.out.println("Username dan password salah!");
        }
    }
}
