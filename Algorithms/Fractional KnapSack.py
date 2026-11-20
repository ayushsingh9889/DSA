def Frectional_knapsack(item_wt, price, capacity):
    n=len(item_wt)

    # items = [(24,3,7), (12,4,3),(10,5,2)]
    items = [(price[i], item_wt[i], price[i]//item_wt[i])for i in range (n)]
    for i in range(n):
        for j in range (i+1, n):
            if(items[i][2], items[j][2]):
                items[i], items[j] = items[j], items[i]

    profit = 0.0
    for price, item_wt, perkgprice in items:
        if(capacity>=item_wt):
            capacity =capacity-item_wt
            profit = profit+price
        else:
            profit = profit + perkgprice*capacity
    print("Total Profit =", profit)

price = [24,21,12,10]
item_wt= [7,3,4,5]
capacity = 20
Frectional_knapsack(item_wt, price, capacity)