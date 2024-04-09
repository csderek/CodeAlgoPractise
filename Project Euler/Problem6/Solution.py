def sumOfSquare(n):
    sum = 0
    for i in range(1, n+1):
        sum = sum + pow(i, 2)
    return sum

def squareOfSum(n):
    sum = 0
    for i in range(1, n+1):
        sum = sum + i
    return pow(sum, 2)

def diff(n):
    a = sumOfSquare(n)
    b = squareOfSum(n)
    return b - a

n = int(input("Enter Number for n: "))
print("Product: ", diff(n))