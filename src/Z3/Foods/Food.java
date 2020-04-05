package Z3.Foods;

import Z3.Product;
import Z3.enums.ProductType;

public abstract class Food extends Product {
    public Food(){
        super();
    }
    public double getPrice() {
        return price;
    }
}
