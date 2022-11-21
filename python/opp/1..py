class SieuNhan:
    def __init__(self, para_ten, para_vu_khi,para_mau_sac):
        self.ten = "Sieu nhan " + para_ten
        self.vu_khi = para_vu_khi
        self.mau_sac = para_mau_sac


    def xin_chao(self):
        return "Xin chao, ta chinh la "+self.ten


sieu_nhan_A = SieuNhan("Pham Quoc Hoang","Knowledge","Tím rịm ")


# print("Ten cua sieu nhan la: ",sieu_nhan_A.ten)
# print("Sieu nhan mau: "+sieu_nhan_A.vu_khi)
# print("Su dung vu khi: ",sieu_nhan_A.mau_sac)  

print(sieu_nhan_A.xin_chao())
print(SieuNhan.xin_chao(sieu_nhan_A))