def tripetProduct(n):
    for i in range(1, n):
        for j in range(i, n):
            k = n - i - j
            if pow(i, 2) + pow(j, 2) == pow(k, 2):
                print( "i: ", i, " ;j: ", j , " ;k: ", k )
                return i * j * k

n = int(input("Enter Number for n: "))
print("Tripet Product: ", tripetProduct(n))
