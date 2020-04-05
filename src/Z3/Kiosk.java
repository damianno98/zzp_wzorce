package Z3;

import Z3.Command.OrderCommand;
import Z3.Observer.Observer;
import Z3.Observer.Subject;
import Z3.Strategy.NoSaleStrategy;
import Z3.Strategy.SaleStrategy;

import java.util.LinkedList;
import java.util.List;

public class Kiosk implements Subject {
    private List<Observer> observerList = new LinkedList<>();
    private SaleStrategy saleStrategy;
    public Kiosk(){
        this.saleStrategy = new NoSaleStrategy();
    }
    public void setSaleStrategy(SaleStrategy saleStrategy){
        this.saleStrategy = saleStrategy;
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void notifyObservers(Order order) {
        observerList.forEach(observer -> observer.update(order));
    }
    public void finzalizeOrder(OrderCommand order){
        saleStrategy.calculateDiscount(order.getOrder());
        order.execute();
        notifyObservers(order.getOrder());

    }
}
