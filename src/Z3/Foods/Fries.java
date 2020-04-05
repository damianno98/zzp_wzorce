package Z3.Foods;

import Z3.Product;
import Z3.enums.ProductType;

public class Fries extends Food {
    public Fries() {
        super();
        productType = ProductType.snack;
        this.price = 6;
        this.name = "fries";
    }
}
