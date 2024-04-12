import math

def findtotalFactors(n):
    i = 1
    count = 0
    while i <= math.sqrt(n):
        if n % i == 0:
            count += 1
            if n / i != i:
                count +=1
        i = i + 1
    return count

def findTriangleNumber(n):
    i = 1
    cur = 1
    count = findtotalFactors(cur)

    while count <= n:
        i += 1
        cur = cur + i
        count = findtotalFactors(cur)
    
    return cur

n = int(input("Enter Number for n: "))
print("Triangle Number : ", findTriangleNumber(n))