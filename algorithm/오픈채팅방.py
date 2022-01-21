def solution(record):
    answer = []
    map = dict()
    for str in record:
        strarr = str.split()
        if strarr[0] == "Enter":
            answer.append(strarr[1]+" 님이 들어왔습니다.")
            if strarr[2]:
                map[strarr[1]]=strarr[2]
        elif strarr[0]=="Leave":
            answer.append(strarr[1]+" 님이 나갔습니다.")
        else:
            map[strarr[1]]=strarr[2]
    ans=[]
    for item in answer:
        tstr = item.replace(item.split()[0],map[item.split()[0]])
        item = tstr.split()[0]+tstr.split()[1]+" "+tstr.split()[2]
        ans.append(item)
    
    return ans

print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))