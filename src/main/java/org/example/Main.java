package org.example;

public class Main {
    public static void main(String[] args) {

        afiseazaNumere();
    }

    public static void afiseazaNumere() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void afiseazaNumerePare() {
        // Pornim de la 2 și adunăm 2 la fiecare pas (i += 2)
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}