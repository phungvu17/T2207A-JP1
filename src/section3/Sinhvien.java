//package section3;
//
//public class Student {
//    private String Name ;
//    private String Birth ;
//    private String Address ;
//    private String NameClass ;
//    private String Medium_score;
//
//  public Student (String Name ,String Birth,String Address ,String nameClass,String medium_score){
//      this.Name = Name;
//      this.Birth = Birth;
//      this.Address = Address;
//      this.NameClass = nameClass;
//      this.Medium_score = medium_score;
//  }
//
//    public String getName() {
//        return Name;
//    }
//
//    public String getBirth() {
//        return Birth;
//    }
//
//    public String getAddress() {
//        return Address;
//    }
//
//    public String getNameClass() {
//        return NameClass;
//    }
//
//    public String getMedium_score() {
//        return Medium_score;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public void setBirth(String birth) {
//        Birth = birth;
//    }
//
//    public void setAddress(String address) {
//        Address = address;
//    }
//
//    public void setNameClass(String nameClass) {
//        NameClass = nameClass;
//    }
//
//    public void setMedium_score(String medium_score) {
//        Medium_score = medium_score;
//    }
//}
package section3;

import java.util.Scanner;

public class Sinhvien {
    private String name;
    private int date;
    private String adress;
    private String classs;
    private int  medium;
    private String seploai;
    private int max;

    public int getMax() {
        Sinhvien[] a =new Sinhvien[3];

        for (int i=0;i<a.length;i++)

        {
            a[i] = new Sinhvien("HOANG",2004,"vp","t2207",9,"gioi");
            if (max < a[i].getMedium())
                max = a[i].getMedium();

        }
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Sinhvien(String name, int date, String adress, String classs, int medium, String seploai){
        this.name = name;
        this.date = date;
        this.adress =adress;
        this.classs = classs;
        this.medium = medium;
        this.seploai = seploai;
    }
    public int getMedium() {

        return medium;
    }

    //public void xapxep(){
//
//    for (int i=0;i< n;i++){
//        for (int j=i+1;j<cars.length;j++){
//            if (cars[i].getMedium()<cars[j].getMedium()){
//                Sinhvien tamp=new Sinhvien("HOANG",2004,"vp","t2207",9);
//                 tamp =cars[i];
//                cars[i]=cars[j];
//                cars[j]=tamp;
//
//            }
//        }
//    }
//}
    public void setMedium(int medium) {
        this.medium = medium;
    }

    public String getSeploai() {
        if (medium<=4){
            System.out.println("Y???U");
        } else if ( medium<=6.5) {
            System.out.println("TR??NG B??NH");
        } else if ( medium<=8) {
            System.out.println("KH??");
        } else {
            System.out.println("GI???I");
        }
        return seploai;
    }

    public void setSeploai(String seploai) {
        this.seploai = seploai;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("NH???P T??N SINH VI??N: ");
        name=sc.nextLine();
        System.out.println("NH???P N??M SINH SINH VI??N: ");
        date=sc.nextInt();
        sc.nextLine();
        System.out.println("NH???P N??I ??? SINH VI??N: ");
        adress=sc.nextLine();
        System.out.println("NH???P l???p SINH VI??N: ");

        classs=sc.nextLine();
        System.out.println("NH???P ??I???M TB SINH VI??N: ");
        medium=sc.nextInt();
    }
    public void hienthi(){
        if (medium<=4){
            System.out.println("H??? T??N: "+name+", N??m Sinh: "+date+", N??i ???: "+adress+", L???p H???c: "+classs+", ??i???m TB: "+medium+ ", X???p lo???i: Y???u ");
        } else if ( medium<=6.5) {
            System.out.println("H??? T??N: "+name+", N??m Sinh: "+date+", N??i ???: "+adress+", L???p H???c: "+classs+", ??i???m TB: "+medium+ ", X???p lo???i: Trung b??nh ");
        } else if ( medium<=8) {
            System.out.println("H??? T??N: "+name+", N??m Sinh: "+date+", N??i ???: "+adress+", L???p H???c: "+classs+", ??i???m TB: "+medium+ ", X???p lo???i: Kh?? ");
        } else {
            System.out.println("H??? T??N: "+name+", N??m Sinh: "+date+", N??i ???: "+adress+", L???p H???c: "+classs+", ??i???m TB: "+medium+ ", X???p lo???i: Gi???i ");
        }
//    System.out.println("H??? T??N: "+name+", N??m Sinh: "+date+", N??i ???: "+adress+", L???p H???c: "+classs+", ??i???m TB: "+medium+ ", X???p lo???i: "+seploai);
    }

    //    public int getSeploai() {
//        if (medium<=4){
//            System.out.println("yeu");
//        } else if (medium>=4 && medium<=6.5) {
//            System.out.println("trung binh");
//        } else if (medium>=6.5 && medium<=8) {
//            System.out.println("kha");
//        } else if (medium>=8 && medium<=10) {
//            System.out.println("gioi");
//        }
//        return seploai;
//    }
//
//    public void setSeploai(int seploai) {
//        this.seploai = seploai;
//    }
    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
