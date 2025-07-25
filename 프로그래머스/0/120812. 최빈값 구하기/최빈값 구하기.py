def solution(array):
    # answer = [0] * (max(array)+1) # 숫자 출연의 빈도 수를 기록할 리스트
    # for i in array :
    #     answer[i] += 1
    # m = 0 # 최빈값의 개수
    # for c in answer :
    #     if c == max(answer) :
    #         m += 1
    # if m != 1 :
    #     return -1
    # else :
    #     return answer.index(max(answer))
    while len(array) != 0 :
        for i, a in enumerate(set(array)) : 
            # i는 index, a는 값
            array.remove(a)
        if i == 0 : return a
    return -1