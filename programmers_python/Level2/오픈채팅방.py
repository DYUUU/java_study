def solution(record):
    answer = []
    userlist = {}
    for str in record:
        tmp = str.split()
        if(tmp[0]=="Enter"):
            answer.append(tmp[2]+"님이 들어왔습니다.")
            userlist[tmp[1]]=tmp[2]
        elif(tmp[0]=="Change"):
            userlist[tmp[1]]=tmp[2]
        elif(tmp[0]=="Leave"):
            answer.append(userlist.get(tmp[1])+"님이 나갔습니다.")
    print(answer)
    return answer

record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
solution(record)