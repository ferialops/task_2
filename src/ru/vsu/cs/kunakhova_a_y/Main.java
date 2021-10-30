package ru.vsu.cs.kunakhova_a_y;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int A = readNumber("A");
        int B = readNumber("B");
        int C = readNumber("С");

        Variations numbers = chekTrueVariation(A, B, C);

        printResult(numbers);
    }

    static int readNumber(String number) {
        System.out.printf("Enter an integer %s: ", number);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static Variations chekTrueVariation(int A, int B, int C) {
        if ((A <= B) && (B <= C)) {
            return Variations.ABC;
        } else if ((A <= C) && (C <= B)) {
            return Variations.ACB;
        } else if ((B <= A) && (A <= C)) {
            return Variations.BAC;
        } else if ((B <= C) && (C <= A)) {
            return Variations.BCA;
        } else if ((C <= A) && (A <= B)) {
            return Variations.CAB;
        } else {
            return Variations.CBA;
        }
    }

    static void printResult(Variations numbers) {
        switch (numbers) {
            case ABC -> System.out.println("A<=B<=C");
            case ACB -> System.out.println("A<=C<=B");
            case BAC -> System.out.println("B<=A<=C");
            case BCA -> System.out.println("B<=C<=A");
            case CAB -> System.out.println("C<=A<=B");
            case CBA -> System.out.println("C<=B<=A");
        }
    }
}
