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

def findNthPrime(n):
    count = 0
    i = 0
    while count < n:
        i = i + 1
        if checkIsPrime(i):
            count = count + 1
    return i

n = int(input("Enter Number for n: "))
print("nth Prime: ", findNthPrime(n))
        