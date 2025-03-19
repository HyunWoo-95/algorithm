def solution(answers):
    answer = []
    supoja_1 = [1, 2, 3, 4, 5]
    supoja_2 = [2, 1, 2, 3, 2, 4, 2, 5]
    supoja_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    scores = [0,0,0]
    for i in range(len(answers)):
        if answers[i] == supoja_1[i % len(supoja_1)]:  # 패턴 반복
            scores[0] += 1
        if answers[i] == supoja_2[i % len(supoja_2)]:
            scores[1] += 1
        if answers[i] == supoja_3[i % len(supoja_3)]:
            scores[2] += 1
    max_score = max(scores)
    
    result = [i + 1 for i, score in enumerate(scores) if score == max_score]
    return result