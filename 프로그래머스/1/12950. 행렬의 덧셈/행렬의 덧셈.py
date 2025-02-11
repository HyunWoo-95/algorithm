def solution(arr1, arr2):
    # 두 행렬을 더하는 문제
    # 행렬의 덧셈은 같은 자리에 위치한 행렬끼리만 진행
    # 파이썬에서 이차원 배열은 [행][열]
    # 이차원 배열에서 len()을 이용하면 행의 개수를 리턴, len(arr1[0])을 이용해 열의 개수를 리턴
    for i in range(len(arr1)):
        for j in range(len(arr1[0])):
            arr1[i][j] += arr2[i][j]
    answer = arr1
    return answer