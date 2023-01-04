package BTVN;

public class Main {
    public static void main(String[] args) {
        Phanso tinh = new Phanso();
        Phanso tinh1 = new Phanso();
        Phanso psTong = new Phanso();
        Phanso psTru = new Phanso();
        Phanso psNhan = new Phanso();
        Phanso psChia = new Phanso();
        tinh.nhap();
        tinh1.nhap();
        System.out.println("Tổng 2 phân số là: ");
        psTong = tinh.cong(tinh1);
        psTong.hienthi();
        System.out.println("Trừ 2 phân số là: ");
        psTru = tinh.tru(tinh1);
        psTru.hienthi();
        System.out.println("Nhân 2 phân số là: ");
        psNhan = tinh.nhan(tinh1);

        psNhan.hienthi();
        System.out.println("Chia 2 phân số là: ");
        psChia = tinh.chia(tinh1);
        psChia.hienthi();
        System.out.println("Phân số vừa nhập là: ");
        tinh.hienthi();
        System.out.println("kết quả rút gọn phân số là: ");
        Phanso kq = tinh.rutgon();
        kq.hienthi();
        System.out.println("Phân số sau khi nghịch đảo là: ");
        tinh.ngichdao();
        tinh.hienthi();


//        Phanso kq1=tinh.cong(tinh1);
//        System.out.println("kết quả tính tổng 2 phân số: ");
//        System.out.println("hhh"+kq1.tuso);
//        System.out.println("hhh"+kq1.mauso);
//        kq1.hienthi()
//        tinh1.nhap();
//        psTong = tinh.cong(tinh1);
//        psTong.hienthi();
}
}

