package lld.DecoratorDesignPattern.PizzaMakingMachine.PizzaBase;

public class ThinCrustBase implements Pizza{

    @Override
    public int cost() {
        return 150;
    }
}
