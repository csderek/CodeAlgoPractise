def sumMultiple(a, b, n):
    sum = 0
    for i in range(1, n):
        if i % 3 == 0 or i % 5 ==0:
            sum += i
    return sum

a = int(input("Enter Number for a: "))
b = int(input("Enter Number for b: "))
n = int(input("Enter Number for n: "))

print("Sum: ", sumMultiple(a, b, n))