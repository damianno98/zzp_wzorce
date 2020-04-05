package Z2.DoorModule;

public class DoorControllerImpl implements DoorController {

    @Override
    public void open() {
        System.out.println("Door has been opened");
    }

    @Override
    public void close() {
        System.out.println("Door has been closed");
    }

    @Override
    public void lock() {
        System.out.println("Door has been locked");
    }

    @Override
    public void unlock() {
        System.out.println("Door has been unlocked");
    }
}
