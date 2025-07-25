def solution(my_string, s, e):
    # arr = list(my_string)
    # tmp = list(my_string)
    # tmp = tmp[s:e+1] # ['2', '1', 'S', 'r', 'e', 'm', 'm']
    # print(tmp)
    # tmp = tmp[::-1]
    # print(tmp) # ['m', 'm', 'e', 'r', 'S', '1', '2']
    # arr[s:e+1] = tmp
    # print(tmp)
    # arr = ''.join(arr)
    # print(arr)
    # return arr
    
    # return my_string[:s]+my_string[s:e+1][::-1]+my_string[e+1:]
    
    sub_str = reversed(list(my_string[s:e+1]))
    return my_string[:s]+''.join(sub_str)+my_string[e+1:]
    