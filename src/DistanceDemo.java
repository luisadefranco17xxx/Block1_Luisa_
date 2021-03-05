public class DistanceDemo {
    public static void main(String[] args) {

        int km = 199;
        System.out.println( km + " kilometer to miles:");
        System.out.println(kilometerToMile(km));

        int miles = 20;
        System.out.println(miles + " miles to kilometer:");
        System.out.println(kilometerToMile(miles));

    }

        public static int kilometerToMile(int kilometer) {

            int miles=0;
            double KONVERTER= 0.62;

            miles= (int) (kilometer * KONVERTER);

            return miles;
        }

    public static int mileToKilometer(int miles) {

        int kilometer=0;
        double KONVERTER= 1.61;

        kilometer= (int) (miles * KONVERTER);

        return kilometer;
    }
}
