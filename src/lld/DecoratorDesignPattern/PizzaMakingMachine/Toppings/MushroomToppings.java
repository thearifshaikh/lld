package lld.DecoratorDesignPattern.PizzaMakingMachine.Toppings;

import lld.DecoratorDesignPattern.PizzaMakingMachine.PizzaBase.Pizza;
public class MushroomToppings implements Toppings{

    Pizza pizza;

    public MushroomToppings(Pizza pizza){
        this.pizza=pizza;
    }
    
    @Override
    public int cost() {
        return pizza.cost()+50;
    }
}
