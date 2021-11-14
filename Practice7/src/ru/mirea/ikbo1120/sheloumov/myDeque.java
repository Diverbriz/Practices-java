package ru.mirea.ikbo1120.sheloumov;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class myDeque {
   private ArrayDeque<Integer> firstDeck, secondDeck;

    public Game(){
        firstDeck = new ArrayDeque<Integer>();
        secondDeck = new ArrayDeque<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chisla dly 1 igroka");
        for(int i = 0; i < 5; i++)
            firstDeck.add(scanner.nextInt());
        System.out.println("Vvedite chisla dly 2 igroka");
        for(int i = 0; i < 5; i++)
            secondDeck.add(scanner.nextInt());

        System.out.println("Karti 1 igroka");
        for(Integer deck : firstDeck)
            System.out.print(" " + deck);
        System.out.println("\nKarti 2 igroka");
        for(Integer deck : secondDeck)
            System.out.print(" " + deck);

        System.out.println("\n");
        int hod = 0;

        while(true){
            hod++;
            Integer firstElement, secondElement;
            firstElement = firstDeck.pollFirst();
            secondElement = secondDeck.pollFirst();

            if(firstElement == null || secondElement == null || hod == 106)
                break;
            if(secondElement == 0 && firstElement == 9){
                secondDeck.addLast(firstElement);
                secondDeck.addLast(secondElement);
            }
            else if(firstElement == 0 && secondElement == 9){
                firstDeck.addLast(firstElement);
                firstDeck.addLast(secondElement);
            }
            if(firstDeck.isEmpty() || secondDeck.isEmpty()|| hod==106)
                break;
            if(firstElement > secondElement) {
                firstDeck.addLast(firstElement);
                firstDeck.addLast(secondElement);
            }
            else {
                secondDeck.addLast(firstElement);
                secondDeck.addLast(secondElement);
            }
        }
        String winner = (!firstDeck.isEmpty()) ? "First " : "Second ";
        String out = (hod == 106) ? "botva" : winner + hod;
        System.out.println("\n" + out);
    }
}
