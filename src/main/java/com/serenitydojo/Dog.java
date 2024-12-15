package com.serenitydojo;

import java.sql.SQLOutput;

public class Dog {
    String name;
    String favoriteToy;
    int age;
    boolean isFed;
    static String DOG_NOISE = "Woof!";

    public Dog(String name, String favoriteToy, int age){
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getFavoriteToy(){
        return favoriteToy;
    }
    public int getAge(){
        return age;
    }
    public String makeNoise(){
        return DOG_NOISE;

    }
    public void feed(){
        this.isFed = true;
    }

    public boolean isFed(){
        return isFed;
    }
}
