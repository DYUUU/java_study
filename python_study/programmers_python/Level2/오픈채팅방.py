def solution(record):
    answer = []
    userlist = {}
    for userlistStr in record:
        # 유저 추가하기
        tmp = userlistStr.split()
        if(tmp[0]=="Enter"):
            answer.append(tmp[1]+"님이 들어왔습니다.")
            userlist[tmp[1]]=tmp[2]
        elif(tmp[0]=="Change"):
            userlist[tmp[1]]=tmp[2]
        elif(tmp[0]=="Leave"):
            answer.append(tmp[1]+"님이 나갔습니다.")
    # 유저 이름 변경하기 (후처리)
    for i in range (len(answer)):
        idx = answer[i].find("님")
        answer[i]=answer[i].replace(answer[i][:idx],userlist.get(answer[i][:idx]))
    return answer

record=["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
solution(record)