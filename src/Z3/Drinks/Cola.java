package Z3.Drinks;

import Z3.enums.DrinkType;

public class Cola extends Drink {
    public Cola(){
        super();
        drinkType = DrinkType.sparkling;
        price = 6;
        this.name = "Cola";
    }
}
