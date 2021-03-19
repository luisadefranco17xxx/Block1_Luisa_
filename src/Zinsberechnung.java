public class Zinsberechnung {
    public static void main(String[] args) {

        int kontostand= 1000;
        double zinsen = 2.25;

        System.out.println(calcInterest(kontostand));


    }

    public static double calcInterest(int kontostand){
        double zinsen = 0.0225;
        double neuKontostand = kontostand + (kontostand*zinsen);

        return neuKontostand;
    }

}
