import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * На шахматной доске расставить 8 ферзей так,
 * чтобы они не били друг друга.
 */
public class Queens {
    public static void main(String[] args) {
        int boardSize = 8;
        System.out.println("Введите координаты первого ферзя через пробел(например, 4 4)");
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Map<Integer, Integer> queens = new TreeMap<>();
        queens.put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        System.out.println(queens);
        sc.close();//TODO OR NOT TODO
    }
}

