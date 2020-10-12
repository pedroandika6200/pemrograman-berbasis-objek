package com.latihan;

public class multipleParameter {
    static void myMethod(String fname, int age){
        System.out.println(fname+" "+age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("jemmy", 8);
        myMethod("Anja", 31);
    }
}
