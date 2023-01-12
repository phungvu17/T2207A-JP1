package BTtet;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc  {
    private String tenLop;
    private String phongHoc;
    public ArrayList<String> SinhVien = new ArrayList<>();

    public LopHoc(String tenLop, String phongHoc) {
        this.tenLop = tenLop;
        this.phongHoc = phongHoc;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public ArrayList<String> getSinhVien() {
        return SinhVien;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public void setSinhVien(ArrayList<String> sinhVien) {
        SinhVien = sinhVien;
    }
    public void nhapThongTinLop(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten Lop :");
        tenLop=sc.nextLine();
        System.out.println("Phong Hoc : ");
        phongHoc=sc.nextLine();
    }
    public void addSinhVien(String sinhVien){
        if (!this.getSinhVien().contains(sinhVien)){
            SinhVien.add(sinhVien);
        }

    }

    public void upDateSinhVien(String oldSinhVien,String newSinhVien){
        if (SinhVien.contains(oldSinhVien)){
            int i = SinhVien.indexOf(oldSinhVien);
            SinhVien.add(i,newSinhVien);
        }
    }





}
