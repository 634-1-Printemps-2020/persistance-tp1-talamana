package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    int min,max;

    public UpperLimitedPositiveCounter(int value, int min, int max) {
        super(value);
        this.min = min;
        this.max = max;
    }

    public void inc() throws CounterException{
        int updatedvalue = value ++;
        if ((updatedvalue < min) || (updatedvalue>max))
            throw new CounterException("Valeur en dehors du min/max !");
        value = updatedvalue;
    }
    public void add(int toAdd) throws CounterException{
        int updatedvalue = value + toAdd;
        if ((updatedvalue < min) || (updatedvalue>max))
            throw new CounterException("Valeur en dehors du min/max !");
        value = updatedvalue;
    }
    public int getValue(){
        return value;
    }
}
/*
Ce que j'aurais fait, c'est de simplifier les methodes inc et add comme suit :


    public void inc(){
        addMethod(1);
    }
    public void add(int toAdd){
        addMethod(toAdd);
    }
    public int getValue(){
        return value;
    }

    public void addMethod(int valueToAdd) throws CounterException{
        int updatedvalue = value + valueToAdd;
        if ((updatedvalue < min) || (updatedvalue>max))
            throw new CounterException();
        value = updatedvalue;
    }

Mais pour le faire il aurait fallu modifier ICounter ce qui n'est possible selon l'énoncé



 */