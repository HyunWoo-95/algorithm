def solution(array):
    answer = [0] * (max(array)+1)
    for i in array :
        answer[i] += 1
    m = 0
    for c in answer :
        if c == max(answer) :
            m += 1
    if m != 1 :
        return -1
    else :
        return answer.index(max(answer))