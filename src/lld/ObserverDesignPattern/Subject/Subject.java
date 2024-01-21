package lld.ObserverDesignPattern.Subject;

import lld.ObserverDesignPattern.Observer.Observer;

public interface Subject {
    public void addObserver(Observer obj);
    public void removeObserver(Observer obj);
    public void notifyObservers();
    public String getName();
    public void setState(int x);
}
