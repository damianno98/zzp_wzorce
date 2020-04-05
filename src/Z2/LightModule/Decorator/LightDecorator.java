package Z2.LightModule.Decorator;

import Z2.LightModule.LightController;
import Z2.Z2;

public abstract class LightDecorator implements LightController {
    protected LightController decoratedLightController;
    public LightDecorator(LightController lightController){
        this.decoratedLightController = lightController;
    }
    public void turnOn(){
        decoratedLightController.turnOn();
    }
    public void turnOff(){
        decoratedLightController.turnOff();
    }
}
