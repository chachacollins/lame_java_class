import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bill To Information
        System.out.println("Enter Bill To Information:");
        System.out.print("Company Name: ");
        String billCompany = scanner.nextLine();
        System.out.print("Address Line 1: ");
        String billAddress1 = scanner.nextLine();
        System.out.print("Address Line 2: ");
        String billAddress2 = scanner.nextLine();
        System.out.print("GSTIN: ");
        String billGSTIN = scanner.nextLine();
        System.out.print("Contact: ");
        String billContact = scanner.nextLine();
        System.out.print("Email: ");
        String billEmail = scanner.nextLine();

        // Ship To Information
        System.out.println("\nEnter Ship To Information:");
        System.out.print("Company Name: ");
        String shipCompany = scanner.nextLine();
        System.out.print("Address Line 1: ");
        String shipAddress1 = scanner.nextLine();
        System.out.print("Address Line 2: ");
        String shipAddress2 = scanner.nextLine();
        System.out.print("GSTIN: ");
        String shipGSTIN = scanner.nextLine();
        System.out.print("Contact: ");
        String shipContact = scanner.nextLine();
        System.out.print("Email: ");
        String shipEmail = scanner.nextLine();

        // Product variables
        int prodCode1, prodCode2, prodCode3, prodCode4, prodCode5, prodCode6, prodCode7;
        String prodName1, prodName2, prodName3, prodName4, prodName5, prodName6, prodName7;
        int hsnCode1, hsnCode2, hsnCode3, hsnCode4, hsnCode5, hsnCode6, hsnCode7;
        int qty1, qty2, qty3, qty4, qty5, qty6, qty7;
        String units1, units2, units3, units4, units5, units6, units7;
        double rate1, rate2, rate3, rate4, rate5, rate6, rate7;
        double tax1, tax2, tax3, tax4, tax5, tax6, tax7;
        double amount1, amount2, amount3, amount4, amount5, amount6, amount7;

        // Product 1
        System.out.println("\nProduct 1:");
        System.out.print("Product Code: ");
        prodCode1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName1 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode1 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units1 = scanner.nextLine();
        System.out.print("Rate: ");
        rate1 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax1 = scanner.nextDouble();
        scanner.nextLine();
        amount1 = (qty1 * rate1) + (qty1 * rate1 * tax1 / 100);

        // Product 2
        System.out.println("\nProduct 2:");
        System.out.print("Product Code: ");
        prodCode2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName2 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode2 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units2 = scanner.nextLine();
        System.out.print("Rate: ");
        rate2 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax2 = scanner.nextDouble();
        scanner.nextLine();
        amount2 = (qty2 * rate2) + (qty2 * rate2 * tax2 / 100);

        // Product 3
        System.out.println("\nProduct 3:");
        System.out.print("Product Code: ");
        prodCode3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName3 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode3 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units3 = scanner.nextLine();
        System.out.print("Rate: ");
        rate3 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax3 = scanner.nextDouble();
        scanner.nextLine();
        amount3 = (qty3 * rate3) + (qty3 * rate3 * tax3 / 100);

        // Product 4
        System.out.println("\nProduct 4:");
        System.out.print("Product Code: ");
        prodCode4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName4 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode4 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units4 = scanner.nextLine();
        System.out.print("Rate: ");
        rate4 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax4 = scanner.nextDouble();
        scanner.nextLine();
        amount4 = (qty4 * rate4) + (qty4 * rate4 * tax4 / 100);

        // Product 5
        System.out.println("\nProduct 5:");
        System.out.print("Product Code: ");
        prodCode5 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName5 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode5 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty5 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units5 = scanner.nextLine();
        System.out.print("Rate: ");
        rate5 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax5 = scanner.nextDouble();
        scanner.nextLine();
        amount5 = (qty5 * rate5) + (qty5 * rate5 * tax5 / 100);

        // Product 6
        System.out.println("\nProduct 6:");
        System.out.print("Product Code: ");
        prodCode6 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName6 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode6 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty6 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units6 = scanner.nextLine();
        System.out.print("Rate: ");
        rate6 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax6 = scanner.nextDouble();
        scanner.nextLine();
        amount6 = (qty6 * rate6) + (qty6 * rate6 * tax6 / 100);

        // Product 7
        System.out.println("\nProduct 7:");
        System.out.print("Product Code: ");
        prodCode7 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name: ");
        prodName7 = scanner.nextLine();
        System.out.print("HSN Code: ");
        hsnCode7 = scanner.nextInt();
        System.out.print("Quantity: ");
        qty7 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Units: ");
        units7 = scanner.nextLine();
        System.out.print("Rate: ");
        rate7 = scanner.nextDouble();
        System.out.print("Tax (%): ");
        tax7 = scanner.nextDouble();
        scanner.nextLine();
        amount7 = (qty7 * rate7) + (qty7 * rate7 * tax7 / 100);

        // Calculate totals
        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double discountPercentage = 0.6368;
        double discountAmount = total * discountPercentage / 100;
        double grandTotal = total - discountAmount;

        // Display Invoice
        System.out.println("\n\n========================================================================================================");
        System.out.println("\t\t\t\t\tSALES INVOICE");
        System.out.println("========================================================================================================");
        System.out.println();
        System.out.println("Bill To:\t\t\t\t\t\tShip To:");
        System.out.println(billCompany + "\t\t\t\t\t\t" + shipCompany);
        System.out.println(billAddress1 + "\t\t\t\t\t" + shipAddress1);
        System.out.println(billAddress2 + "\t\t\t" + shipAddress2);
        System.out.println("GSTIN:" + billGSTIN + "\t\t\t\t\tGSTIN:" + shipGSTIN);
        System.out.println("Contact: " + billContact + "\t\t\t\tContact: " + shipContact);
        System.out.println("Email: " + billEmail + "\t\tEmail: " + shipEmail);
        System.out.println();
        System.out.println("\tPayment Date: 7 days from date of delivery\t\tPayment Terms: 100% against invoice");
        System.out.println();
        System.out.println("========================================================================================================");
        System.out.println("S.No\tProduct Code\tProduct Name\t\tHSN code\tQuantity\tUnits\tRate\tTax\tAmount");
        System.out.println("========================================================================================================");
        System.out.println("1\t" + prodCode1 + "\t\t" + prodName1 + "\t\t" + hsnCode1 + "\t\t" + qty1 + "\t\t" + units1 + "\t" + rate1 + "\t" + tax1 + "%\t" + amount1);
        System.out.println("2\t" + prodCode2 + "\t\t" + prodName2 + "\t\t\t" + hsnCode2 + "\t\t" + qty2 + "\t\t" + units2 + "\t" + rate2 + "\t" + tax2 + "%\t" + amount2);
        System.out.println("3\t" + prodCode3 + "\t\t" + prodName3 + "\t" + hsnCode3 + "\t\t" + qty3 + "\t\t" + units3 + "\t" + rate3 + "\t" + tax3 + "%\t" + amount3);
        System.out.println("4\t" + prodCode4 + "\t\t" + prodName4 + "\t\t" + hsnCode4 + "\t\t" + qty4 + "\t\t" + units4 + "\t" + rate4 + "\t" + tax4 + "%\t" + amount4);
        System.out.println("5\t" + prodCode5 + "\t\t" + prodName5 + "\t" + hsnCode5 + "\t\t" + qty5 + "\t\t" + units5 + "\t" + rate5 + "\t" + tax5 + "%\t" + amount5);
        System.out.println("6\t" + prodCode6 + "\t\t" + prodName6 + "\t\t" + hsnCode6 + "\t\t" + qty6 + "\t\t" + units6 + "\t" + rate6 + "\t" + tax6 + "%\t" + amount6);
        System.out.println("7\t" + prodCode7 + "\t\t" + prodName7 + "\t" + hsnCode7 + "\t\t" + qty7 + "\t\t" + units7 + "\t" + rate7 + "\t" + tax7 + "%\t" + amount7);
        System.out.println("========================================================================================================");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\tTotal\t\t" + total);
        System.out.println("\t\t\t\t\t\t\t\tDiscounts\t" + discountAmount);
        System.out.println("\t\t\t\t\t\t\t\tGrand total\t" + grandTotal);
        System.out.println();
        System.out.println("========================================================================================================");

        scanner.close();
    }
}
