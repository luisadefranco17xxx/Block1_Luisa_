public class BruttoNetto {
    public static void main(String[] args) {
        System.out.println("");

        float a=100; //nettoPrise
        double b= 0.2 ; //Steuer
        double c;//bruttoPrise
        int maxTax =50;
        double calculatedTax;
        //booblean maxTest |

        c= a+a*b;
        System.out.println("Bruttoprise ist=nettoPrise+Steuer="+c);

        int language =1; //1 Deutsch, 2 Englisch
        int schul_note=1;

        printNameToGrade(schul_note, language);
        taxClass(1);


    }

    public static void taxClass(int tax_class) {
        int tax=0;
        switch (tax_class){
            case 1: // wenn tax_class == 1, dann mach diesen Fall
                tax = 20;
                System.out.println("tax_class=1, das heißt 20%");
                break; // der Fall muss immer mit break abgeschlossen
            case 2:
                tax = 16;
                break;
            case 3:
                tax = 8;
                break;
            default: // sonst/else
                tax = 0;
                System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
        }

    }


    public static void printNameToGrade(int grade, int language){

        if (grade==1 && language==1) {
            System.out.println("sehr gut");
        }  else if(grade==2 && language==1) {
            System.out.println("gut");
        }  else if(grade==3 && language==1) {
            System.out.println("genügend");
        }  else if(grade==4 && language==1) {
            System.out.println("befriedigend");
        }  else if(grade==5 && language==1) {
            System.out.println("unenügend");
        } else if (grade==1 && language==2) {
            System.out.println("A ");
        }  else if(grade==2 && language==2) {
            System.out.println("B");
        }  else if(grade==3 && language==2) {
            System.out.println("C");
        }  else if(grade==4 && language==2) {
            System.out.println("D");
        }  else if(grade==5 && language==2) {
            System.out.println("F");
        } else {
            System.out.println("keine gültige note");
        }

    }
}
