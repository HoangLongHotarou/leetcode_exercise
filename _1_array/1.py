def setZeroes():
    """
    :type matrix: List[List[int]]
    :rtype: None Do not return anything, modify matrix in-place instead.
    """
    global matrix
    s = []
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == 0:
                s.append([i, j])
    for x in s:
        u = 0
        v = 0
        while(u < len(matrix[i])):
            matrix[x[0]][u] = 0
            u += 1
        while(v < len(matrix)):
            matrix[v][x[1]] = 0
            v += 1


# matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
# setZeroes(matrix)
# print(setZeroes(matrix))

matrix = [[0, 1, 2, 0],[3,4,5,2],[1,3,1,5]]
# # a = [[1,2,3,4,5],[6,7,3,4,5]]
# x = [ [0 for i in range(len(matrix[j]))] for j in range(len(matrix))]
setZeroes()
print(matrix)
