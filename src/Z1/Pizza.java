package Z1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {
    private final Size pizzaSize;
    private final Sauce pizzaSauce;
    private final List<Ingredient> ingredients;
    private final boolean calzone;
    private final SaucePosition saucePosition;

    private Pizza(PizzaBuilder builder) {
        this.pizzaSize = builder.pizzaSize;
        this.pizzaSauce = builder.pizzaSauce;
        this.ingredients = builder.ingredients;
        this.calzone = builder.calzone;
        this.saucePosition = builder.saucePosition;
    }

        public static class PizzaBuilder {
            private final Size pizzaSize;
            private final Sauce pizzaSauce;

            private boolean calzone = false;
            private SaucePosition saucePosition;
            private List<Ingredient> ingredients = new LinkedList<>();

            public PizzaBuilder(Size size, Sauce sauce){
                this.pizzaSize = size;
                this.pizzaSauce = sauce;
                this.saucePosition = SaucePosition.outside;
            }

            public PizzaBuilder ingredient(Ingredient ingredient){
                this.ingredients.add(ingredient);
                return this;
            }
            public PizzaBuilder calzone(SaucePosition saucePosition){
                this.saucePosition = saucePosition;
                this.calzone = true;
                return this;
            }
            public Pizza build(){
                return new Pizza(this);
            }
        }

    @Override
    public String toString() {
        if (calzone) {
            return pizzaSize.name() + " calzone with: " +
                    ingredients.stream()
                            .map(Enum::name)
                            .collect(Collectors.joining(", ", "[", "]")) +
                    " on " + pizzaSauce.name() + " sauce placed " + saucePosition.name();
        }
        else {
            return pizzaSize.name() + " pizza with: " +
                    ingredients.stream()
                            .map(Enum::name)
                            .collect(Collectors.joining(", ", "[", "]")) +
                    " on " + pizzaSauce.name() + " sauce";
        }
    }
}


