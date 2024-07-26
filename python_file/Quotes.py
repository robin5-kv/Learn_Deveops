"""
flml

"""
import os as a
name =  "Robin"
character= "good"
# print("hi my name is ",name)
# c=name.split("/")
#print(c[1])

print(name+ "is "+character+"boy" )
print(f"{name} is a {character} boy")
test= ("rahul","dravid","sachin","Dhoni")
print(test[0])
print(test[1:3])
print(test[1:3][0])
print(test[1:3][0][0:4])
print(test[1:3][0][0:4][2:])
print(a.getenv("test"))
a= ["robin",9,"gjk"]
for value in range(100):
    print(f"Values for a is {value}")
