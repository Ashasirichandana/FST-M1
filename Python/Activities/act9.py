list1 = list(input("Enter a sequence of comma separated values in list1: ").split(","))
list2=  list(input("Enter a sequence of comma separated values in list2: ").split(","))
list3=[]
for i in list1:
    if (int(i) % 2)==1:
        list3.append(i)
for j in list2:
    if (int(j) % 2)==0:
         list3.append(j)

print(list3)