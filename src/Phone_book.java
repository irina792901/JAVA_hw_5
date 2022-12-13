import java.util.*;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
 */
//
public class Phone_book {
    public static void main(String[] args) {
        String[] str = {"Иванов 123456789", "Петров 652314985", "Сидоров 5487569514",
                "Иванов 459657", "Иванов 65498765"};
        Map<String, ArrayList<Long>> phoneBook = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String [] array = str[i].split(" ");
            String key = array[0];
            ArrayList <Long> value = new ArrayList<>();
            long number = Long.parseLong(array[1]);
            value.add(number);
            if (phoneBook.containsKey(key)) {
                value.add(number);
                phoneBook.put(key, value);
            } else {
                phoneBook.put(key, value);
            }
        }
        System.out.println(phoneBook);
    }
}

