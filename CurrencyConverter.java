import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double usdToinr = 83.98;
            double usdToPoundRate = 0.80;

            System.out.println("Currency Converter");
            System.out.println("1. USD to INR");
            System.out.println("2. USD to GBP");
            System.out.print("Choose conversion: ");
            int choice = scanner.nextInt();

            System.out.print("Enter amount in USD: ");
            double amount = scanner.nextDouble();

            double convertedAmount;
            String targetCurrency;

            switch (choice) {
                case 1:
                    convertedAmount = amount * usdToinr;
                    targetCurrency = "INR";
                    break;
                case 2:
                    convertedAmount = amount * usdToPoundRate;
                    targetCurrency = "GBP";
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            System.out.println(amount + " USD is equal to " + convertedAmount + " " + targetCurrency);
        }
    }
}