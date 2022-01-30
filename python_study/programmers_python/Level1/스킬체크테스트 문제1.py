# 문자열->아스키 ord()
# 아스키->문자열 chr()

def solution(s, n):
    answer = ''
    for str in s:
        if(str == " "):
            answer += " "
            continue
        else:
            asciivalue = ord(str)+n
            if((asciivalue > ord('Z') and asciivalue < ord('a'))
            or asciivalue > ord('z')):
                answer += chr(asciivalue -26)
            else:
                answer += chr(asciivalue)
    return answer

s="AB"
n=1
solution(s,n)