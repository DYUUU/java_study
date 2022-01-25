"""
ord() 문자열->아스키
chr() 아스키->문자열
"""

def solution(s, n):
    answer = ''
    for str in s :
        # 공백 처리
        if(str==" "):
            answer += " "
            continue
        asciiValue = ord(str) + n
        # 대문자
        if(ord(str)>=ord("A") and ord(str) <= ord("Z")):
            if(asciiValue >= ord("Z")):
                answer += chr(asciiValue - 26)
            else:
                answer += chr(asciiValue)
        # 소문자
        elif(ord(str)>=ord("a") and ord(str) <= ord("z")):
            if(asciiValue >= ord("z")):
                answer += chr(asciiValue - 26)
            else:
                answer += chr(asciiValue)
    print(answer)
    return answer

s="X Z z"
n=25
solution(s,n)