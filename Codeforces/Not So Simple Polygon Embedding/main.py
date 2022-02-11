import math
if __name__ == "__main__":
    numOfRecords = input()
    for i in range(0, int(numOfRecords)):
        noOfSides = int(input())
        ans = (1/(2*math.sin(math.pi/(4*noOfSides))))
        print(ans)