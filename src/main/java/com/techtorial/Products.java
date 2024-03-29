package com.techtorial;

public class Products {


    /*
	 * Please add more vending machine features
	 * - Buy a product
	 * - Search for a product
	 * - Get list of products
	 */


    private static String[] products  = new String[] {"Monitor", "Mouse", "Keyboard", "USB cable", "Charger", "Mouse pad"};
    private static int[]    prices    = new int[] {100, 70, 89, 17, 99, 5};
    private static int[]    inventory = new int[] {4, 10, 5, 10, 5, 7};

    public static String[] getAllPrices() {
        System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]);
        }
        return products;
    }

    public static int getProductPrice(String productName) {
        int index = 0;
        for (String s : products) {
            if (productName.equalsIgnoreCase(s)) {
                return prices[index];
            }
            index++;
        }
        System.out.println("Sorry the product you entered is not available");
        return -1;
    }

    public static void selectProduct(String productName) {

    	//loop over the product list to find out if it is available in our vending machine
		//if yes find the price (tip: call a specific method)
		//and verify this product is available in inventory
		//ask if customer wants to buy it -> if yes call another method to buy a product
//											-> if no call method to cancel it
    }

    public static void buyAProduct(String productName) {

        /*
        Apply payment logic.
        Apply give back change logic
        Apply inventory update logic: if someone buys an item, we should decrement number of available items.
         */
    }
}
