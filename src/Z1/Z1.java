package Z1;

public class Z1 {
    public static void main(String[] args){
        Pizza pizza = new Pizza.PizzaBuilder(Size.small, Sauce.tomato).ingredient(Ingredient.cheese).ingredient(Ingredient.ham).build();
        Pizza calzone = new Pizza.PizzaBuilder(Size.large, Sauce.cream).ingredient(Ingredient.mushroom).ingredient(Ingredient.onion).calzone(SaucePosition.outside).build();
        System.out.println(pizza.toString());
        System.out.println(calzone.toString());
    }
}
