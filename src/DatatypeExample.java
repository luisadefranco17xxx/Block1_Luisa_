import javax.sql.rowset.serial.SerialBlob;
import java.util.Arrays;

public class DatatypeExample {

     public static void main(String[] args) {

        System.out.println("Beispiele Datatype");
        int  length;
        int  width;
        int result;

        length=5;
        width=7;
        result = length * width;
        System.out.println("Ergebnis:length"+length+"*breite with"+width+"result" + result + "cm2");

        int a, b, c;
        a=7;
        b=5;
        c=3;
        result= a/b;
         System.out.println("result"+result);
         a=4;
         result= a+b;
         System.out.println("Beispiele 1");
         System.out.println("a="+a);
         System.out.println("b="+b);
         System.out.println("a+b="+a+"+"+b+"="+ result);
         result = a-b;
         System.out.println("a-b="+a+"-"+b+"="+ result);
         result = a/b;
         System.out.println("a/b="+a+"/"+b+"="+ result);
         result = a*b;
         System.out.println("a*b="+a+"*"+b+"="+ result);
         result = a%b;
         System.out.println("a Mod b="+a+"%"+b+"="+ result);

         System.out.println("Beispiele 2");
         a=11;
         b=3;
         System.out.println("a+b="+a+"+"+b+"="+ result);
         result = a-b;
         System.out.println("a-b="+a+"-"+b+"="+ result);
         result = a/b;
         System.out.println("a/b="+a+"/"+b+"="+ result);
         result = a*b;
         System.out.println("a*b="+a+"*"+b+"="+ result);
         result = a%b;
         System.out.println("a Mod b="+a+"%"+b+"="+ result);

         System.out.println("Beispiele 3");
         a=9;
         b=5;
         System.out.println("a+b="+a+"+"+b+"="+ result);
         result = a-b;
         System.out.println("a-b="+a+"-"+b+"="+ (a-b));
         result = a/b;
         System.out.println("a/b="+a+"/"+b+"="+ result);
         result = a*b;
         System.out.println("a*b="+a+"*"+b+"="+ result);
         result = a%b;
         System.out.println("a Mod b="+a+"%"+b+"="+ result);

         System.out.println("Beispiele 4");
         float float_result=0;

         float float_a=9;
         float float_b=5;
         float_result = float_a +float_b;
         System.out.println("a+b="+float_a+"+"+float_b+"="+ float_result);
         float_result = float_a-float_b;
         System.out.println("a-b="+float_a+"-"+float_b+"="+ float_result);
         float_result = float_a/float_b;
         System.out.println("a/b="+float_a+"/"+float_b+"="+ float_result);
         float_result = float_a*float_b;
         System.out.println("a*b="+float_a+"*"+float_b+"="+ float_result);
         float_result = float_a%float_b;
         System.out.println("a Mod b="+float_a+"%"+float_b+"="+ result);



    }
}
