package com.cursor;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Заповнити масив тільки парними числами:");
        int[] array = new int[25];
        int i;
        for (i = 0; i < array.length; i += 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "2. Заповнити масив рандомними числами:");
        int[] array1 = new int[50];
        Random random = new Random();
        for (i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(85);
            System.out.print(array1[i] + " ");
        }


        System.out.println("\n" + "3. Вивести середнє значення масиву:");
        int a;
        int average = 0;
        for (i = 0; i < array.length; i++) {
            array[i] = i;
            a = array[i];
            average = average + a;
        }
        System.out.print("Average: " + average / i);


        System.out.println("\n" + "4. Вивести суму всіх значень кратних 3:");
        int[] array2 = new int[25];
        int summ = 0;
        for (i = 0; i < array2.length; i++) {
            array2[i] = i;
            if (i % 3 == 0) {
                summ += i;
            }
        }
        System.out.print(summ);


        System.out.println("\n" + "5. Вивести значення всіх парних індексів масиву:");
        for (i = 0; i < array.length; i += 2) {
            array[i] = i;
            System.out.print(i + " ");
        }


        System.out.println("\n" + "6. Просортувати масив в порядку зростання:");
        int[] arraySort = {6, 5, 75, 65, 24, 48, 25, 36, 52, 8};
        for (i = 0; i < arraySort.length; i++) {
            Arrays.sort(arraySort);
            System.out.print(arraySort[i] + " ");
        }


        System.out.println("\n" + "7. Вивести найменше значення в масиві:");
        double[] arrayMin = {5.85, 87.79, 0.78, 8.4, 1.2, 55.89};
        double min = arrayMin[0];
        for (i = 0; i < arrayMin.length; i++) {
            if (min > arrayMin[i]) min = arrayMin[i];
        }
        System.out.print(min);


        System.out.println("\n" + "8. Вивести найбільше значення масиву:");
        double[] arrayMax = {5.85, 87.79, 0.78, 8.4, 1.2, 55.89};
        double max = arrayMax[0];
        for (i = 0; i < arrayMax.length; i++) {
            if (max < arrayMax[i]) max = arrayMax[i];
        }
        System.out.print(max);


        System.out.println("\n" + "9. Вивести суму значень всіх парних індексів:");
        int sum = 0;
        for (i = 0; i < array.length; i += 2) {
            array[i] = i;
            sum += array[i];
        }
        System.out.print(sum);


        System.out.println("\n"+"10. Вивести перших 20 символів з таблиці ASCI:");
        char[] array_c = new char[20];
        char c;
        for (c = 0; c < array_c.length; c++) {
            array_c[c] = (char)(c);
            System.out.print(c);
        }
       // System.out.print(array_c);g


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
    }
}
