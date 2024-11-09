import java.util.Arrays;

/*
Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Main {

    public static void main(String[] args) {

        // Пример массива
        int[] nums = {4, 0, 8, 0, 0, 2};

        System.out.println("Задача 1");
        System.out.println("Количество чётных чисел: " + countEvens(nums));
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Разница между максимальным и минимальным значением: " + maxMinDifference(nums));
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Есть ли два соседних нуля: " + hasTwoConsecutiveZeros(nums));
        System.out.println();

        Lecture lecture = new Lecture();

        System.out.println("Реализовать шифр Цезаря");
        System.out.println(lecture.caesarCipher("Alexandr", 2, true));
        System.out.println(lecture.caesarCipher("Cngzcpft", 2, false));
        System.out.println();

        System.out.println("Изменить значения в массиве циклическим сдвигом массива на n позиций.");
        int[] numsChange = {8, 7, 2, 1, 9, 1, 3, 6};
        System.out.println("Массив до изменений:");
        System.out.println(Arrays.toString(numsChange));
        int[] changedNums = lecture.changeValues(numsChange, 3); // Исправление опечатки
        System.out.println("Массив после изменений:");
        System.out.println(Arrays.toString(changedNums));
        System.out.println();

        System.out.println("Заменить все единицы в массиве на нули и нули на единицы");
        int[] oneZeroNums = {0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив до изменений:");
        System.out.println(Arrays.toString(oneZeroNums));
        int[] changedOneZeroNums = lecture.changeOneToZero(oneZeroNums);
        System.out.println("Массив после изменений:");
        System.out.println(Arrays.toString(changedOneZeroNums));
        System.out.println();

    }

    /**
     * Метод подсчитывает количество четных элементов в переданном массиве целых чисел.
     *
     * Например:
     * countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3
     * countEvens([1, 3, 5]) → 0
     */
    public static int countEvens(int[] nums) {
        int countEvenNums = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                countEvenNums++;
            }
        }
        return countEvenNums;
    }

    /**
     * Метод возвращает разницу между самым большим и самым маленьким элементами
     * в переданном не пустом массиве целых чисел.
     *
     * Например:
     * maxMinDifference([7, 3, 5, 6]) → 7 (максимум 7, минимум 3, разница 4)
     * maxMinDifference([7, 3, 20, 15]) → 8 (максимум 20, минимум 3, разница 17)
     */
    public static int maxMinDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    /**
     * Метод проверяет, содержит ли переданный массив два соседних элемента с нулевым значением.
     *
     *
     * Например:
     * hasTwoConsecutiveZeros([1, 0, 0, 2]) → true
     * hasTwoConsecutiveZeros([5, 4, 3, 0, 2]) → false
     * hasTwoConsecutiveZeros([0, 0, 0]) → true
     */
    public static boolean hasTwoConsecutiveZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
