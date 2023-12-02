package LifeCycle1;

import java.util.Scanner;

public class SolizLifeCyle1 {

    public static void main(String[] args) {
        // Define constants for food costs
        final double FOOD_AD_CHILI = 4.75;
        final double FOOD_CHI_CHILI = 3.75;
        final double FOOD_COOKIE = 1.00;
        final double FOOD_BROWNIE = 0.75;

        // Declare variables for quantities
        int adultChili, childChili, cookies, brownies;

        // Get user input for quantities
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many Adult chili you want: ");
        adultChili = input.nextInt();

        System.out.println("Please enter how many Children chili you want: ");
        childChili = input.nextInt();

        System.out.println("Enter how many cookies you want: ");
        cookies = input.nextInt();

        System.out.println("Enter how many brownies you want: ");
        brownies = input.nextInt();

        // Calculate the total cost for each type of food
        double totalAdChiliCost = adultChili * FOOD_AD_CHILI;
        double totalChildChiliCost = childChili * FOOD_CHI_CHILI;
        double totalCookieCost = cookies * FOOD_COOKIE;
        double totalBrownieCost = brownies * FOOD_BROWNIE;

        // Calculate the overall total cost
        double totalCost = totalAdChiliCost + totalChildChiliCost + totalCookieCost + totalBrownieCost;

        // Display the results
        System.out.println("The total for your meals is: " + totalCost);
        System.out.println("The total for Adult Chili is: " + totalAdChiliCost);
        System.out.println("The total for Children Chili is: " + totalChildChiliCost);
        System.out.println("The total for Cookies is: " + totalCookieCost);
        System.out.println("The total for Brownies is: " + totalBrownieCost);
    }
}
