package com.LocalStore;
import java.util.Scanner;


public class SalesManager {
	public static void main(String args[]) {

       
        char choice;
         Sales aSales = new Sales();
        Scanner sc = new Scanner(System.in);

        System.out.println("-----STORE------");
        do {
            System.out.println("1. Add items");
            System.out.println("2. Change item details");
            System.out.println("3. Update your cart");
            System.out.println("4. Display item details");
            System.out.println("5. Print price for a item");
            System.out.println("6.  Generate Invoice");
            System.out.println("7. Exit");
            System.out.println("Choice:");
            choice = sc.nextLine().charAt(0);
            switch (choice) {
            case '1':
                aSales.addItem();
                break;

            case '2':
                aSales.updateStock();
                break;

            case '3':
                aSales.issueItem();
                break;

            case '4':
                aSales.display();
                break;

            case '5':

                System.out.println("Price of the Item is:"
                        + aSales.checkPrice( inCode()));
                break;
            
            case '6':
            	System.out.println("Invoice is:"+aSales.displayItem());
            	break;
            case '7':
                System.out.println("Thank you!\n");
                break;
            }
        } while (choice != '6');
        sc.close();
    }

    public static int inCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item code:");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid Input");
            return 0;
        }

    }
    
 





}
