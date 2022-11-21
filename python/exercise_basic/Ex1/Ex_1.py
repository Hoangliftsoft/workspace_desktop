first_digit = int(input("Enter the first number: "))    # Nhập vào giá trị thứ nhất
second_digit = int(input("Enter the second number: "))  # Nhập vào giá trị thứ hai


# Hàm tính tổng
def sum(a, b):
    result = first_digit+second_digit
    return result


if __name__ == "__main__":
    print(sum(first_digit, second_digit))
