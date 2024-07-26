# def test():
#     a=[x ** 2 for x in range(10 ** 1)]
#     square_dict = {x: x ** 2 for x in range(5)}
#     # while False:
#     #     a
#     print(a)
#     print(f"valie is {square_dict}")

#
import sys
import pdb

add = 0.0
n = len(sys.argv)
print(n)
for i in range(1, n):
    add += float(sys.argv[i])
    print("the sum is :", add)
print("done")


# for i in range(1, ):
#     print(i)
