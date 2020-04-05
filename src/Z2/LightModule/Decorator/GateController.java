package Z2.LightModule.Decorator;

import Z2.LightModule.LightController;

public class GateController extends LightDecorator {

    public GateController(LightController lightController) {
        super(lightController);
    }

    @Override
    public void turnOn() {
        System.out.print("[Gate] ");
        decoratedLightController.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.print("[Gate] ");
        decoratedLightController.turnOff();
    }


}
