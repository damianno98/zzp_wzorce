package Z3.Drinks;

import Z3.enums.DrinkType;

public class Tea extends Drink {
    public Tea(){
        super();
        drinkType = DrinkType.hot;
        price = 5;
        this.name = "Tea";
    }
}
