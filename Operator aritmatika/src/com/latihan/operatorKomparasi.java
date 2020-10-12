package com.latihan;

public class operatorKomparasi {
    public static void main(String[] args) {

        //akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomprs;

        //operator persamaan
        a=10;
        b=11;
        hasilKomprs = (a==b);
        System.out.printf("%d == %d? %s\n",a,b,hasilKomprs);

        a=10;
        b=10;
        hasilKomprs = (a==b);
        System.out.printf("%d == %d? %s\n",a,b,hasilKomprs);

        //operator pertidaksamaan
        a=10;
        b=11;
        hasilKomprs = (a!=b);
        System.out.printf("%d != %d? %s\n",a,b,hasilKomprs);

        a=10;
        b=10;
        hasilKomprs = (a!=b);
        System.out.printf("%d != %d? %s\n",a,b,hasilKomprs);

        //operator kurang dari
        a=10;
        b=11;
        hasilKomprs = (a<b);
        System.out.printf("%d < %d? %s\n",a,b,hasilKomprs);

        a=10;
        b=9;
        hasilKomprs = (a<b);
        System.out.printf("%d < %d? %s\n",a,b,hasilKomprs);

        //operator lebih dari
        a=10;
        b=11;
        hasilKomprs = (a>b);
        System.out.printf("%d > %d? %s\n",a,b,hasilKomprs);

        a=10;
        b=9;
        hasilKomprs = (a>b);
        System.out.printf("%d > %d? %s\n",a,b,hasilKomprs);

        //operator kurang dari sama dengan
        a=10;
        b=10;
        hasilKomprs = (a<=b);
        System.out.printf("%d <= %d? %s\n",a,b,hasilKomprs);

        a=10;
        b=9;
        hasilKomprs = (a<=b);
        System.out.printf("%d <= %d? %s\n",a,b,hasilKomprs);

        //operator lebih dari sama dengan
        a=10;
        b=11;
        hasilKomprs = (a>=b);
        System.out.printf("%d >= %d? %s\n",a,b,hasilKomprs);

        a=10;
        b=10;
        hasilKomprs = (a>=b);
        System.out.printf("%d >= %d? %s\n",a,b,hasilKomprs);

    }
}
