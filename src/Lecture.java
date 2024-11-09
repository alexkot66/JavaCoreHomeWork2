public class Lecture {

    /**
     * Метод для шифрования или расшифрования строки с использованием шифра Цезаря.
     */

    public String caesarCipher(String text, int shift, boolean encrypt) {
        // Если расшифровываем, инвертируем сдвиг
        if (!encrypt) {
            shift = -shift;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Проверяем, является ли символ буквой
            if (ch >= 'a' && ch <= 'z') {
                // Для маленьких букв
                ch = (char) ((ch - 'a' + shift + 26) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                // Для заглавных букв
                ch = (char) ((ch - 'A' + shift + 26) % 26 + 'A');
            }

            // Добавляем символ к результату
            result.append(ch);
        }

        return result.toString();
    }


    /**
     * Метод для циклического сдвига массива на n позиций. Последний элемент
     * становится первым при сдвиге.
     */
    public int[] changeValues(int[] nums, int n) {
        int[] changedNums = new int[nums.length];

        // Ограничиваем сдвиг до длины массива
        n = n % nums.length;

        for (int i = 0; i < nums.length; i++) {
            // Циклический сдвиг с использованием остатка от деления
            changedNums[(i + n) % nums.length] = nums[i];
        }

        return changedNums;
    }

    /**
     * Метод для замены всех единиц на нули и всех нулей на единицы в массиве.
     */
    public int[] changeOneToZero(int[] nums) {
        int len = nums.length;
        int[] changedNums = new int[len];

        // Проверяем, состоит ли массив только из 0 и 1
        if (checkIfAllAreOneOrZero(nums)) {
            for (int i = 0; i < nums.length; i++) {
                // Замена: 0 -> 1, 1 -> 0
                changedNums[i] = nums[i] == 0 ? 1 : 0;
            }

            return changedNums;
        }

        // Возвращаем массив {-1}, если есть другие значения
        return new int[]{-1};
    }

    /**
     * Метод проверки, состоит ли массив только из 0 и 1.
     */
    private boolean checkIfAllAreOneOrZero(int[] nums) {
        for (int num : nums) {
            // Если элемент не равен ни 0, ни 1, возвращаем false
            if (num != 0 && num != 1) {
                return false;
            }
        }

        return true;
    }


}
