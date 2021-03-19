public class FindFactorDemo {
    public static void main(String[] args) {

        findFactors(21);
    }

    public static void findFactors(int nummer){

        int counter =nummer;
        while (counter>0) {

            if (nummer%counter==0) {
                System.out.println("The nummer"+nummer+" divides"+ counter +" (Rest 0)");
            }
            counter--;
        }


    }

}
