// Rolando Soliz COSC-1437-NT1 4/2/2023, Modified on 11/27/2023
//As of 4/2/2023 the program only allowed you to enter 15 grades for one student limiting what the user can do.
//Now on 11/27/2023 the program now can take as many grades as the user inputs and will now ask for the user to type "stop" when they done want to enter more grades.

package GradeAverage;

import java.util.*;

public class MP_Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean anotherSet = true;

        // loop until the user decides to stop
        while (anotherSet) {
            // create a list to hold grades
            List<Integer> gradeList = new ArrayList<>();

            // ask the user for grades until they type "stop"
            while (true) {
                System.out.print("Enter a grade (type 'stop' when done): ");
                String input = sc.next();

                if (input.equalsIgnoreCase("stop")) {
                    break;
                }

                try {
                    int grade = Integer.parseInt(input);
                    if (grade >= 0 && grade <= 100) {
                        gradeList.add(grade);
                    } else {
                        System.out.println("Invalid grade. Enter a grade between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric grade or 'stop'.");
                }
            }

            // calculate the average of the grades and print it to the console
            double average = calculateAverage(gradeList);
            System.out.println("Average grade: " + average);

            // print a list of all grades in the list
            System.out.println("All grades: " + gradeList);

            // print a list of all grades below 70
            System.out.print("Grades below 70: ");
            for (int grade : gradeList) {
                if (grade < 70) {
                    System.out.print(grade + " ");
                }
            }
            System.out.println();

            // sort the list and print the highest and lowest grades
            Collections.sort(gradeList);
            System.out.println("Highest grade: " + gradeList.get(gradeList.size() - 1));
            System.out.println("Lowest grade: " + gradeList.get(0));

            // ask the user if they want to average another set of grades
            System.out.print("Do you want to average another set of grades? (y/n): ");
            String choice = sc.next();
            anotherSet = choice.equalsIgnoreCase("y");
        }

        sc.close();
    }

    // calculate the average of the grades in the list
    public static double calculateAverage(List<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
