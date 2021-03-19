public class TemperatureDemo<fahrenheit> {

    public static void main(String[] args) {


        int celsius = -2;
        System.out.println(celsius + " celsius to fahrenheit:");
        System.out.println(celsiusToFahreneit(celsius));

        int fahrenheit = 19;
        double resultCelsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " grad fahrenheit are" + resultCelsius + " celsius:");
        System.out.println(fahrenheitToCelsius(fahrenheit));
        System.out.println(resultCelsius);
    }

    public static double celsiusToFahreneit(double celsius) {

        double fahrenheit;
        double CONSTANT= 1.8;

        fahrenheit=  ((celsius * CONSTANT)+32);

        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius;
        double CONSTANT= 0.55;
        double CONSTANT2= 5/9;  // =0  ??

        celsius=  ((fahrenheit-32.0)*CONSTANT);
        return  celsius;
    }

}
