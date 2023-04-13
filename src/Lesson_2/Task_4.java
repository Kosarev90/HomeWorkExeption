package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task_4 {
    public static void main(String[] args) {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String message = reader.readLine();
                System.out.println(message);
                if(message.isEmpty()){
                    throw new RuntimeException("The string cannot not be empty");
                }
                if(message.equals("exit"))
                    break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
