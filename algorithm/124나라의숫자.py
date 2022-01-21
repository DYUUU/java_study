def solution(n):
    answer = ''
    while n!=0:
        a =n%3
        if a==1:
            answer+="1"
        elif a==2:
            answer+="2"
        else:
            answer+="4"
            n-=1
        n=n//3
    
    return answer[::-1]