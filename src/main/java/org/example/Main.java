package org.example;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> NumberList = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            NumberList.add(i);
        }
        return NumberList;
    }


    public static void EvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    /*public static void filterOddNumbers(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    public static void filterEvenNumbers(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }*/

    public static void main(String[] args) {

        ArrayList<Integer> numbers = getNumbers();
        numbers.stream().forEach(System.out::println);


        System.out.println();
        EvenNumbers();
        System.out.println();



        /*filterOddNumbers(a);
        filterEvenNumbers(a);*/

    }


}