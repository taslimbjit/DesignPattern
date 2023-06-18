package bridgedesignpattern;

public class HotWaterTap implements Tap {
    @Override
    public void open() {
        System.out.println("Hot water tap opened");
    }

    @Override
    public void close() {
        System.out.println("Hot water tap closed");
    }
}