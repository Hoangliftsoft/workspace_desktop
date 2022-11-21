class SieuNhan:
    suc_manh = 50
    def __init__(self,para_ten,para_vu_khi,para_mau_sac):
        self.ten = para_ten
        self.vu_khi = para_vu_khi
        self.mau_sac = para_mau_sac


class SieuNhanDo(SieuNhan):
    suc_manh = 40
    def __init__(self,para_ten,para_vu_khi,para_mau_sac,para_su_thu):
        super().__init__(para_ten,para_vu_khi,para_mau_sac)
        self.su_thu = para_su_thu


sieu_nhan_A = SieuNhanDo("Sieu nhan do","Kiem","Do","Thỏ bếu")
print(sieu_nhan_A.__dict__)
print(sieu_nhan_A.suc_manh)