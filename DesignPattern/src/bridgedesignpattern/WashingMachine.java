package bridgedesignpattern;

public abstract class WashingMachine {
    protected Tap tap;

    public WashingMachine(Tap tap) {
        this.tap = tap;
    }

    public abstract void start();
    public abstract void stop();
}
