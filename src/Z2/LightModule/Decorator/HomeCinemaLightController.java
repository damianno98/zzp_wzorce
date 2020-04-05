package Z2.LightModule.Decorator;

import Z2.LightModule.LightController;

public class HomeCinemaLightController extends LightDecorator {

    public HomeCinemaLightController(LightController lightController) {
        super(lightController);
    }
    @Override
    public void turnOn() {
        System.out.print("[HomeCinema] ");
        decoratedLightController.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.print("[HomeCinema] ");
        decoratedLightController.turnOff();
    }

    public void setColor(String color){
        System.out.print("[HomeCinema] ");
        System.out.println("Color has been set to " + color);
    }
    public void turnOnDynamicLighting(){
        System.out.print("[HomeCinema] ");
        System.out.println("Dynamic Lightning has been turned on");
    }
}
