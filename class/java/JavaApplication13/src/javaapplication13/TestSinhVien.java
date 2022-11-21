package javaapplication13;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class TestSinhVien {
    private  ArrayList<SinhVien> a = new ArrayList<>();
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for(int i = 0; i < a.size();i++)
            System.out.println(a.get(i));
    }
    public void docFile(String tenFile){
        try{
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("Da mo duoc file");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ht;
                    boolean gt;
                    double t,l,h;
                    ma = line.next();
                    ht="";
                    while(!line.hasNextBoolean()) ht=ht+line.next()+" ";
                    gt=line.nextBoolean();
                    t=line.nextDouble();
                    l=line.nextDouble();
                    h=line.nextDouble();
                    SinhVien x= new SinhVien(ma,ht,gt,t,l,h);
                    a.add(x);
                }
            } else System.out.println("Khong ton tai file");
        } catch (Exception e) {
        }
    }
    public void loaiSV() {
    	for(SinhVien x : a) {
            if(x.diemTB()>tinhDiemTBChung()) {
                System.out.println(x);   			
            }   		
    	}
    }
    public double tinhDiemTBChung() {
    	double s= 0, dem=0;
    	for(SinhVien x : a) {   		
            s=s+x.diemTB();
            dem++;   		
    	}
    	if(dem==0)return 0;
    	return s/dem;
    }
    public double tinhDiemTBChungGioiTinh(boolean gt) {
        double s= 0, dem=0;
        for(SinhVien x : a) {
            if(x.isGioiTinh()==gt) {
                s=s+x.diemTB();
                dem++;
            }
        }
        if(dem==0)return 0;
        return s/dem;
    }
    public void sapXepGiamTheoDiem() {
    	for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).diemTB() >= a.get(i).diemTB()) {
                    SinhVien t = a.get(j);
                    a.set(j, a.get(i));
                    a.set(i, t);
                }
            }
        }
    }
    public int demSVKha(){
        int d=0;
        for(SinhVien x:a)
            if(x.diemTB()>=6.5 && x.diemTB()<8) d++;
        return d;
    }
    public double loaiSv() {
        double diemtb=0;
        for (SinhVien x:a){
            if(x.diemTB()>= 8){
                diemtb+= x.diemTB();
            }
        }
        return diemtb;
    }
    public int demHocBong(){
        int d=0;
        for(SinhVien x:a)
            if(x.diemTB()>8 && x.getDiemT()>=7 && x.getDiemL()>=7 && x.getDiemH()>=7)
                d++;
        return d;
    }
    public void  giamDanTheoDiem() {
	for (int i = 0; i < a.size() - 1; i++) {
	    for (int j = i + 1; j < a.size(); j++) {
	        if(a.get(i).diemTB() < a.get(j).diemTB()){
                    SinhVien t = a.get(j);
                    a.set(j, a.get(i));
                    a.set(i, t);
	        }
	    }
	}
    }
    public void xacDinhViThu(){
        for(int i=0;i<a.size();i++){
            int dem=0;
            for(int j = 1 ; j < a.size() ; j++)
                if(i!=j)
                    if(a.get(j).diemTB()>a.get(i).diemTB())dem++;
            System. out.println(a.get(i)+" VT "+(dem+1)); 
        }
    }
    public void output(){
        xuat("a.DSSV vua doc tu file:");
        System.out.println("b. Diem TBC Nam="+tinhDiemTBChungGioiTinh(true));
        System.out.println("   Diem TBC Nu="+tinhDiemTBChungGioiTinh(false));
        System.out.println("c.dem sinh vien kha = "+demSVKha());
        xuat("e. Loai sinh vien loai kem");
        loaiSv();
        xuat("f.DSSV giam dan theo diem");
        giamDanTheoDiem();
        System.out.println("g.dem hoc bong: "+demHocBong());
        System.out.println("i.Vi thu sinh vien ");
        xacDinhViThu();

        System.out.println("Diem trung bình: "+loaiSv());
        
    }
    public static void main (String[] args){
        System.out.println("Tran Duc Cuong");
        TestSinhVien  a = new TestSinhVien ();
        a.docFile("E:\\E:\\Project-Java\\a.txt");
        a.output();
    }
}
