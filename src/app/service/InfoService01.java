package app.service;

import app.entity.Client;

import java.util.Scanner;

public class InfoService01 {

    Scanner scanner;
    String name;
    String email;

    public String getDataService01() {
       return formDataService01(getInputs());
    }

    private Client<String, String> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's name: ");
        name = scanner.nextLine();
        System.out.print("Enter client's email: ");
        email = scanner.nextLine();
        return new Client<>(name, email);
    }

    private String formDataService01(Client<String, String> client) {
        return "Client's name is " + client.getKey() +
                ", email is " + client.getValue();
    }
}
