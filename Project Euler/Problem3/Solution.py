def findPrimeNumbers(n):
    list = []
    while n % 2 == 0:
        list.append(2)
        n = n / 2
    i = 3
    while i * i <= n:
        print("n: ", n , " ;i: ", i, "n % i: ", n % i)
        if n % i == 0:
            print("Can Divide")
            n = n / i
            list.append(i)
        else:
            i = i + 2
    if n > 2:
        list.append(int(n))
    return list

n = int(input("Enter Number for n: "))

print("Prime Numbers: ", findPrimeNumbers(n))