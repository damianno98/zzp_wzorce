package Z3.Strategy;

import Z3.Foods.Food;
import Z3.Order;
import Z3.Product;
import Z3.enums.ProductType;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class TenPercentSale implements SaleStrategy {
    private double discount = 0;
    @Override
    public void calculateDiscount(Order order) {
        Map<ProductType, Long> map = order.getProductList().stream()
                .collect(Collectors.groupingBy(Product::getType, counting()));
        map.entrySet().removeIf(entry -> entry.getValue() <= 2);

        for(ProductType type: map.keySet()){
            double minValue = 1<<30;
            for(Product product: order.getProductList()){
                if(product.getType() == type && product.getPrice() < minValue){
                    minValue = product.getPrice();
                }
            }
            discount += 0.1 * minValue;
        }
        order.setDiscount(discount);
    }
}
