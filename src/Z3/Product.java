package Z3;

import Z3.enums.ProductType;

public abstract class Product{
    protected  ProductType productType;
    protected double price;
    protected String name;

    public double getPrice(){
        return price;
    }
    public ProductType getType(){
        return productType;
    }
    public String getName(){
        return name;
    }
}
