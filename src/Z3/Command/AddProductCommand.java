package Z3.Command;

import Z3.Order;
import Z3.Product;


public class AddProductCommand implements Command{
    private Order order;
    private Product product;

    public AddProductCommand(Order order, Product product){
        this.order = order;
        this.product = product;
    }
    @Override
    public void execute() {
        this.order.addProduct(product);
    }
}
