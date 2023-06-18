package bridgedesignpattern;

public class DeluxeWashingMachine extends WashingMachine {
    public DeluxeWashingMachine(Tap tap) {
        super(tap);
    }

    @Override
    public void start() {
        tap.open();
        System.out.println("Deluxe washing machine started");
    }

    @Override
    public void stop() {
        System.out.println("Deluxe washing machine stopped");
        tap.close();
    }
}