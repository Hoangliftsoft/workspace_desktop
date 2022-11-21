#Nhập vào số A
soA = input("Nhập vào số A: ")

#Nhập vào số B
soB = input("Nhập vào số B: ")

try:
    digitA = float(soA)
    digitB = int(soB)

    print("{0:.{1}f}".format(digitA,digitB))
except:
    print("Định dạng đầu vào không hợp lệ!")


