fruits_list=["kiwi","banana","apple","cherry"]
if "kiwii" in fruits_list:
    print("yes")
else:
    print("no")

"""
def isfruitpresent(fruitname):
    for fruits in fruits_list:
        if fruits is fruitname:
            print("{}is present".format(fruitname))
            break


isfruitpresent("apple")"""

##how to write a file in python
file_path= "/Users/robin.vincent/Desktop/t_.txt"
def readfile():
    with open(file_path,"r")as files:
        lines = files.readlines()
        for i in lines:
            print(i)

    with open(file_path,"w")as files:
        #lines = files.writelines()
        temp ="Merly"
        for i in lines:
            if temp=="Merlyu":
                files.writelines("MerlyThomas")
            else:
                files.write(i)



readfile()
