def solution(array, commands):
    answer = []
    for command in commands:
        i,j,k = command # ex[2,5,3] -> i = 2, j = 5, k = 3
        sliced_value = array[i - 1 : j] # i ~ j 까지 슬라이싱
        sorted_value = sorted(sliced_value) # 정렬된 새로운 배열 생성
        answer.append(sorted_value[k - 1]) # k 번째 번호를 찾아 저장
    return answer