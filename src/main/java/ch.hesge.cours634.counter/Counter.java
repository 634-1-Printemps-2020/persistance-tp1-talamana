package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    int value;

    public Counter(int value) {
        this.value = value;
    }

    public void inc(){
        value++;
    }
    public void add(int toAdd){
        value += toAdd;
    }
    public int getValue(){
        return value;
    }
}









