def QuickSort(arr, l, r):
    if l < r:
        p = partition(arr, l, r)

        QuickSort(arr, l, p - 1)
        QuickSort(arr, p + 1, r)


def partition(arr, l, r):
    pivot = arr[l]
    i = l + 1
    j = r

    while True:

        while i <= j and arr[i] <= pivot:
            i += 1

        while i <= j and arr[j] > pivot:
            j -= 1

        if i < j:
            arr[i], arr[j] = arr[j], arr[i]
        else:
            break

    arr[l], arr[j] = arr[j], arr[l]

    return j


arr = [12, 34, 56, 43, 56, 23, 2]

QuickSort(arr, 0, len(arr) - 1)

print("Sorted Array:", arr)