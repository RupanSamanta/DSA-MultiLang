#include <stdio.h>

int main() {
    int arr[5] = {100, 200, 300, 400, 500};

    // Accessing via index
    printf("arr[0]: %d\n", arr[0]);
    printf("arr[2]: %d\n", arr[2]);

    // Accessing via pointer
    printf("Using pointer *(arr + i):\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", *(arr + i));
    } 

    return 0;
}
