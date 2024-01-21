package lld.ObserverDesignPattern.Observer;

import lld.ObserverDesignPattern.Subject.Subject;

public class Person implements Observer{

    Subject subject;
    String name;

    public Person(String name, Subject subject){
        this.name=name;
        this.subject=subject;
    }

    public String getName(){
        return this.name;
    }

    public void setSubject(Subject subject){
        this.subject=subject;
    }

    public Subject getSubject(){
        return this.subject;
    }

    @Override
    public void update() {
        System.out.println("Sending update to "+name+" for "+subject.getName());   
    }
}
