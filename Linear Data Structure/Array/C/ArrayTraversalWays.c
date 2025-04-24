#include <stdio.h>

int main() {
    int arr[] = {11, 22, 33, 44, 55};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Using for loop
    printf("Using for loop:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    // Using while loop
    printf("\nUsing while loop:\n");
    int i = 0;
    while (i < n) {
        printf("%d ", arr[i]);
        i++;
    }

    // Using do-while loop
    printf("\nUsing do-while loop:\n");
    i = 0;
    do {
        printf("%d ", arr[i]);
        i++;
    } while (i < n);

    return 0;
}
