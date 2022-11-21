class kter:
    def __init__(self,ho,ten):
        self.ho = ho
        self.ten = ten

    @property       #hàm thành thuộc tính
    def ho_va_ten(self):
        return  "{} {}".format(self.ho,self.ten)

    @property   
    def email(self):
        return self.ho +" "+ self.ten +"@liftsoft.vn"

    @ho_va_ten.setter
    def ho_va_ten(self,ten_moi):
        ho_moi,ten_moi = ten_moi.split(' ')
        self.ho = ho_moi
        self.ten = ten_moi

    @ho_va_ten.deleter
    def ho_va_ten(self):
        self.ho = None
        self.ten = None
        print("Đã Xóa")

kter_A = kter("Pham","Hoang")

kter_A.ho_va_ten = "PHAM HOANG"
print(kter_A.ho_va_ten)
del kter_A.ho_va_ten
del kter_A.ho_va_ten
