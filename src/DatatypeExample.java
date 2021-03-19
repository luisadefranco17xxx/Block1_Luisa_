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



         System.out.println("Einige Beispiele zu Datentypen:");

///////////////////////////////////////////////////////////////////
         length = 5; // initialisierung
         width = 7; // initialisierung

         result = length * width; // initialisierung, auf rechten Seite: read/read

         System.out.println("Die Fläche von " + length + " und " +
                 width + " lautet: " + result + "cm²");

         a = 7;
         b = 5;
         c = 3;

         result = a / b;
         System.out.println("result = " + result);
         result = a = b * 3;
         System.out.println("a = " + a);
         System.out.println("result = " + result);

         a = 4;
         System.out.println("a = " + a);

        /*
        a = 11
        b = 3
        a = 9
        b = 5
        float
         */

         /*
          * a + b = 4 + 5 = 9
          * a - b = 4 - 5 = -1
          * a * b ...
          * a / b ...
          * a % b ...
          *  */
         System.out.println("INTEGER" );
         int c1 = a + b;
         int c2 = a - b;
         int c3 = a * b;
         System.out.println("a + b = " + a + " + " + b + " = " + c1);
         System.out.println("a - b = " + a + " - " + b + " = " + c2);
         System.out.println("a * b = " + a + " * " + b + " = " + c3);
         System.out.println("a * b = " + a + " / " + b + " = " + (a / b));
         System.out.println("a * b = " + a + " % " + b + " = " + (a % b));

         a = 11;
         b = 3;
         c = a + b;
         System.out.println("a + b = " + a + " + " + b + " = " + c);
         c = a - b;
         System.out.println("a - b = " + a + " - " + b + " = " + c);
         c = a * b;
         System.out.println("a * b = " + a + " * " + b + " = " + c);
         System.out.println("a * b = " + a + " / " + b + " = " + (a / b));
         System.out.println("a * b = " + a + " % " + b + " = " + (a % b));

         // float x, y, result2; => kein modulo %
         System.out.println("DOUBLE" );
         double x = 5, y = 3;
         System.out.println("x + y = " + x + " + " + y + " = " + (x + y));
         System.out.println("x - y = " + x + " - " + y + " = " + (x - y));
         System.out.println("x * y = " + x + " * " + y + " = " + (x * y));
         System.out.println("x / y = " + x + " / " + y + " = " + (x / y));
         //  1.6666666
         //  1.6666666666666667
         System.out.println("FLOAT" );
         float q = 5, w = 3;
         System.out.println("x + y = " + x + " + " + y + " = " + (q + w));
         System.out.println("x - y = " + x + " - " + y + " = " + (q - w));
         System.out.println("x * y = " + x + " * " + y + " = " + (q * w));
         System.out.println("x / y = " + x + " / " + y + " = " + (q / w));

    }
}
