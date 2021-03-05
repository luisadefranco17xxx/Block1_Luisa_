public class TemperatureDemo {

    public static void main(String[] args) {

    int fahrenheit = 19;
        double resultCelsius = currentTemperaturesCelsius(fahrenheit);
        System.out.println( fahrenheit + "fahrenheit to celsius:");
        System.out.println(currentTemperaturesCelsius(fahrenheit));
        System.out.println(resultCelsius);

    int celsius = -2;
        System.out.println(celsius + "celsius to fahrenheit:");
        System.out.println(currentTemperaturesFahrenheit(celsius));

}

    public static double currentTemperaturesFahrenheit(double celsius) {

        double fahrenheit=0;
        double KONVERTER= 1.8;

        fahrenheit=  ((celsius * KONVERTER)+32);

        return fahrenheit;
    }

    public static double currentTemperaturesCelsius(double fahrenheit) {

        double celsius=0;
        double KONVERTER= (5/8);

        celsius=  ((fahrenheit-32)*KONVERTER);

        return  celsius;
    }

}
