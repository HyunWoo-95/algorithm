def solution(t, p):
    answer = 0
    len_p = len(p) # '271' = 3
    int_p = int(p)
    for i in range(len(t) - len_p + 1): # 연속된 부분 문자열 탐색
        if int(t[i:i+len_p]) <= int_p: # 
            answer += 1
    return answer
# def solution(t, p):
#     len_p = len(p)
#     return sum(1 for i in range(len(t) - len_p + 1) if t[i:i+len_p] <= p)