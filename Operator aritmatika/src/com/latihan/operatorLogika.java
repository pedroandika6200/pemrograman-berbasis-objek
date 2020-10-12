package com.latihan;

public class operatorLogika {
    public static void main(String[] args) {

        //operator logika (boolean)
        //AND, OR, XOR, negasi

        boolean a,b,c;

        //OR
        System.out.println("=======OR (||)");
        a=true;
        b=true;
        c=(a||b);
        System.out.println(a+" || "+b+" = "+c);
        a=true;
        b=false;
        c=(a||b);
        System.out.println(a+" || "+b+" = "+c);
        a=false;
        b=true;
        c=(a||b);
        System.out.println(a+" || "+b+" = "+c);
        a=false;
        b=false;
        c=(a||b);
        System.out.println(a+" || "+b+" = "+c);

        //AND
        System.out.println("=======AND (&&)");
        a=true;
        b=true;
        c=(a&&b);
        System.out.println(a+" && "+b+" = "+c);
        a=true;
        b=false;
        c=(a&&b);
        System.out.println(a+" && "+b+" = "+c);
        a=false;
        b=true;
        c=(a&&b);
        System.out.println(a+" && "+b+" = "+c);
        a=false;
        b=false;
        c=(a&&b);
        System.out.println(a+" && "+b+" = "+c);

        //XOR
        System.out.println("=======XOR (^)");
        a=true;
        b=true;
        c=(a^b);
        System.out.println(a+" ^ "+b+" = "+c);
        a=true;
        b=false;
        c=(a^b);
        System.out.println(a+" ^ "+b+" = "+c);
        a=false;
        b=true;
        c=(a^b);
        System.out.println(a+" ^ "+b+" = "+c);
        a=false;
        b=false;
        c=(a^b);
        System.out.println(a+" ^ "+b+" = "+c);

        //NOT (negasi)(!)
        System.out.println("==========Negasi (!)");
        a=true;
        c=!a;
        System.out.println(a+" --> (!) = "+c);

        a=false;
        c=!a;
        System.out.println(a+" --> (!) = "+c);

    }
}
