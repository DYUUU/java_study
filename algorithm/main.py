def solution(s):
    answer = len(s)
    for i in range(1,len(s)):
        sum =i
        sub = s[0:i]
        count =0
        for j in range(i,len(s),i):
            if j+i>len(s):
                sum+=len(s)%i
                break
            flag= True
            for k in range(i):
                if sub[k]!=s[j+k]:
                    flag = False
                    break
            if flag:
                count=count+1
            else:
                if count>=1:
                    sum+=len(str(count))
                sum+=i
                count=0
                sub=s[j:j+i]
        if count!=0:
            sum+=len(str(count))
        answer=sum if sum<answer else answer
    return answer

print(solution(input()))
