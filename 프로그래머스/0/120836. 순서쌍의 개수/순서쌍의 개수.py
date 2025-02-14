def solution(n):
    answer = 0
    idx = 1
    while idx <= n :
        if n % idx == 0:
            answer += 1
        idx += 1
    return answer