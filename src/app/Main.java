package app;

import app.service.InfoService02;
import app.service.InfoService01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getOutput(getData(getOption()));
    }

    private static String getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - get client's name and email.
                2 - get client's phone and purchase amount.
                """);
        return scanner.nextLine();
    }

    private static String getData(String option) {
        String data;
        switch (option) {
            case "1" -> data = new InfoService01().getDataService01();
            case "2" -> data = new InfoService02().getDataService02();
            default -> data = "No data";
        }
        return data;
    }

    private static void getOutput(String output) {
        System.out.println("\n" + output);
    }
}
