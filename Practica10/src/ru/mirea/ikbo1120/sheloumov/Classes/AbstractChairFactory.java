package ru.mirea.ikbo1120.sheloumov.Classes;

public interface AbstractChairFactory {
    public VictorianChair createVictrorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}