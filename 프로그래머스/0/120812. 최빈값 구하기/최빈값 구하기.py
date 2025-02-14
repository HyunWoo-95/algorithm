def solution(array):
    count = [0] * (max(array)+1) # 숫자 빈도 수 리스트
    for i in array:
        count[i] += 1
    m = 0 # 최빈 값의 개수
    for c in count:
        if c == max(count):
            m += 1
    if m > 1:
        return -1
    else:
        return count.index(max(count))
