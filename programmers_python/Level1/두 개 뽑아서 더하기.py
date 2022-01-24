def solution(numbers):
    answer = []
    result = 0;
    for j in range(1,len(numbers)):
        # 중복 제거하고 싶은데 실패
        # if(numbers[j-1]==numbers[j]):
        #     continue
        # else:
        tmp=numbers[j-1]
        for i in numbers[j:]:
            result = tmp + i
            if(result in answer):
                continue
            else:
                answer.append(result)               
    answer.sort()
    return answer
