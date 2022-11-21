package javaapplication13;
public class SinhVien {
    private String maSV ,hoTen;
    private boolean gioiTinh;
    double diemT,diemL,diemH;
    public SinhVien(String maSV, String hoTen, boolean gioiTinh, double diemT, double diemL, double diemH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diemT = diemT;
        this.diemL = diemL;
        this.diemH = diemH;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public double getDiemT() {
        return diemT;
    }
    public void setDiemT(double diemT) {
        this.diemT = diemT;
    }
    public double getDiemL() {
        return diemL;
    }
    public void setDiemL(double diemL) {
        this.diemL = diemL;
    }
    public double getDiemH(){
        return diemH;
    }
    public void setDiemH(double diemH) {
        this.diemH = diemH;
    }
    public String xepLoai(){
        double diemTB=(getDiemT()+getDiemL()+getDiemH())/3;
        if (diemTB<3.5) return " kem ";
        if (diemTB<5) return " yeu ";
        if (diemTB<6.5) return " trung binh ";
        if (diemTB<8) return " kha ";
        if (diemTB<9) return " gioi ";
        return " xuat sac ";
    }
    public double diemTB(){
        double diemTB=(getDiemT()+getDiemL()+getDiemH())/3;
        return diemTB;
    }
    public SinhVien() {
    }
    public String toString(){
        return maSV + "  " + hoTen + "  " + (gioiTinh? " Nam " : " Nu " )
                + "  "+ diemT +"  "+ diemL +"  "+ diemH +" "+xepLoai();
    }
    public static void main (String[]args){
        SinhVien x = new SinhVien ("sv001","Le Van nam",true,7.8,8,9.2);
        System.out.println(x);
    }
}

