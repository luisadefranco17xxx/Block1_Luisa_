public class DemoCalcDigitSum {

    public static void main(String[] args) {

        // 54321 => 15
        // 9876543 = 42
        // 12 = 3
        System.out.println(calcDigitSum(3456));
        System.out.println(calcDigitSum(66644));
    }

    public static int calcDigitSum(int value) { // Method signature

        int ziffersumme = 0;
        while (value > 0) {

            ziffersumme = ziffersumme + (value % 10); //
            value = value/10;
            System.out.println("result von value/10 in interger(without nummer after the comma): "+ value);
        }
        return ziffersumme;
    }



}
