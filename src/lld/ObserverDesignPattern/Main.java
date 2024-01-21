package lld.ObserverDesignPattern;

import lld.ObserverDesignPattern.Observer.Person;
import lld.ObserverDesignPattern.Observer.Observer;
import lld.ObserverDesignPattern.Subject.Subject;
import lld.ObserverDesignPattern.Subject.MobilePhone;

public class Main {
    public static void main(String[] args){
        Subject sub1 = new MobilePhone("Motorola");

        Observer obj1 = new Person("Arif", sub1);
        Observer obj2 = new Person("Ram", sub1);

        sub1.addObserver(obj1);
        sub1.addObserver(obj2);

        sub1.setState(1);
    }
}
