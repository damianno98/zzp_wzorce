package Z2;

import Z2.LightModule.Decorator.HomeCinemaLightController;
import Z2.LightModule.LightControllerImpl;

public class Z2 {

    public static void main (String[] args){
        HomeControll homeControll = new HomeControll();
        homeControll.turnLightOn();
        homeControll.openHouse();
        homeControll.setTemperature(20);
        homeControll.turnHeatingOn();

        HomeCinemaLightController homeCinema = new HomeCinemaLightController(new LightControllerImpl());
        homeCinema.setColor("RED");
        homeCinema.turnOnDynamicLighting();
        homeCinema.turnOff();
    }
}
