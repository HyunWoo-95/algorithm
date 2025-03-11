def solution(array, commands):
    answer = []
    for command in commands:
        i,j,k = command
        slliced = array[i - 1 : j] # i ~ j 까지 배열 자르기
        sorted_sliced =  sorted(slliced)
        answer.append(sorted_sliced[k-1])  # k번째 숫자 찾고 저장하기
    return answer