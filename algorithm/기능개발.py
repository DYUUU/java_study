import numpy as np

def solution(progresses, speeds):
    answer = []
    length = len(progresses)
    boolean = np.array(progresses)
    boolean=boolean<=100
    index=0
    print(boolean)
    while True:
        count=0
        for j in range(length):
            progresses[j]+=speeds[j]
            if j<=index and boolean[j] and progresses[j]>=100:
                count+=1
                index+=1
                boolean[j]=False
        if count>0:
            answer.append(count)
        if all(np.array(progresses)>=100):
            break
    return answer