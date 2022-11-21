#Nhập số A từ bàn phím và chuyển sang kiểu số thực
soA = float(input("Nhập số A: "))

#Nhập số B từ bàn phím và chuyển sang kiểu số nguyên
soB = int(input("Nhập số B: "))

#Dùng format để định dạng chuỗi đầu ra
print("{0:.{1}f}".format(soA,soB))