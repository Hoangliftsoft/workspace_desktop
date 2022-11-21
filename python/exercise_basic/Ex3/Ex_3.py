name = input("Enter your name: ")  # Nhập vào tên

# Xuất ra với định dạng theo yêu cầu của đề bài
# Tham số sep='--' giúp ngăn cách các từ bởi '--'
def str_concatenation(val):
    print("Xin","chao!","toi","ten","la","{}".format(val),sep="--")


if __name__ == "__main__":
    str_concatenation(name)