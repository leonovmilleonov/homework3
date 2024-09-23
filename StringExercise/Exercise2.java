package StringExercise;
/*
Дана строка с текстом, в котором есть цифры от 0 до 9.

Написать 2 метода:

- возвращающий массив цифр из переданной строки
- возвращающий сумму цифр из переданного целочисленного массива

Посчитать сумму всех чисел из строки

Например:
“Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int [] numbersArray = findNumbersInString(str);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(sum(numbersArray));
    }
    public static int [] findNumbersInString(String str){
        char [] chars = str.toCharArray();
        int counter = 0;
        for (char currentChar : chars) {
            if (currentChar >= '0' && currentChar <= '9') {
                counter++;
            }
        }
        int [] result = new int[counter];
        counter = 0;
        for (char currentChar : chars) {
            if (currentChar >= '0' && currentChar <= '9') {
                result[counter++] = Character.getNumericValue(currentChar);
            }
        }
        return result;
    }
    public static int sum(int [] array){
        int sum = 0;
        for (int currentNumber : array) {
            sum += currentNumber;
        }
        return sum;
    }
}
