package section5;

public class Vietnam {
    public String maKH;
    public String name;
    public String date;
    public String doituong;

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String quoctich;
    public int soluong;

    public Vietnam() {
    }

    public Vietnam(String maKH, String name, String date, String doituong, int soluong) {
        this.maKH = maKH;
        this.name = name;
        this.date = date;
        this.doituong = doituong;
        this.soluong = soluong;
    }
    //    public void nhap(){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Nhập mã KH:");
//        maKH =sc.nextLine();
//        System.out.println("Nhập Họ Tên KH:");
//        name =sc.nextLine();
//        System.out.println("Nhập ngày suất đơn:");
//        date=sc.nextLine();
//        System.out.println("Nhập đối tượng:");
//        doituong=sc.nextLine();
//        System.out.println("Nhập số lượng:");
//        soluong=sc.nextLine();
//    }
    public void hienthi(){
        System.out.println("mã KH: "+maKH+"; Họ tên KH: "+name+"; Ngày suất đơn: "+date+"; Đối tượng: "+doituong+"; Số lượng: "+soluong);
    }
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public  int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public int tiendien(int t){
        if (soluong<=50){
            t=soluong*1000;
        } else if (soluong>50 && soluong<100) {
            t=50*1000+(soluong-50)*1200;
        } else if (soluong>100 && soluong <200) {
            t=50*1000+50*1200+(soluong-100)*1500;
        } else {
            t=50*1000+50*1200+100*1500+(soluong-200)*2000;
        }
        return t;
    }

}