package BTtet;

import java.util.Scanner;

public class SinhVien {
     String ma;
     String Ten;
     String dienThoai;
     String diaChi;
     double diemThi;

    public SinhVien(String ma, String ten, String dienThoai, String diaChi, double diemThi) {
        this.ma = ma;
        this.Ten = ten;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.diemThi = diemThi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return Ten;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Sinh Vien : ");
        ma=sc.nextLine();
        System.out.println("Nhap ten Sinh Vien : ");
        Ten=sc.nextLine();
        System.out.println("Nhap dien thoai : ");
        dienThoai= sc.nextLine();
        System.out.println("Nhap dia chi :");
        diaChi=sc.nextLine();
        System.out.println(" Nhap diem thi :");
        diemThi=sc.nextDouble();
    }
    public void inThongTin(){
        System.out.println("ma  "+ma);
        System.out.println("Ten "+Ten);
        System.out.println("dien thoai  "+dienThoai);
        System.out.println("dia chi  "+diaChi);
        System.out.println("diem thi  "+diemThi);
    }

}
