package Lesson_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности
// элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       // arrayNew(array(scanner, random), array(scanner, random));
        arrayNewCreate(array(scanner, random), array(scanner, random));

    }

    private static int[] array(Scanner scanner, Random random) {
        System.out.print("Введите длину массива: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static int[] arrayNew(int[] array, int[] array2){

        if(array.length != array2.length)
            throw  new RuntimeException("Массивы не совпадают по размерам");

        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i] - array2[i];
        }
        System.out.println(Arrays.toString(newArray));
         return newArray;
    }
    //* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    private static int[] arrayCreate(Scanner scanner, Random random) {
        System.out.print("Введите длину массива: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static int[] arrayNewCreate(int[] array, int[] array2) {

        if (array.length != array2.length)
            throw new RuntimeException("Массивы не совпадают по размерам");

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array2[i] == 0){
                throw new RuntimeException("На ноль делить нельзя");
            }
            newArray[i] = array[i] / array2[i];
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;

    }
}