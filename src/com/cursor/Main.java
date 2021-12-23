package com.cursor;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int average = 0;
        int sumof3 = 0;
        int sumEven = 0;

        System.out.println("1. Заповнити масив тільки парними числами:");
        int[] arrayGeneral = new int[25];
        for (int i = 0; i < arrayGeneral.length; i++) {
            arrayGeneral[i] = (i * 2);
            System.out.print(arrayGeneral[i] + " ");
        }

        System.out.println("\n" + "2. Заповнити масив рандомними числами:");
        Random random = new Random();
        for (int i = 0; i < arrayGeneral.length; i++) {
            arrayGeneral[i] = random.nextInt(85);
            System.out.print(arrayGeneral[i] + " ");
        }

        System.out.println("\n" + "3. Вивести середнє значення масиву:");
        for (int value : arrayGeneral) {
            average = average + value;
        }
        System.out.print("Average: " + average / arrayGeneral.length);

        System.out.println("\n" + "4. Вивести суму всіх значень кратних 3:");
        for (int i = 0; i < arrayGeneral.length; i++) {
            if (i % 3 == 0) {
                sumof3 += i;
            }
        }
        System.out.print(sumof3);

        System.out.println("\n" + "5. Вивести значення всіх парних індексів масиву:");
        for (int i = 0; i < arrayGeneral.length; i += 2) {
            System.out.print(arrayGeneral[i] + " ");
        }

        System.out.println("\n" + "6. Просортувати масив в порядку зростання:");
        for (int k : arrayGeneral) {
            Arrays.sort(arrayGeneral);
            System.out.print(k + " ");
        }

        System.out.println("\n" + "7. Вивести найменше значення в масиві:");
        int min = arrayGeneral[0];
        for (int j : arrayGeneral) {
            if (min > j) min = j;
        }
        System.out.print(min);

        System.out.println("\n" + "8. Вивести найбільше значення масиву:");
        int max = arrayGeneral[0];
        for (int j : arrayGeneral) {
            if (max < j) max = j;
        }
        System.out.print(max);

        System.out.println("\n" + "9. Вивести суму значень всіх парних індексів:");
        for (int i = 0; i < arrayGeneral.length; i += 2) {
            sumEven += arrayGeneral[i];
        }
        System.out.print(sumEven);

        System.out.println("\n" + "10. Вивести перших 20 символів з таблиці ASCI:");
        for (char c = 32; c < 52; c++) {
            System.out.print(c + " ");
        }
    }
}

/*
            *   Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними;

        int[] array = new int[25];
        Random randomNext = new Random();
        int j = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = randomNext.nextInt(25);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        if (i >= 0 && j >= 0 && i % 2 == 0 && j % 2 != 0) {
            int tmp = j;
            j = array[i];
            array[i] = tmp;
        } else {
            if (i >= 0 && j >= 0 && i % 2 != 0 && j % 2 == 0) {
                int tmp = i;
                i = array[j];
                array[j] = tmp;
            }
        }
*/

