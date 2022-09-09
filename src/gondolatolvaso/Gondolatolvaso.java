package gondolatolvaso;

import java.util.Arrays;
import java.util.Scanner;

public class Gondolatolvaso {

    public static String[] pakli = new String[21];
    public static int[] oszlop1 = new int[7];
    public static int[] oszlop2 = new int[7];
    public static int[] oszlop3 = new int[7];
    public static String szinek[] = {"P", "T", "Z"};
    public static String ertekek[] = {"VIII", "IX", "X", "ALS","FEL", "KIR", "ASZ"};

    public static void main(String[] args) {
        kiiras();
        for (int i = 0; i < 3; i++) {
            tipp();
            keveres();
            kiiras();
        }
    }

    public static int tipp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik oszlopban van a kártyád?");
        int tipp = sc.nextInt();
        return tipp;
    }
    public static String[] kiiras() {
        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; j < ertekek.length; j++) {
                pakli[i*ertekek.length+j] = szinek[i] + "_" + ertekek[j];
            }

        }

        System.out.println(Arrays.toString(pakli));
        return pakli;
    }

    private static void keveres() {
        
    }



}
