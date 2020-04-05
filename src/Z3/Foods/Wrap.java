package Z3.Foods;

import Z3.enums.ProductType;

public class Wrap extends Food {
    public Wrap() {
        super();
        this.productType = ProductType.wrap;
        this.price = 12;
        this.name = "wrap";
    }
}
