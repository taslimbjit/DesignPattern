package bridgedesignpattern;

public class StandardWashingMachine extends WashingMachine {
    public StandardWashingMachine(Tap tap) {
        super(tap);
    }

    @Override
    public void start() {
        tap.open();
        System.out.println("Standard washing machine started");
    }

    @Override
    public void stop() {
        System.out.println("Standard washing machine stopped");
        tap.close();
    }
}
