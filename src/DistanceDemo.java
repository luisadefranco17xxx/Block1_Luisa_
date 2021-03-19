public class DistanceDemo {
    public static void main(String[] args) {

        int km = 199;
        System.out.println( km + " kilometer to miles:");
        System.out.println(kilometerToMile(km));

        int miles = 20;
        System.out.println(miles + " miles to kilometer:");
        System.out.println(mileToKilometer(miles));

    }

        public static double kilometerToMile(double kilometer) {

            double miles=0;
            double KONVERTER= 0.62;

            miles=  (kilometer * KONVERTER);

            return miles;
        }

    public static double mileToKilometer(double miles) {

        double kilometer=0;
        double KONVERTER= 1.61;

        kilometer= (miles * KONVERTER);

        return kilometer;
    }
}
