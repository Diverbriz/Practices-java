package ru.mirea.ikbo1120.sheloumov;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Колоды: ");
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        System.out.println("\nStack:");
        System.out.println(myStack.play(first, second));
        System.out.println("\nQueue:");
        System.out.println(myQueue.play(first, second));
        System.out.println("\nDeque:");
        System.out.println(myDeque.play(first, second));
        System.out.println("\nDoubleList:");
        System.out.println(myDoubleList.play(first, second));
    }
}
