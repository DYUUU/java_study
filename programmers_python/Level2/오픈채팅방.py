def solution(record):
    answer = []
    userlist = {}
    for userlistStr in record:
        tmp = userlistStr.split()
        if(tmp[0]=="Enter"):
            answer.append(tmp[1]+"님이 들어왔습니다.")
            userlist[tmp[1]]=tmp[2]
        elif(tmp[0]=="Change"):
            userlist[tmp[1]]=tmp[2]
        elif(tmp[0]=="Leave"):
            answer.append(tmp[1]+"님이 나갔습니다.")
    for i in range(0,len(answer)):
        for usr in userlist.keys():
            answer[i]=answer[i].replace(usr,userlist.get(usr))
    return answer