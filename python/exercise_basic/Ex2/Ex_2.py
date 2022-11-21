first_number = input("Enter the first number: ")    # Nhập vào số thứ nhất
second_number = input("Enter the second number: ")  # Nhập vào số thứ hai

try:    # Khối lệnh có thể phát sinh lỗi
    n1 = int(first_number)      # Ép kiểu giá trị 1 sang số nguyên
    n2 = int(second_number)     # Ép kiểu giá trị 2 sang số nguyên

    # Hàm tính tổng hai số
    def sum (n1,n2):
        return n1+n2

except: # Khối lệnh được thực thi khi phát sinh lỗi
    print("Định dạng đầu vào không hợp lệ!")

if __name__ == "__main__":
    print("The two number is: {}".format(sum(n1,n2)))   # in ra tổng hai số nguyên
