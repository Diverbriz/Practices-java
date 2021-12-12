package ru.mirea.ikbo1120.sheloumov.Classes;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public void sit(){
        System.out.println("Я сижу на " + chair);
    }
}