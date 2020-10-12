package com.latihan;

public class recursion {
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);
    }
    public static int sum(int k){
        if (k>0){
            int x1=k+sum(k-1);
        }else{
            return 0;
        }
        return k;
    }
}
