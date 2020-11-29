package HomeWork5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WarAndPeace {
    public static void main(String[] args) throws IOException {
        Set<String> set = new LinkedHashSet<>();

        Scanner file = new Scanner(new File("HomeWork\\res\\book.txt"));

        while (file.hasNext()) {
            set.add(file.next().trim().toLowerCase()
                    .replaceAll("\\p{Punct}", ""));
        }
        // Вывод сета с уникальными словами
        System.out.println(set);
        System.out.println("Размер сета: " + set.size());


        String text = Files.readString(Paths.get("HomeWork" + File.separator + "res" + File.separator +"book.txt"));

        // Вывод с помощью EasySearch
        EasySearch easySearch = new EasySearch();
        System.out.println("____________________Используя EasySearch________________");
        System.out.println("Слово война: " + easySearch.search(text, "война"));
        System.out.println("Слово и: " + easySearch.search(text, "и"));
        System.out.println("Слово мир: " + easySearch.search(text, "мир"));
        // Вывод с помощью RegExSearch
        RegExSearch reg = new RegExSearch();
        System.out.println("____________________Используя RegExSearch________________");
        System.out.println("Слово война: " + reg.search(text, "война"));
        System.out.println("Слово и: " +reg.search(text, "и"));
        System.out.println("Слово мир: " +  reg.search(text, "мир"));

        String[] array = text.toLowerCase().split("[^A-Za-zА-Яа-я]+"); // Текст разбивается на слова и они помещаются в массив
        String newTxt = String.join(",", array);
        // Печать слов в тексте, переделанном из массива (для сравнения)
        System.out.println("____________________Используя переделанный массив________________");
        System.out.println("Слово война: " + reg.search(newTxt, "война"));
        System.out.println("Слово и: " +reg.search(newTxt, "и"));
        System.out.println("Слово мир: " +  reg.search(newTxt, "мир"));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String s : array) {
            if ((map.get(s)) == null) {
                map.put(s, 1);
            } else {
                map.put(s, (map.get(s) + 1));
            }
        }

// Печать первых 10 самых повторяющихся слов в тексте
       map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(System.out::println);




    }

}
