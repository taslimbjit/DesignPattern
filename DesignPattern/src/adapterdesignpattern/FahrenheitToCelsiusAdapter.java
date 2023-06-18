package adapterdesignpattern;

// Adapter class
class FahrenheitToCelsiusAdapter implements TemperatureProvider {
    private FahrenheitSensor fahrenheitSensor;

    public FahrenheitToCelsiusAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    public double getTemperature() {
        double temperatureInFahrenheit = fahrenheitSensor.getTemperatureInFahrenheit();
        double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5 / 9;
        return temperatureInCelsius;
    }
}
