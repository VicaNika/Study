package HomeWork5;

import com.sun.source.tree.Tree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WarAndPeace {
    public static void main(String[] args) throws IOException {
        Set<String> set = new LinkedHashSet<>();

        Scanner file = new Scanner(new File("HomeWork\\res\\book.txt"));

        while (file.hasNext()) {
            set.add(file.next().trim().toLowerCase()
                    .replaceAll("\\p{Punct}", ""));
        }

        //System.out.println(set);
        //System.out.println(set.siz
        // .e());

        String text = Files.readString(Paths.get("HomeWork" + File.separator + "res" + File.separator +"book.txt"));

//        EasySearch easySearch = new EasySearch();
//        System.out.println(easySearch.search(text, "война"));
//        System.out.println(easySearch.search(text, "и"));
//        System.out.println(easySearch.search(text, "мир"));
        RexExSearch reg = new RexExSearch();
        System.out.println(reg.search(text, "война"));
        System.out.println(reg.search(text, "и"));
        System.out.println(reg.search(text, "мир"));

        String[] array = text.toLowerCase().split("[^A-Za-zА-Яа-я]+");
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String s : array) {
            if ((map.get(s)) == null) {
                map.put(s, 1);
            } else {
                map.put(s, (map.get(s) + 1));
            }
        }

/*
        String maxKey = null;
        int maxValue = 0;

        for (String s : map.keySet()) {
            if (map.get(s) > maxValue) {
                maxKey = s;
                maxValue = map.get(s);
            }
        }

        //System.out.println(map);

        //System.out.println("Самое повторяющееся слово: " + "{" + maxKey + "} "  + "количество повторений " + "- " + maxValue);
*/
// Печать первых 10 самых повторяющихся слов в тексте
       map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(System.out::println);


    }

}
