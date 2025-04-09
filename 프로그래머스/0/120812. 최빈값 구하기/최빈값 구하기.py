def solution(array):
    arr = [0] * 1001 # 배열에 존재하는 값을 저장하기 위한 배열
    
    for i in range(len(array)): # 입력값의 값을 인덱스로 이용해 동일한 값마다 +1
        arr[array[i]] += 1
    # 배열의 최빈값이 1개 이상일 경우 -1 반환
    if arr.count(max(arr)) > 1:
        return -1
    return arr.index(max(arr))