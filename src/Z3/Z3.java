package Z3;

import Z3.Command.AddProductCommand;
import Z3.Command.OrderCommand;
import Z3.Drinks.Cola;
import Z3.Foods.CheeseBurger;
import Z3.Foods.Fries;
import Z3.Foods.Wrap;
import Z3.Strategy.TenPercentSale;

public class Z3 {
    public static void main(String[] args){
        Kiosk kiosk = new Kiosk();
        Kitchen kitchen = new Kitchen();

        kiosk.register(kitchen);
        Order order = new Order();
        AddProductCommand addCheeseBurger = new AddProductCommand(order, new CheeseBurger());
        AddProductCommand addCola = new AddProductCommand(order, new Cola());
        AddProductCommand addFries = new AddProductCommand(order, new Fries());
        OrderCommand finishOrder= new OrderCommand(order);
        addCheeseBurger.execute();
        addCheeseBurger.execute();
        addCola.execute();
        addFries.execute();
        addFries.execute();
        addFries.execute();
        kiosk.setSaleStrategy(new TenPercentSale());
        kiosk.finzalizeOrder(finishOrder);
    }
}
