package lld.DecoratorDesignPattern.PizzaMakingMachine;

import lld.DecoratorDesignPattern.PizzaMakingMachine.PizzaBase.CheeseBurstBase;
import lld.DecoratorDesignPattern.PizzaMakingMachine.PizzaBase.Pizza;
import lld.DecoratorDesignPattern.PizzaMakingMachine.Toppings.MushroomToppings;

public class Main {
    public static void main(String[] args){
        Pizza myPizza=new MushroomToppings(new CheeseBurstBase());
        System.out.println("Cost of myPizza is "+myPizza.cost());
    }
}
