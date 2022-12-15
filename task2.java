/*Написать метод, который переведёт данное целое число в римский формат.*/

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int arabNumber = iScanner.nextInt();
        iScanner.close();

        String rimNumber = arabicRoman(arabNumber);
        System.out.println(rimNumber);
    }

    static String arabicRoman(int number) {
        String result = "";

        while (number != 0) {
            if (number > 1000) {
                result += 'M';
                number -= 1000;
            } else if (number < 1000 && number >= 900) {
                result += "CM";
                number -= 900;
            } else if (number >= 500) {
                result += 'D';
                number -= 500;
            } else if (number < 500 && number >= 400) {
                result += "CD";
                number -= 400;
            } else if (number >= 100) {
                result += 'C';
                number -= 100;
            } else if (number < 100 && number >= 90) {
                result += "XC";
                number -= 90;
            } else if (number >= 50) {
                result += 'L';
                number -= 50;
            } else if (number < 50 && number >= 40) {
                result += "XL";
                number -= 40;
            } else if (number > 10) {
                result += 'X';
                number -= 10;
            } else if (number == 9) {
                result += "IX";
                number -= 9;
            } else if (number >= 5) {
                result += 'V';
                number -= 5;
            } else if (number == 4) {
                result += "IX";
                number -= 4;
            } else if (number >= 1) {
                result += 'I';
                number -= 1;
            }
        }
        return result;
    }
}