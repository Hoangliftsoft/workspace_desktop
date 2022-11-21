def find_x(a,b):
    if a:
        return -b/a
    elif b:
        return "NONE"
    else :
        return "ALL"


# print(find_x(1,2))
if __name__ == "__main__":
    print(find_x(2,3))