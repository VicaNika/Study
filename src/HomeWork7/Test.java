package HomeWork7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        printRates(new NBRBLoader());
        printWriteRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){

        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }

    public static void writeRates (double value) {
        String str = Double.toString(value) + "\n";
        String userAnswer, path;
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы хотите сохранить файл по умолчанию? (Да/Нет)");
        userAnswer = scan.nextLine().toLowerCase();
        String fwPath = "C:\\Users\\pc-cp\\IdeaProjects\\Course\\JD1\\HomeWork\\src\\HomeWork7\\currency.txt";

        if (userAnswer.equals("да")) {
            try {
                FileWriter fw = new FileWriter(fwPath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(str);
                bw.close();
                System.out.println("Файл создан!");
            } catch (IOException e) {
                System.out.println("Ошибка!");
                e.printStackTrace();
            }

        } else {
            System.out.println("Введите путь для сохранения файла");
            path = scan.nextLine();
            try {
                FileWriter fw = new FileWriter(path, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(str);
                bw.close();
                System.out.println("Файл создан!");
            } catch (IOException e) {
                System.out.println("Ошибка!");
                e.printStackTrace();
            }
        }

    }
    public static void printWriteRates (SiteLoader loader) {
        writeRates(loader.load(SiteLoader.Currency.EUR));
        writeRates(loader.load(SiteLoader.Currency.RUB));
        writeRates(loader.load(SiteLoader.Currency.USD));
    }
}
