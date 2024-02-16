package app.service;
import java.util.InputMismatchException;
import java.util.Scanner;
import app.entity.Client;
import app.utils.Rounder;

public class InfoService02 {

    Scanner scanner;
    String name;
    double amount;

    public String getDataService02() {
        return formDataService02(getInputs());
    }

    private Client<String, Double> getInputs() {
        scanner = new Scanner(System.in);
        Client<String, Double> client = null;
        while (client == null) {
            try {
                System.out.print("Enter client's phone: ");
                name = scanner.nextLine();
                System.out.print("Enter client's purchase amount: ");
                amount = scanner.nextDouble();
                client = new Client<>(name, amount);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the numeric value for purchase amount.");
                scanner.nextLine();
            }
        }
        return client;
    }

    private String formDataService02(Client<String, Double> client) {
        String amountRounded = Rounder.roundValue(client.getValue());
        return "Client's phone is " + client.getKey() +
                ", purchase amount is USD " + amountRounded;
    }
}