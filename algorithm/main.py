a=10
def A():
    global a
    a=9
    print(a)
print(a)
A()
a=5
A()