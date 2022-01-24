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
    for usr in userlist.keys():
        for i in range(0,len(answer)):
            answer[i]=answer[i].replace(usr,userlist.get(usr))
    # 왜 안 되는 걸까요?........
    print(answer)
    print(userlist)
    return answer

record=["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
solution(record)