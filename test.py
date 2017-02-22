import matrix

#input test1
a=[[2,2],[2,2]]
b=[[2,2],[2,2]]

#output
result=[[8,8],[8,8]]

mat=matrix.iterativemultiply(a,b,2,2)  #result
if( mat== result):
    print "iterative test1 passed"
else:
    print "iterative test1 failed"

mat=matrix.strassens(a,b)   # result

if( mat== result):
    print "strassens test1 passed"
else:
    print " strassens test1 failed"

#input test2
a=[[4,4,4,4],[4,4,4,4],[4,4,4,4],[4,4,4,4]]
b=[[4,4,4,4],[4,4,4,4],[4,4,4,4],[4,4,4,4]]
#output
result=[[64,64,64,64],[64,64,64,64],[64,64,64,64],[64,64,64,64]]

mat=matrix.strassens(a,b)
if( mat== result):
    print "strassens test2 passed"
else:
    print "strassens test2 failed"


mat=matrix.iterativemultiply(a,b,4,4)
if( mat== result):
    print "iterative test2 passed"
else:
    print "iterative test2 failed"
