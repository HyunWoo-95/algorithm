def solution(n, numlist):
    answer = []
    # for i in numlist:
    #     if i % n == 0:
    #         answer.append(i)
    for i in range(len(numlist)):
        if numlist[i] % n == 0:
            answer.append(numlist[i])
    return answer