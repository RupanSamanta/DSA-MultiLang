#include <stdio.h>

int main() {
    // Way 1: Declaration with size and initialization
    int arr1[5] = {1, 2, 3, 4, 5};

    // Way 2: Declaration without size
    int arr2[] = {6, 7, 8};

    // Way 3: Only declaration, values assigned later
    int arr3[3];
    arr3[0] = 9;
    arr3[1] = 10;
    arr3[2] = 11;

    // Print all arrays
    printf("arr1: ");
    for (int i = 0; i < 5; i++) printf("%d ", arr1[i]);

    printf("\narr2: ");
    for (int i = 0; i < 3; i++) printf("%d ", arr2[i]);

    printf("\narr3: ");
    for (int i = 0; i < 3; i++) printf("%d ", arr3[i]);

    return 0;
}
