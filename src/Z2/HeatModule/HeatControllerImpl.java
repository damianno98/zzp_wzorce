package Z2.HeatModule;

public class HeatControllerImpl implements HeatController {
    @Override
    public void turnOn() {
        System.out.println("Heating has been started");
    }

    @Override
    public void turnOff() {
        System.out.println("Heating has been stopped");
    }

    @Override
    public void setTemperature(double temperature) {
        System.out.println("Heating temperature has been set to " + temperature);
    }
}
