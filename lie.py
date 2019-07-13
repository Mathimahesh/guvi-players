n1=input().split()
n2=input().split()
n3=input().split()
if(n1[0]==n2[0]==n3[0] or n1[1]==n2[1]==n3[1] or (n1[0]==n1[1] and n2[0]==n2[1] and n3[0]==n3[1])):
    print("yes")
else:
    print("no")
