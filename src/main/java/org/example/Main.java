package org.example;

public class Main {
    public static void main(String[] args) {

        afiseazaNumere();
        System.out.println();
        afiseazaNumerePare();
        System.out.println();

        int[] a = new int [100];
        for( int i = 0;i<100;i++)
        {
            a[i] = i;
            System.out.println(a[i]);
        }

        extrageImpare(a);
        extragePare(a);

    }

    public static void afiseazaNumere() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void afiseazaNumerePare() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void extrageImpare(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    public static void extragePare(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }
}