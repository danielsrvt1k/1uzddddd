
// Daniēls Junkurēns
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> productList = new ArrayList<String>();
        boolean running = true;

        while (running) {
            System.out.println("Izvēlies darbību: Add, Remove, Show, Exit");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("Add")) {
                System.out.println("Ievadi produkta nosaukumu, kuru vēlies pievienot:");
                String userInput = scanner.nextLine();
                productList.add(userInput);
                System.out.println("manta produkts pievienota sarakstam.");
            } else if (userChoice.equalsIgnoreCase("Remove")) {
                if (productList.isEmpty()) {
                    System.out.println("saraksts ir tukšs.");
                } else {
                    System.out.println("Ievadiet ciparu no 1, lai noteiktu, kuru produktu vēlaties izņemt:");
                    int userInput = Integer.parseInt(scanner.nextLine());
                    int removeIndex = userInput - 1;
                    if (removeIndex >= 0 && removeIndex < productList.size()) {
                        productList.remove(removeIndex);
                        System.out.println("Manta veiksmīgi izņemta no saraksta.");
                    } else {
                        System.out.println("Nepareiza ievade. Manta netika izņemta.");
                    }
                }
            } else if (userChoice.equalsIgnoreCase("Show")) {
                if (productList.isEmpty()) {
                    System.out.println("Saraksts ir tukšs.");
                } else {
                    System.out.println("Produktu saraksts: " + productList);
                }
            } else if (userChoice.equalsIgnoreCase("Exit")) {
                running = false;
            } else {
                System.out.println("nepareizi ievadīji. mēģini vēlreiz.");
            }
        }

        System.out.println("Programma beidz darbu.");
        scanner.close();
    }
}
