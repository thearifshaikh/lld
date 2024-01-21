package lld.ObserverDesignPattern.Subject;

import java.util.ArrayList;
import java.util.List;

import lld.ObserverDesignPattern.Observer.Observer;

public class MobilePhone implements Subject{

    List<Observer>observerList=new ArrayList<>();
    int state;
    String name;

    public MobilePhone(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setState(int state){
        this.state=state;
        notifyObservers();
    }

    public int getState(){
        return state;
    }

    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer obj:observerList) {
            obj.update();
        }
    }
}
