class SieuNhan:

    stt = 1
    so_thu_tu = 1
    suc_manh = 50

    def __init__(self, para_ten, para_vu_khi, para_mau_sac):
        self.ten = "Sieu nhan " + para_ten
        self.vu_khi = para_vu_khi
        self.mau_sac = para_mau_sac
        
    def xin_chao(self):
        print("Xin chao, ta la ",self.ten)
        print("Suc manh cua ta la ",self.suc_manh)


sieu_nhan_A = SieuNhan("Phạm Quốc Hoàng","knowledge","Xanh lá")

sieu_nhan_A.xin_chao()