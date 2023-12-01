#include <stdio.h>
#include <stdlib.h>

int A, B, C, D, F; // For letter grade variable

void letter(int average[], int ID[], int n)
{
    for (int i = 0; i < n; i++)
    {
        switch (average[i] / 10)
        {
        case 10:
        case 9:
            printf("\nStudent ID: %d Student Average: %d A", ID[i], average[i]);
            A++;
            break;
        case 8:
            printf("\nStudent ID: %d Student Average: %d B", ID[i], average[i]);
            B++;
            break;
        case 7:
            printf("\nStudent ID: %d Student Average: %d C", ID[i], average[i]);
            C++;
            break;
        case 6:
            printf("\nStudent ID: %d Student Average: %d D", ID[i], average[i]);
            D++;
            break;
        default:
            printf("\nStudent ID: %d Student Average: %d F", ID[i], average[i]);
            F++;
            break;
        }
    }
    printf("\nA %d B %d C %d D %d F %d", A, B, C, D, F); // outputs how many of each letter grade
}

int main()
{
    int *ID = NULL;
    int *average = NULL;
    int n = 0; // Initialize the number of students

    printf("Enter student information. To exit, enter a negative value for ID.\n");

    while (1)
    {
        printf("Enter student ID: ");
        int currentID;
        scanf("%d", &currentID);

        if (currentID < 0)
        {
            break; // Exit the loop if the ID is negative
        }

        printf("Enter student average: ");
        int currentAverage;
        scanf("%d", &currentAverage);

        // Dynamically allocate memory for the new student
        ID = realloc(ID, (n + 1) * sizeof(int));
        average = realloc(average, (n + 1) * sizeof(int));

        // Check if allocation was successful
        if (ID == NULL || average == NULL)
        {
            printf("Memory allocation failed. Exiting.\n");
            exit(EXIT_FAILURE);
        }

        // Add the new student to the arrays
        ID[n] = currentID;
        average[n] = currentAverage;

        n++; // Increment the number of students
    }

    letter(average, ID, n); // calls the function from above

    // Free dynamically allocated memory
    free(ID);
    free(average);

    return 0;
}

