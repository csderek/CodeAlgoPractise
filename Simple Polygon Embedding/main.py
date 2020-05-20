import math
if __name__ == "__main__":
    numOfRecords = input()
    for i in range(0, int(numOfRecords)):
        noOfSides = input()
        result = 1 / math.tan(math.pi/(2*int(noOfSides)))
        print(result)