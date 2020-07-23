package com.severin.homework_3;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        go();
    }

//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void input() {
        Random random = new Random();
        int val = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка №" + attempt + "/3");
            System.out.println("Введите число от 0 до 9:");
            int val1 = scanner.nextInt();
            if (val1 == val){
                System.out.println("Поздравляю, вы угадали! Повторить игру еще раз? 1 – да || 0 – нет");
                break;
            } else if(val1 > val && i < 2){
                System.out.println("Ваше число больше загаданного!");
                attempt++;
            } else if(val1 < val && i < 2) {
                System.out.println("Ваше число меньше загаданного!");
                attempt++;
            } else System.out.println("Вы проиграли, загаданное число = " + val + " ! Повторить игру еще раз? 1 – да || 0 – нет");
        }
    }

    public static void go(){
        input();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int val = scanner.nextInt();
            if (val == 1) {
                input();
            } else if (val == 0) {
                System.out.println("Приходите еще!");
                break;
            } else {
                System.out.println("1 – да || 0 – нет");
            }
        }
    }
}
