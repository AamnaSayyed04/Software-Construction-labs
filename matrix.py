def iterativemultiply(a,b,n,p):
    
    Matrix=[[0 for x in range(p)]for y in range(n)]  #resultant matrix
    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
                Matrix[i][j]+=a[i][k]*b[k][j]

    return Matrix


def add(a,b):    #addition of matrix
    n=len(a)
    c=[[0 for j in range(n)] for i in range(n)]
    for i in range(n):
        for j in range(n):
            c[i][j]=a[i][j]+b[i][j]
    return c

def sub(a,b):   #subtraction
    n=len(a)
    c=[[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            c[i][j]=a[i][j]-b[i][j]
    return c

def strassens(A, B):
    # Implementation of the strassen algorithm

    n = len(A[0])
    C = [[0 for j in range(n)] for i in range(n)]
    if n==1:
        C[0][0] = A[0][0]*B[0][0]    #base case 
        return C

    else:
        m=n//2     #sub matrices 

        A11 = [[0 for j in range(m)] for i in range(m)]
        A12 = [[0 for j in range(m)] for i in range(m)]
        A21 = [[0 for j in range(m)] for i in range(m)]
        A22 = [[0 for j in range(m)] for i in range(m)]

        B11 = [[0 for j in range(m)] for i in range(m)]
        B12 = [[0 for j in range(m)] for i in range(m)]
        B21 = [[0 for j in range(m)] for i in range(m)]
        B22 = [[0 for j in range(m)] for i in range(m)]

        AR = [[0 for j in range(m)] for i in range(m)]
        BR = [[0 for j in range(m)] for i in range(m)]

        for i in range(m):
            for j in range(m):    #4 sub matrices 
                A11[i][j] = A[i][j]            
                A12[i][j] = A[i][j + m]
                A21[i][j] = A[i + m][j]    
                A22[i][j] = A[i + m][j + m] 

                B11[i][j] = B[i][j]            
                B12[i][j] = B[i][j + m]    
                B21[i][j] = B[i + m][j]    
                B22[i][j] = B[i + m][j + m]

        #calculating p

        BR = sub(B12, B22) #(b12-b22)
        p1 = strassens(A11, BR) # p1 = (a11) * (b12-b22)
       
        AR = add(A11, A12)      # a11 + a12
        p2 = strassens(AR, B11)  # p2 = (a21+a22) * (b11)
        
        AR = add(A21, A22) # a21 + a22
        p3 = strassens(B11, AR)  # p3 = (b11) * (a21 + a22)
        
        BR = sub(B21, B11) # b21 - b11
        p4 =strassens(A22, BR)   # p4 = (a22) * (b21 - b11)
        
        BR =  add(B11,B22)     #b11+b22
        AR = add(A11, A12)      # a11 + a12
        p5 = strassens(AR, BR)  # p5 = (a11+a12) * (b11+b22)   
        
        AR = sub(A12, A22) # a12 - a22
        BR = add(B21, B22)      # b11 + b12
        p6 = strassens(AR, BR) # p6 = (a21-a11) * (b11+b12)
        
        AR = sub(A11, A21) # a12 - a21
        BR = add(B11, B12)      # b11 + b12
        p7 = strassens(AR, BR) # p7 = (a12-a21) * (b11+b12)

        #calcualting resultants 

        AR = add(p5, p4) # p5 + p4
        BR = add(AR, p6) # p5 + p4 + p6
        c11 = sub(BR, p2) # c11 = p1 + p4 - p2 + p6

        c12 = add(p1, p2) # c12 = p1 + p2
        c21 = add(p3, p4)  # c21 = p3 + p4


        AR = add(p5, p1) # p5 + p1
        BR = sub(AR, p3) # p5 + p1 - p3
        c22 = sub(BR, p7) # c22 = p5 + p1 - p3 - p7

        C = [[0 for j in range(n)] for i in range(n)]  # forming matrix of resultant
        for i in range(m):
            for j in range(m):
                C[i][j] = c11[i][j]
                C[i][j + m] = c12[i][j]
                C[i + m][j] = c21[i][j]
                C[i + m][j + m] = c22[i][j]

        return C



