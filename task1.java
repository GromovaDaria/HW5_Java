/* Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число римскими цифрами. Например, MMXXII: ");
        String rimNumber = iScanner.nextLine();
        iScanner.close();
        int arabNumber = romanArabic(rimNumber);

        System.out.println(arabNumber);
    }

    static int romanArabic(String str) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        int result = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int current = map.get(str.charAt(i));
            if (current < num) {
                result -= current;
            } else {
                result += current;
            }
            num = current;
        }
        return result;
    }

}