package com.company;

public class LearnLoop {
    public static void main(String args[]){
        int x = 10;
        while(x < 20){
            System.out.print("Learn While:"+x);
            x++;
            System.out.print("\n");
        }
        int xs = 1;
        do {
            System.out.print("Learn do..while:"+xs);
            xs++;
            System.out.print("\n");
        }while (xs<20);
        for( int xx = 40;xx <50;xx = xx+1){
            System.out.print("Learn For:"+xx);
            System.out.print("\n");
        }
        int [] list = {100,10,90,80,131,12};
        for (int num : list){
            if (num==90){
                break;
            }
            System.out.print("Learn Break:" + num);
            System.out.print("\n");
        }
        for (int nums : list){
            if (nums==80){
                continue;
            }
            System.out.print("Learn Continue:"+nums);
            System.out.print("\n");
        }
    }
}
