package Z3.Command;

import Z3.Order;
import Z3.Product;

public class OrderCommand implements Command {
    private Order order;

    public OrderCommand(Order order){
        this.order = order;
    }

    @Override
    public void execute() {
        order.getOrder();
    }

    public Order getOrder() {
        return order;
    }
}
