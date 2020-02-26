package ch.hesge.cours634.counter;

import ch.hesge.cours634.counter.*;

public class Main {
    public void M1(){
        Counter c1 = new Counter(44);
        System.out.println("Actual Value :"+c1);
        c1.add(5);
        System.out.println("Added 5 :"+c1);
        c1.inc();
        System.out.println("Added inc :"+c1);
    }

    public void M2(){
        UpperLimitedPositiveCounter c2 = new UpperLimitedPositiveCounter(4,0,5);
        System.out.println("Actual Value :"+c2.value + " min:" + c2.min + " max: " + c2.max);
        System.out.println("Added 5 :");
        c2.add(5);
        System.out.println(c2.getValue());
        System.out.println("Added inc :");
        c2.inc();
        System.out.println(c2.getValue());
    }
}
