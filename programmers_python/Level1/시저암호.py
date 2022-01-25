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
        if(ord(str) >= ord("A") and ord(str) <= ord("Z")):         
            if(asciiValue>ord("Z")):
                asciiValue -= 26
        # 소문자
        if(ord(str) >= ord("a") and ord(str) <= ord("z")):
            if(asciiValue>ord("z")):
                asciiValue -= 26
        answer += chr(asciiValue)
        # 소문자
    print(answer)
    return answer

s="a A"
n=25
solution(s,n)