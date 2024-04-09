def sumEvenFibonacci(n):
    sum = 0
    prev = 1
    cur = 2
    while cur < n:
        if cur % 2 == 0:
            sum += cur
        tmp = cur
        cur = cur + prev
        prev = tmp
    return sum

n = int(input("Enter Number for n: "))

print("Sum: ", sumEvenFibonacci(n))