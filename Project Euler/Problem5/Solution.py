import math

def findSmallestMultiple(n):
    result = 1
    while(n > 1):
        if result % n != 0:
            print("result: ", result, " ;n: ", n)
            result = math.lcm(result, n)
        n = n - 1
    return result

n = int(input("Enter Number for n: "))
print("Product: ", findSmallestMultiple(n))