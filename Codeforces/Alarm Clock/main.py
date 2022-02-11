recordArr = []

class AlarmClock:
    def __init__(self, sleepRequireTime, alarmFirstTime, alarmRecurTime, sleepAgainTime):
        super().__init__()
        self.sleepRequireTime = sleepRequireTime
        self.alarmFirstTime = alarmFirstTime
        self.alarmRecurTime = alarmRecurTime
        self.sleepAgainTime = sleepAgainTime
        self.totalUsedTime = 0
        self.totalSleepTime = 0

    def alarmFunction(self):
        if self.alarmFirstTime >= self.sleepRequireTime:
            print(self.alarmFirstTime)
            return
        
        if self.alarmRecurTime <= self.sleepAgainTime:
            print(-1)
            return
        """
        self.totalSleepTime = self.alarmFirstTime
        self.totalUsedTime = self.alarmFirstTime
        while self.totalSleepTime < self.sleepRequireTime:
            self.totalSleepTime = self.totalSleepTime + self.alarmRecurTime - self.sleepAgainTime
            self.totalUsedTime = self.totalUsedTime + self.alarmRecurTime
        
        print(self.totalUsedTime)
        """
        remainTime = self.sleepRequireTime - self.alarmFirstTime
        sleepTime = self.alarmRecurTime - self.sleepAgainTime
        numberOfSleep = 0
        if remainTime % sleepTime > 0:
            numberOfSleep = int(remainTime/sleepTime) + 1
        else:
            numberOfSleep = int(remainTime/sleepTime)
        self.totalUsedTime = self.alarmFirstTime + numberOfSleep * self.alarmRecurTime
        print(self.totalUsedTime)
        return

if __name__ == "__main__":
    numOfRecords = input()
    for i in range(0, int(numOfRecords)):
        record = input()
        records = record.split(" ")
        recordArr.append(records)
    ##print(recordArr)
    for i in recordArr:
        ac = AlarmClock(int(i[0]),int(i[1]),int(i[2]),int(i[3]))
        ac.alarmFunction()
