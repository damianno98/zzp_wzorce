package Z3;

import Z3.Observer.Observer;

public class Kitchen implements Observer {
    @Override
    public void update(Order order) {
        System.out.println(order.toString());
    }
}
