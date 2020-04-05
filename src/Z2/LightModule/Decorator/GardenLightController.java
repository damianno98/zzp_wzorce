package Z2.LightModule.Decorator;

import Z2.LightModule.LightController;

public class GardenLightController extends LightDecorator{

    public GardenLightController(LightController lightController) {
        super(lightController);
    }

    @Override
    public void turnOn() {
        System.out.print("[Garden] ");
        decoratedLightController.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.print("[Garden] ");
        decoratedLightController.turnOn();
    }
    public void dimmLight(){
        System.out.print("[Garden] ");
        System.out.println("The light has been dimmed for 50%");
    }
}
