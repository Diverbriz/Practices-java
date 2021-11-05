package com.company;

public class Main {
    public static void main(String[] args) {
        //Testing Doges
        System.out.println("Testing Dog objects:");
        Dog d1 = new Dog("Chel", 5);
        Dog d2 = new Dog("SanSanich");
        d2.setAge(10);
        d1.setName("Alexandr");
        System.out.println(d1);
        System.out.println(d2);
        d1.intoHumanAge();
        d2.intoHumanAge();
        System.out.println();

        //Testing Balls
        System.out.println("Testing Ball objects:");
        Ball b1 = new Ball("Nike", 90.4F);
        Ball b2 = new Ball();
        b2.setCompany("Adidas");
        b2.pumpTheBall(70.23F);
        b1.pumpOutTheBall(10);
        System.out.println(b1);
        System.out.println(b2);
        b1.kickStrength(57);
        b2.kickStrength(68);
        System.out.println();

        //Testing Books
        System.out.println("Testing Book objects:");
        Book bk1 = new Book("Green ml", 450, 204);
        Book bk2 = new Book("1984", 380);
        bk2.setBookmark(64);
        System.out.println(bk1);
        System.out.println(bk2);
        bk1.symbolsCount(12);
        bk2.symbolsCount(14);
    }
}