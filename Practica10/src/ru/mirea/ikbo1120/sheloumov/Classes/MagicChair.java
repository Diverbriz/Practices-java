package ru.mirea.ikbo1120.sheloumov.Classes;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Вжух, и стул взлетел...");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}