package com.dmitrydunai;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> items;
    private Scanner scanner;

    public Menu(List<MenuItem> items, Scanner scanner) {
        this.items = items;
        this.scanner = scanner;
    }

    private void printItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, items.get(i).getName());
        }
        System.out.printf("%d - Exit", items.size() + 1);
    }

    private int gatChoice() {
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public void run() {
        while (true) {
            printItems();
            int choice = gatChoice();
            if (choice < 0 || choice > items.)
        }
    }
}
