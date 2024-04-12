from math import sqrt 

def checkIsPrime(n):
    if n == 1 or n == 0:
        return False
    if n == 2 or n == 3:
        return True
    for i in range(2, int(sqrt(n))+1): 
        if (n % i == 0): 
            return False
    return True

def primeSum(n):
    sum = 0
    for i in range(0, n):
        if checkIsPrime(i):
            sum = sum + i
    return sum

n = int(input("Enter Number for n: "))
print("Prime : ", primeSum(n))