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

    public static void main(String[] args) {

        ArrayList<Integer> numbers = getNumbers();
        numbers.stream().forEach(System.out::println);
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

    }


}