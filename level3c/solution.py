def solution(n):

    n = int(n)
    solution = 0
    
    while (n != 1):
        if (n % 2 == 0):
            n = n / 2
                
        elif ((n == 3) or ((n + 1) & n) > ((n - 1) & (n - 2))):
            n = n - 1
                
        else:
            n = n + 1
            
        solution = solution + 1
        
    return solution

print(solution(4))
print(solution(15))
print(solution(309))