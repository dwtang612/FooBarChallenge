import math 

def solution(dimensions, yourPos, guardPos, distance):
    maxX = yourPos[0] + distance
    maxY = yourPos[1] + distance
    positiveX = math.ceil(maxX/dimensions[0])
    positiveY = math.ceil(maxY/dimensions[1])
    print("positiveX:", positiveX)
    print("positiveY:", positiveY)

if __name__ == '__main__':
    solution([3, 2],[1, 1] ,[2, 1] ,4)