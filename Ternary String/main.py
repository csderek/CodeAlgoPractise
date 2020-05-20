if __name__ == "__main__":
    numOfRecords = input()
    for i in range(0, int(numOfRecords)):
        integerStr = input()
        subStr = [-1]*3
        minlength = 0
        for i in range(0, len(integerStr)):
            ##print
            subStr[int(integerStr[i])-1] = i
            ##print(subStr)
            if min(subStr) == -1:
                continue
            if minlength == 0:
                minlength = max(subStr) - min(subStr) + 1
            else:
                if minlength > max(subStr) - min(subStr):
                    minlength = max(subStr) - min(subStr) + 1
        print(minlength)