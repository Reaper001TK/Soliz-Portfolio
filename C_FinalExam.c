#include <stdio.h>

int main() {
    int payCode, employeeID;
    float salary, hoursWorked, grossPay, tax, netPay, sales;

    float totalPay = 0;

    printf("Enter employee pay code (-1 to end): ");
    scanf("%d", &payCode);

    while (payCode != -1) {
        printf("Enter employee ID number: ");
        scanf("%d", &employeeID);

        switch (payCode) {
            case 1: // Manager
                printf("Enter weekly salary: $");
                scanf("%f", &salary);
                grossPay = salary;
                break;

            case 2: // Hourly worker
                printf("Enter hourly wage: $");
                scanf("%f", &salary);
                printf("Enter hours worked: ");
                scanf("%f", &hoursWorked);

                if (hoursWorked > 40) {
                    grossPay = 40 * salary + 1.5 * (hoursWorked - 40) * salary;
                } else {
                    grossPay = hoursWorked * salary;
                }
                break;

            case 3: // Commission worker
                printf("Enter gross weekly sales: $");
                scanf("%f", &sales);
                grossPay = 375 + 0.072 * sales;
                break;

            default:
                printf("Invalid pay code.\n");
                continue;
        }

        // Calculate tax
        tax = 0.08625 * grossPay;

        // Calculate net pay
        netPay = grossPay - tax;

        // Display results
        printf("\nEmployee's ID: %d\n", employeeID);
        printf("Gross Pay: $%.2f\n", grossPay);
        printf("Taxes Paid: $%.2f\n", tax);
        printf("Net Pay: $%.2f\n\n", netPay);

        // Update total pay for the week
        totalPay += netPay;

        // Prompt for the next employee or end the loop
        printf("Enter employee pay code (-1 to end): ");
        scanf("%d", &payCode);
    }

    // Display total pay for the week
    printf("Total company pay for the week: $%.2f\n", totalPay);

    return 0;
}
