 # Question: Minimum Number of Currency Notes
# You are given an amount N and an array of currency denominations.
# Your task is to find the minimum number of notes required to make the given amount.
# You can use each denomination as many times as needed.


def coin_change(amount, denominations):

    denominations.sort(reverse=True)

    count = 0

    for coin in denominations:

        if amount >= coin:

            notes = amount // coin

            count += notes

            amount = amount % coin

            print(coin, "=", notes)

    print("Total notes =", count)


denominations = [1, 2, 5, 10, 20, 50, 100, 500]
amount = 870

coin_change(amount, denominations)
