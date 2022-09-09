package gondolatolvaso;

import java.util.Arrays;
import java.util.Scanner;

public class Gondolatolvaso {

    public static String[] pakli = new String[21];
    public static int[] oszlop1 = new int[7];
    public static int[] oszlop2 = new int[7];
    public static int[] oszlop3 = new int[7];

    public static void main(String[] args) {
        kiiras();
        for (int i = 0; i < 3; i++) {
            tipp();
            keveres();
            kiiras();
        }
        System.out.println(pakli[11]);
    }

    public static int tipp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik oszlopban van a kártyád?");
        int tipp = sc.nextInt();
        return tipp;
    }

    public static String[] kiiras() {
        for (int i = 0; i < Szinek.values().length; i++) {
            for (int j = 0; j < Ertekek.values().length; j++) {
                pakli[i * Ertekek.values().length + j] = Szinek.values()[i] + "_" + Ertekek.values()[j];
            }

        }

        System.out.println(Arrays.toString(pakli));
        return pakli;
    }

    private static void keveres() {

    }

}
