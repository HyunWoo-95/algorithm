def solution(my_string, s, e):
    arr = list(my_string)
    tmp = list(my_string)
    tmp = tmp[s:e+1] # ['2', '1', 'S', 'r', 'e', 'm', 'm']
    print(tmp)
    tmp = tmp[::-1]
    print(tmp) # ['m', 'm', 'e', 'r', 'S', '1', '2']
    arr[s:e+1] = tmp
    print(tmp)
    arr = ''.join(arr)
    print(arr)
    return arr