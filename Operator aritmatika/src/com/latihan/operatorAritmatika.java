package com.latihan;

public class operatorAritmatika {

    public static void main(String[] args) {
	//Operasi Aritmatika

    int variable1=5;
    int variable2=3;
    int hasil;

    //Penjumlahan
        hasil=variable1+variable2;
        System.out.println(variable1+" + "+variable2+" = "+hasil);

    //Pengurangan
        hasil=variable1-variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

    //Perkalian
        hasil=variable1*variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

    //Pembagian
        float a = 6;
        float b = 5;
        float hasil1=a/b;
        System.out.printf(a+" / " +b+" = "+hasil1+"\n");

    //Modulus
        hasil=variable1%variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
    }
}
