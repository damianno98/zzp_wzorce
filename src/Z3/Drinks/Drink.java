package Z3.Drinks;

import Z3.Product;
import Z3.enums.DrinkType;
import Z3.enums.ProductType;

public abstract class Drink extends Product {
    protected DrinkType drinkType;
    public Drink(){
        super();
        productType = ProductType.drink;
    }
    public ProductType getProductType() {
        return this.productType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public double getPrice() {
        return price;
    }
}
