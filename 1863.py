# 백준 1863 실버1 스카이라인 쉬운거
# 20분
# 스택

import sys
N = int(sys.stdin.readline().rstrip())
qlist = [list(map(int, sys.stdin.readline().rstrip().split())) for i in range(N)]

s = []
answer = 0
for w, h in qlist:
    # stack is empty
    if h == 0:
        s = []
        continue
    elif len(s) == 0:
        s.append(h)
        answer = answer + 1
        continue

    if s[-1] < h:
        s.append(h)
        answer = answer + 1
        continue

    isInMe = False
    for i in range(len(s)):
        if s[-1] > h:
            del s[-1]
        elif s[-1] == h:
            del s[-1]
            isInMe = True
        else:
            break

    s.append(h)
    if not isInMe:
        answer = answer + 1

print(answer)