package HomeWork6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;

public class WarAndPeace6 {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(Paths.get("HomeWork" + File.separator + "res" + File.separator +"book.txt"));
        String[] array = text.toLowerCase().split("[^A-Za-zА-Яа-я]+");


        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<Integer>> resultsList = new ArrayList<Future<Integer>>();
        List<Future<Integer>> resultsList1 = new ArrayList<Future<Integer>>();
        List<Future<Integer>> resultsList2 = new ArrayList<Future<Integer>>();
        ISearchEngine search = new RegExSearch6();

        String word1 = "война";
        String word2 = "и";
        String word3 = "мир";

        String part = null;

        for (int i = 1; i <= 4; i++) {

            if (i == 1) {
                String[] arrayCopy = Arrays.copyOfRange(array, 0, array.length/4);
                part = String.join(",", arrayCopy);
            }
            if (i == 2) {
                String[] arrayCopy1 = Arrays.copyOfRange(array, array.length/4, array.length/2);
                part = String.join(",", arrayCopy1);

            }
            if (i == 3) {
                String[] arrayCopy2 = Arrays.copyOfRange(array, array.length/2, array.length-(array.length/4));
                part = String.join(",", arrayCopy2);

            }
            if (i == 4) {
                String[] arrayCopy3 = Arrays.copyOfRange(array, array.length-(array.length/4), array.length);
                part = String.join(",", arrayCopy3);

            }
            CallableClass counter = new CallableClass(search, part, word1);
            Future<Integer> result = executor.submit(counter);
            resultsList.add(result);
            CallableClass counter1 = new CallableClass(search, part, word2);
            Future<Integer> result1 = executor.submit(counter1);
            resultsList1.add(result1);
            CallableClass counter2 = new CallableClass(search, part, word3);
            Future<Integer> result2 = executor.submit(counter2);
            resultsList2.add(result2);

        }
        int count = 0;
        for (Future<Integer> fut : resultsList) {

            try {
                count += fut.get();

            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }

        }
        int count1 = 0;
        for (Future<Integer> fut : resultsList1) {

            try {
                count1 += fut.get();

            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }

        }
        int count2 = 0;
        for (Future<Integer> fut : resultsList2) {

            try {
                count2 += fut.get();

            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Слово " + "\"" + word1 + "\"" + " употребляется " + count + " раз");
        System.out.println("Слово " + "\"" + word2 + "\"" + " употребляется " + count1 + " раз");
        System.out.println("Слово " + "\"" + word3 + "\"" + " употребляется " + count2 + " раз");
        executor.shutdown();

    }

}
