package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

// Jisselle Garcia , 02/14/23, this program generates a sorted grocery list
public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static boolean isDuplicate(String [] list,String item, int listcnt) {
        boolean result = false;
        for (int i = 0; i < listcnt; i++) {
            if (item.equalsIgnoreCase(list[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Your Grocery List Starting...");
        System.out.println();
        int count = 0; // Number of items currently in the grocery list
        String[] groceryList = new String[6];

        while (count < groceryList.length) {
            System.out.print("Enter grocery item: ");
            String item = sc.nextLine();

            if (isDuplicate(groceryList, item, count)) {
                System.out.println("Sorry that " +item+ " is already on the list");
            }   else {
                groceryList[count] = item;
                count++;
            }
            }
            Arrays.sort(groceryList);
            System.out.println("\nHere is your sorted Grocery List");
            for (String values: groceryList){
                System.out.println(values);
            }
        }
}
