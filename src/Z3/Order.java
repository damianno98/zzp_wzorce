package Z3;

import Z3.Drinks.Drink;
import Z3.Foods.Food;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Product> productList = new LinkedList<>();
    private double totalPrice;
    private double discount;

    public void addProduct(Product product){
        productList.add(product);
        totalPrice += product.getPrice();
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public List<Product> getProductList(){
        return productList;
    }

    public void getOrder(){
        productList.forEach(product -> System.out.print(product.getName() + " "));
        System.out.println();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", totalPrice=" + (totalPrice - discount) +
                '}';
    }
}
