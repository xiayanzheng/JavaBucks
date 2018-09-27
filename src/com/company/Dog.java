package com.company;



public class Dog{
    String bread;
    int age;
    String color;

    public Dog(String name){
        System.out.print("Name is:" + name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.print("Dog's Age is:"+age);
        return age;
    }


    public static void main(String []args){
        Dog myDog = new Dog("Sapo");
        myDog.setAge(1);
        myDog.getAge();
        System.out.print("Age is:"+myDog.age);
    }
}
