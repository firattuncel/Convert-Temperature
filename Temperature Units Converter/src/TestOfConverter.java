/**
 * Conversion between celsius, fahrenheit and kelvin
 * using lambda expressions
 */
public class TestOfConverter {
    public static void main(String[] args) {
        System.out.print("Celsius to Kelvin: ");
        Converter celsiusToKelvin = (double celsius) -> {System.out.println(celsius + 273.15);};
        doConvert(celsiusToKelvin, 20);
        System.out.print("Kelvin to Celcius: ");
        Converter kelvinToCelsius = (double kelvin) -> {System.out.println(kelvin - 273.15);};
        doConvert(kelvinToCelsius, 288.15);

        System.out.println();

        System.out.print("Fahrenheit to Celcius: ");
        Converter fahrenheitToCelcius = (double fahrenheit) -> {System.out.println((fahrenheit - 32) * 5.0 / 9.0);};
        doConvert(fahrenheitToCelcius, 59);
        System.out.print("Celsius to Fahrenheit: ");
        Converter celciusToFahrenheit = (double celcius) -> {System.out.println((celcius * 9.0 / 5.0) + 32);};
        doConvert(celciusToFahrenheit, 15);

        System.out.println();

        System.out.print("Fahrenheit to Kelvin: ");
        Converter fahrenheitToKelvin = (double fahrenheit) -> {System.out.println((fahrenheit - 32) * (5.0 / 9.0) + 273.15);};
        doConvert(fahrenheitToKelvin, 50);
        System.out.print("Kelvin to Fahrenheit: ");
        Converter kelvinToFahrenheit = (double kelvin) -> {System.out.println((kelvin - 273.15) * (9.0 / 5.0) + 32);};
        doConvert(kelvinToFahrenheit, 283.15);
    }
    public static void doConvert(Converter converter, double unit){
        converter.convert(unit);
    }
}
