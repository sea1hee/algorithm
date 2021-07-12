#
#
#

import sys
N = int(sys.stdin.readline().rstrip())
M = int(sys.stdin.readline().rstrip())
breakButtomL = list(map(int, sys.stdin.readline().rstrip().split()))

isFind = False
cur = N
count = 0
upper = N
lower = N
while not isFind:
    numberL = list(set(cur.split()))
    print(numberL)
