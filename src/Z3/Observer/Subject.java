package Z3.Observer;

import Z3.Order;

public interface Subject {
    void register(Observer o);
    void notifyObservers(Order order);
}
