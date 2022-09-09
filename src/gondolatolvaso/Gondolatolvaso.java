package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    public static String[] pakli = new String[21];
    public static int[] oszlop1 = new int[7];
    public static int[] oszlop2 = new int[7];
    public static int[] oszlop3 = new int[7];

    public static void main(String[] args) {
        feltolt();
        kiiras();
        for (int i = 0; i < 3; i++) {
            keveres(tipp());
            kiiras();
        }
        System.out.println(pakli[11]);
    }

    public static int tipp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik oszlopban van a kártyád? ");
        int tipp = sc.nextInt();
        return tipp;
    }

    public static void feltolt() {
        Szinek[] s = Szinek.values();
        Ertekek[] e = Ertekek.values();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < e.length; j++) {
                pakli[i * e.length + j] = s[i] + "_" + e[j];
            }

        }
    }

    private static void keveres(int tipp) {

    }

    private static void kiiras() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.print(pakli[i] + "\t");
            if (i % Szinek.values().length == Szinek.values().length - 1) {
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

}
