package StringExercise;
/*
Дана строка.
Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
Результат привести к верхнему регистру.

Например:
"abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(deleteSameLettersAndSpaces("abc Cpddd Dio OsfWw"));
    }
    public static String deleteSameLettersAndSpaces(String input){
        if(input.isEmpty() || input.length() == 1){
            return input;
        }
        char [] chars = input.replaceAll(" ", "").toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder();
        char previousChar = chars[0];
        result.append(previousChar);
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != previousChar){
                previousChar = chars[i];
                result.append(previousChar);
            }
        }
        return result.toString();
    }

}
