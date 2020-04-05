package Z3.Strategy;

import Z3.Drinks.Drink;
import Z3.Order;
import Z3.enums.DrinkType;
import Z3.enums.ProductType;

public class SparklingDrinkSaleStrategy implements SaleStrategy {
    private double discount = 0;
    @Override
    public void calculateDiscount(Order order) {
        if(order.getTotalPrice() > 30){
            order.getProductList().stream()
                    .filter(product -> product.getType() == ProductType.drink)
                    .forEach(product -> {
                        if (((Drink)product).getDrinkType() == DrinkType.sparkling)
                            discount += product.getPrice() - 0.01;
                    });
        }
        order.setDiscount(discount);
    }
}
