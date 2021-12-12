package ru.mirea.ikbo1120.sheloumov.Classes;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image, '+');
    }
}
