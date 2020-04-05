package Z2;

import Z2.DoorModule.DoorController;
import Z2.DoorModule.DoorControllerImpl;
import Z2.HeatModule.HeatController;
import Z2.HeatModule.HeatControllerImpl;
import Z2.LightModule.LightController;
import Z2.LightModule.LightControllerImpl;

public class HomeControll {

    private static DoorController doorController = new DoorControllerImpl();
    private static HeatController heatController = new HeatControllerImpl();
    private static LightController lightController = new LightControllerImpl();

    public void openHouse(){
        doorController.unlock();
        doorController.open();
    }
    public void closeHouse(){
        doorController.close();
        doorController.lock();
    }
    public void setTemperature(double temperature){
        heatController.setTemperature(temperature);
    }
    public void turnHeatingOn(){
        heatController.turnOn();
    }
    public void turnHeatingOff(){
        heatController.turnOff();
    }
    public void turnLightOn(){
        lightController.turnOn();
    }
    public void turnLightOff(){
        lightController.turnOff();
    }
}
