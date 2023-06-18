package bridgedesignpattern;

public class ColdWaterTap implements Tap {
    @Override
    public void open() {
        System.out.println("Cold water tap opened");
    }

    @Override
    public void close() {
        System.out.println("Cold water tap closed");
    }
}