package ru.mirea.ikbo1120.sheloumov.Classes;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictrorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}