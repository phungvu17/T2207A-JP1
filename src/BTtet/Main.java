package BTtet;

import section3.Sinhvien;

public class Main {
    public static void main(String[]args){
        SinhVien sv = new SinhVien("123","Phung Van Vu","0962717404","Phu Xuyen",9);
        SinhVien [] sinhvien = new SinhVien[3];
        for (int i=0;i<sinhvien.length;i++ ){
            sinhvien[i] = new SinhVien("123","Phung Van Vu","0962717404","Phu Xuyen",9);
            sinhvien[i].nhapThongTin();



        }
        System.out.println("Danh Sach Sinh Vien : ");
        for (int i=0 ; i<sinhvien.length;i++){
            sinhvien[i].inThongTin();
        }
    }



}
