import numpy as np

# 1. toString equivalent
arr = [5, 2, 9, 1, 5, 6]
print("Array:", arr)

# 2. equals
arr2 = [5, 2, 9, 1, 5, 6]
arr3 = [1, 2, 3, 4]
print("Equals:", arr == arr2)
print("Equals:", arr == arr3)

# 3. copy
copy = arr.copy()
copy.extend([0]*4)
print("Copy (extended):", copy)

# 4. copy range
range_copy = arr[2:5]
print("Copy Range (2 to 4):", range_copy)

# 5. fill
filled = [7] * 5
print("Filled:", filled)

# 6. setAll using list comprehension
squares = [i * i for i in range(5)]
print("setAll (squares):", squares)

# 7. sort
sort_array = [9, 2, 8, 1]
sort_array.sort()
print("Sorted:", sort_array)

# 8. partial sort
partial_sort = [10, 9, 5, 4, 7]
partial_sort[1:4] = sorted(partial_sort[1:4])
print("Partial sort (1 to 3):", partial_sort)

# 9. parallel sort - no direct method in Python but sorted() is efficient
parallel = [6, 2, 9, 4, 1]
parallel = sorted(parallel)
print("parallelSort:", parallel)

# 10. binary search - use bisect
import bisect
sorted_arr = [1, 3, 5, 7, 9]
index = bisect.bisect_left(sorted_arr, 5)
print("binarySearch(5): index =", index)

# 11. hashCode - use hash of tuple
print("hashCode:", hash(tuple(arr)))

# 12. deepToString
matrix = [[1, 2], [3, 4]]
print("deepToString:", matrix)

# 13. deepEquals
mat2 = [[1, 2], [3, 4]]
print("deepEquals:", matrix == mat2)

# 14. stream (sum, max, min)
print("sum():", sum(arr3))
print("max():", max(arr3))
print("min():", min(arr3))

# 15. asList - in Python already a list
names = ["Google", "Microsoft", "Meta", "Apple"]
print("asList():", names)
