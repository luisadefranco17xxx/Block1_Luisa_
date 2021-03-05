public class StringDemo {
    public static void main(String[] args) {


        String demo= "Heute ist Freitag";

        System.out.println(demo.length());
        System.out.println(demo.charAt(2));
        demo.charAt(2);
        demo.contains("Frei");

        int counter =100;     //print ping if odd nummer und pong if even
        while (counter>0) {
            if (counter%2==1) {
                System.out.println("ping");  //odd = ungerade
            }   else {
                System.out.println("pong");   // even = gerade
            }
            counter--;
        }

        counter =1;       // it whrites something when a nummer, between 500 und 1, divides 3,5,7 has rest 0
        while (counter<=500) {
            if ((counter%3==0) || (counter%5==0) ||(counter%7==0)) {
                System.out.println("3,5, or 7 are divisors of counter" + counter);
            }   else {
                //System.out.println("counter" + counter+ "nicht Div");
            }
            counter++;
        }


    }
}
