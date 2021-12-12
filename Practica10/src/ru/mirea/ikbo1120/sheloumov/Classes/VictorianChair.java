package ru.mirea.ikbo1120.sheloumov.Classes;

public class VictorianChair implements Chair{
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair() {
        this.age = 0;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "VictorianChair";
    }
}