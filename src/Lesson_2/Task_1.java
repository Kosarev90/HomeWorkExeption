package Lesson_2;
/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*еализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 необходимо повторно запросить у пользователя ввод данных*/
public class Task_1 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean check = true;

        while (check){
            System.out.println("Input in float number: ");
            try {
                float number = Float.parseFloat(reader.readLine());
                System.out.println("Output float: " + number);
                check = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Not correct number");
            }
        }
    }
}