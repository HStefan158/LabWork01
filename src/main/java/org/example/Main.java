package org.example;

public class Main {

    public static void Numbers() {
    for (int i = 1; i <= 100; i++) {
        System.out.println(i);
    }
}

    public static void EvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void filterOddNumbers(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    public static void filterEvenNumbers(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

        Numbers();
        System.out.println();
        EvenNumbers();
        System.out.println();

        int[] a = new int [100];
        for( int i = 0;i<100;i++)
        {
            a[i] = i;
            System.out.println(a[i]);
        }

        filterOddNumbers(a);
        filterEvenNumbers(a);

    }


}