import org.w3c.dom.ls.LSOutput;

import java.util.*;

/**
 * Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * <p>
 * Написать программу, которая найдет и выведет повторяющиеся имена
 * с количеством повторений. Отсортировать по убыванию популярности
 */
public class Popular_list_sort {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин",
                "Иван Ежов");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            names.add(lst.get(i).split(" ")[0]);
        }
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            if (map.containsKey(names.get(i))) {
                int counter = map.get(names.get(i));
                map.put(names.get(i), ++counter);
            } else {
                map.put(names.get(i), 1);
            }
        }
        Map<Integer, List<String>> rMap = new TreeMap<>(Collections.reverseOrder());
        for (var i : map.entrySet()) {
            if (rMap.containsKey(i.getValue())) {
                rMap.get(i.getValue()).add(i.getKey());
            } else {
                List<String> countKey = new ArrayList<>();
                countKey.add(i.getKey());
                rMap.put(i.getValue(), countKey);
            }
        }
        System.out.println(rMap);
        for (var i : rMap.entrySet())
            System.out.println(i.getKey() + " " + i.getValue());
    }
}



