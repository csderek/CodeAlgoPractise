import math
class RoundNumbers:
    def __init__(self, num):
        self.num = int(num)
        self.times = 0
        self.answer = []
    
    def findSumOfRoundNumbers(self):
        runningNumber = self.num
        index = 0
        while int(math.log10(self.num)) + 1 > index:
            remainder = runningNumber % 10
            runningNumber = int(runningNumber / 10)
            if remainder > 0:
                self.answer.append(remainder * pow(10, index))
                self.times = self.times + 1
            index = index + 1 
        
        print(self.times)
        ##self.answer.reverse()
        ans = ""
        for a in self.answer:
            ans = ans + str(a) + " "
        print(ans)


if __name__ == "__main__":
    numOfRecords = input()
    numArr = []
    ##print(numOfRecords)
    for count in range(0, int(numOfRecords)):
        num = input()
        numArr.append(num)
    for num in numArr:
        rn = RoundNumbers(num)
        rn.findSumOfRoundNumbers()
