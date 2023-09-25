import java.util.Scanner;

public class billing_system {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("SN"+" "+"ITEM"+" "+"PRICE");
        System.out.println("1"+" "+"School_Chowmein"+" "+"Rs 110");
        System.out.println("2"+" "+"Ghiraula"+" "+"Rs 11");
        System.out.println("3"+" "+"Vanta"+" "+"Rs 1");
        int School_Chowmein = 110;
        int Ghiraula= 11;
        int Vanta = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items to order from 1-3");
        int no_of_items = sc.nextInt();
        double total = 0;

        for (int i = 1; i <= no_of_items; i++) {
            System.out.print("Enter the index number of item " + i + ": ");
            int index_of_item = sc.nextInt();
            System.out.print("Enter the quantity of item " + index_of_item + ": ");
            int quantity_of_item = sc.nextInt();

            double item_price = 0;
            switch (index_of_item) {
                case 1:
                    item_price = School_Chowmein;
                    break;
                case 2:
                    item_price = Ghiraula;
                    break;
                case 3:
                    item_price = Vanta;
                    break;
                default:
                    break;
            }

            total += item_price * quantity_of_item;
        }

        // Calculate VAT (13%)
        double vat = 0.13 * total;

        // Calculate Discount (10%)
        double discount = 0.10 * total;

        // Calculate the final total
        double finalTotal = total + vat - discount;

        // Print the bill
        System.out.println("\n--- Bill ---");
        System.out.println("Total Cost: Rs " + total);
        System.out.println("VAT (13%): Rs " + vat);
        System.out.println("Discount (10%): Rs " + discount);
        System.out.println("Final Total: Rs " + finalTotal);
    }
}
            
        
        
    

