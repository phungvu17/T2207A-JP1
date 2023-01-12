package section5;

public class Nuocngoai extends Vietnam {


    public Nuocngoai(){

    }

    public Nuocngoai(String maKH, String name, String date, String doituong, int soluong) {
        super(maKH, name, date, doituong, soluong);
    }
    public void hienthi() {
        System.out.println("mã KH: " + maKH + "; Họ tên KH: " + name + "; Ngày suất đơn: " + date + "; Quốc tịch: " + doituong + "; Số lượng: " + soluong);
    }
    public  int tiendien(){
        return (soluong*2000);
    }

}