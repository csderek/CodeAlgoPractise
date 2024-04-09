def isPalindrome(num):
    numStr = str(num)
    mid = len(numStr) / 2

    for i in range(0, int(mid)):
        if numStr[i] != numStr[len(numStr) - i - 1]:
            return False
    return True

def findMaxPalindromeProduct(n):
    min = pow(10, n - 1)
    max = 0
    for i in range(0, n):
        max = max * 10 + 9
    x = max
    y = max
    ##print("x: ", x , " ;y: " , y , " ;min: ", min)
    result = -1
    while x >= min:
        y = max
        while y >= min:
            product = x * y
            ##print("product: " , product)
            ##print("x: ", x , " ;y: " , y ,"product: " , product)
            if product > result and isPalindrome(product):
                result = product
            y -= 1
        x -= 1 
    return result


n = int(input("Enter Number for n: "))

print("Product: ", findMaxPalindromeProduct(n))