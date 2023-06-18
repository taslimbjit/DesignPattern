package bridgedesignpattern;

public class Main {
    public static void main(String[] args) {
        Tap hotWaterTap = new HotWaterTap();
        Tap coldWaterTap = new ColdWaterTap();

        WashingMachine standardWashingMachine = new StandardWashingMachine(hotWaterTap);
        WashingMachine deluxeWashingMachine = new DeluxeWashingMachine(coldWaterTap);

        standardWashingMachine.start();
        standardWashingMachine.stop();

        deluxeWashingMachine.start();
        deluxeWashingMachine.stop();
    }
}
