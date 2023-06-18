package adapterdesignpattern;

// Adaptee class
class FahrenheitSensor {
    double getTemperatureInFahrenheit() {
        double temperature = 74.5; // Simulated temperature reading
        return temperature;
    }
}