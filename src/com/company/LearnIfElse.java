package com.company;

public class LearnIfElse {
    public static void main(String args[]){
        int x = 10;
        if(x < 20){
            System.out.print("This is IF");
            System.out.print("\n");
        }
        if(x < 9){
            System.out.print("Under 20");
            System.out.print("\n");
        }else if(x > 1){
            System.out.print("Above 1");
            System.out.print("\n");
        }else {
            System.out.print("Above 20");
            System.out.print("\n");
        }

    }
}
