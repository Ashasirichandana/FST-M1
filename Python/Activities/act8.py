numbers = list(input("Enter a sequence of comma separated values: ").split(","))
a=numbers[0]
b=numbers[-1]
if a==b:
    print("first and last numbers are same :true")
else:
    print("first and last numbers are different")