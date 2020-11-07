
def answer(times, time_limit):
    return times;

#Creating Test Cases
if __name__ == '__main__':
    
    #Test Case 1 - From readme.txt
    print("\n\nTest Case: 1 \n\t Time limit: 1")
    case1 = [   [0, 2, 2, 2, -1], 
                [9, 0, 2, 2, -1], 
                [9, 3, 0, 2, -1], 
                [9, 3, 2, 0, -1], 
                [9, 3, 2, 2, 0]]

    for row in case1:
        print('\t', row)
    print("\n\tExpected: [1, 2]")
    print("\tOutput: ", str(answer(case1, 1)))
    
    #Test Case 2 - From readme.txt
    print("\n\nTest Case: 1 \n\t Time limit: 3")
    case2 = [   [0, 1, 1, 1, 1], 
                [1, 0, 1, 1, 1], 
                [1, 1, 0, 1, 1], 
                [1, 1, 1, 0, 1], 
                [1, 1, 1, 1, 0]]

    for row in case2:
        print('\t', row)
    print("\n\tExpected: [0, 1]")
    print("\tOutput: ", str(answer(case2, 1)))