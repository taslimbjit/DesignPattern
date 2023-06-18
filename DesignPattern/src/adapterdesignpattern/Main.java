package adapterdesignpattern;

public class Main {
    public static void main(String[] args) {
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
        TemperatureProvider temperatureProvider = new FahrenheitToCelsiusAdapter(fahrenheitSensor);
        double temperatureInCelsius = temperatureProvider.getTemperature();
        System.out.println("Temperature in Celsius: " + temperatureInCelsius);
    }
}