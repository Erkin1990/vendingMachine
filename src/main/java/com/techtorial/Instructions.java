package com.techtorial;

public class Instructions {


    public static void getInstructions(int input) {

        switch (input) {
            case 0:
                System.out.println("Press ");

                /*
                 * Vending machine options are:
                 * 1 - List all items/products
                 * 2 - Get item/product info (details, availability)
                 * 3 - Select a product
                 * 4 - Get item/product price
                 * 5 - List all prices
                 * 6 - Cancel product selection
                 * 7 - Exit
                 * 8 - Buy an item
                 */
            default:
                System.out.println("Please enter 0");
        }
    }

}
