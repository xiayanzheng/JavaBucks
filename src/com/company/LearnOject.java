package com.company;

public class LearnOject {
    String bread;
    int age;
    String color;

    public LearnOject(String name){
        System.out.print("Name is:" + name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.print("LearnOject's Age is:"+age);
        return age;
    }

    class Variable{
        int allClicks = 0;
        String str = "Viko!";
        public void method(){
            int i = 0;
        }
    }

    class LearnInstanceof{
        String name = "yzxia";
    }

    public static void main(String []args){
        LearnOject myDog = new LearnOject("Sapo");
        myDog.setAge(1);
        myDog.getAge();
        System.out.print("Age is:"+myDog.age);
    }
}
