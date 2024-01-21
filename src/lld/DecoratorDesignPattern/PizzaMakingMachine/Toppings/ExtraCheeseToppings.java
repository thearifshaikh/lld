package lld.DecoratorDesignPattern.PizzaMakingMachine.Toppings;

import lld.DecoratorDesignPattern.PizzaMakingMachine.PizzaBase.Pizza;

public class ExtraCheeseToppings implements Toppings{

    Pizza pizza;

    public ExtraCheeseToppings(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+100;
    }
    
}
