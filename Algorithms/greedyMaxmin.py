# Q/  you are given an array A of n elements.you have to remove exactly  n/2 elements from an array and add it to another array B(initally empty).
# find the maximum and minimam values of difference between these two arrays.
# The difference between those two arrays is sum(abs(A[i]-B[j])).





def max_min_diff(arr):
    arr.sort()
    n = len(arr)
    mid = n // 2

    maximum = 0
    minimum = 0

    # Maximum difference
    j = n - 1

    for i in range(mid):
        # here maximum+=   ==  maximum = maximum + abs (arr[i] - arr[j])
        maximum += abs(arr[i] - arr[j])
        j -= 1

    # Minimum difference
    for i in range(0, n, 2):
        minimum += abs(arr[i] - arr[i + 1])

    print("Maximum difference =", maximum)
    print("Minimum difference =", minimum)


arr = [12, 5, 25, 10, 2, 15, 8, 30]

max_min_diff(arr)
