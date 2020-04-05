package Z3.Drinks;

import Z3.enums.DrinkType;

public class Juice extends Drink {
    public Juice(){
        super();
        drinkType = DrinkType.still;
        price = 4;
        this.name = "Juice";
    }
}
