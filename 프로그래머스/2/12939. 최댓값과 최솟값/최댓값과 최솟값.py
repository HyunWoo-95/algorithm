def solution(s):
    # 문자열의 공백을 기준으로 분리한다면 split()를 사용
    str_array = s.split()
    int_array = list(map(int,str_array))
    int_array.sort()
    answer = str(int_array[0]) + ' ' + str(int_array[-1])
    return answer