def solution(sizes):
    answer = 0
    max_w = []
    min_h = []
    for i in sizes:
        max_w.append(max(i)) # 60 70 60 80
        min_h.append(min(i)) # 50 30 30 40
    return max(max_w) * max(min_h)