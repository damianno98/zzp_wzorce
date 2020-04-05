package Z3.Drinks;

import Z3.enums.DrinkType;

public class Water extends Drink{
    public Water(){
        super();
        drinkType = DrinkType.still;
        price = 2.5;
        this.name = "Water";
    }
}
