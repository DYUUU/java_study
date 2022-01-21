def solution(arr1, arr2):
    answer = [[]]
    result = 0
    for i in range(0,len(arr1)-1):
        answer.append([])
    for j in range(0,len(arr1)):
        for i in range(0,len(arr1[0])):
            result = arr1[j][i] + arr2[j][i]
            answer[j].append(result)
    return answer

arr1 = [[1],
        [2]]
arr2 = [[3],
        [4]]
solution(arr1, arr2)