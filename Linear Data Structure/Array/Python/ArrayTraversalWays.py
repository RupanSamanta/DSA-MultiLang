arr = [5, 10, 15, 20, 25]

# 1. Traditional for loop
print("Using for loop:")
for i in range(len(arr)):
    print(f"Element at {i}: {arr[i]}")

# 2. For-each loop
print("\nUsing for-each loop:")
for value in arr:
    print("Value:", value)

# 3. While loop
print("\nUsing while loop:")
i = 0
while i < len(arr):
    print("Element:", arr[i])
    i += 1
