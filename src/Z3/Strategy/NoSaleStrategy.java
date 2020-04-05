package Z3.Strategy;

import Z3.Order;

public class NoSaleStrategy implements SaleStrategy {
    @Override
    public void calculateDiscount(Order order) {
        order.setDiscount(0);
    }
}
