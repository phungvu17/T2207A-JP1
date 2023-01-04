package BTVN;

import java.sql.Struct;
import java.util.Scanner;

public class Phanso {
    int tuso ;
    int mauso;
    public Phanso(){
        tuso =0;
        mauso =1;
    }
    public Phanso(int ts,int ms){
        tuso =ts;
        mauso =ms;
    }
    public Phanso (Phanso p){
        tuso =p.tuso;
        mauso= p.mauso;
    }
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập tử số : ");
        tuso = sc.nextInt();
        do {
            System.out.println("Hãy nhập mẫu số : ");
            mauso = sc.nextInt();
        }while (mauso == 0);

    }
    public void hienthi(){
        if (tuso==0){
            System.out.println("  0");
        }else if (mauso==1){
            System.out.println(tuso);
        } else if (tuso<0 && mauso<0){

            System.out.println(tuso*-1+"/"+mauso*-1);
        }else

        {
            System.out.println(tuso+"/"+mauso);
        }
    }

    //        public  int ucln () {
//            if (tuso < 0) {
//                tuso = tuso * -1;
//            }
//            if (mauso < 0) {
//                mauso = mauso * -1;
//            }
//            while (tuso != mauso) {
//                if (tuso > mauso) {
//                    tuso -= mauso;
//                } else {
//                    mauso -= tuso;
//                }
//            }
//
//            return tuso;
//        }
    private int UCLN1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    //public int UCLN(){
//    if (tuso<0){
//        tuso=tuso*-1;
//    }
//    if (mauso<0){
//        mauso=mauso*-1;
//    }
//    while (tuso!=mauso){
//        if (tuso>mauso){
//            tuso-=mauso;
//        }else {
//            mauso-=tuso;
//        }
//    }
//    return tuso;
//}
    public Phanso rutgon(){
        Phanso kq =new Phanso();
        int x= UCLN1(tuso,mauso);
        if (tuso<0){
            tuso=tuso*-1;
        }
        if (mauso<0){
            mauso=mauso*-1;
        }
        kq.tuso =tuso/x;
        kq.mauso = mauso/x;
        return kq;
    }
    public void ngichdao(){
        int tam=tuso;
        tuso=mauso;
        mauso=tam;
    }
    public Phanso cong(Phanso p){
//        Phanso kq1= new Phanso();
//        kq1.tuso=((tuso*tinh1.mauso) + (mauso*tinh1.tuso));
//        kq1.mauso= (mauso*tinh1.mauso);
        int a = ((tuso*p.mauso) + (mauso*p.tuso));
        int b =(mauso*p.mauso);
        return new Phanso(a,b);
    }
    public Phanso tru(Phanso p){
        int c = ((tuso*p.mauso) - (mauso*p.tuso));
        int d =(mauso*p.mauso);
        return new Phanso(c,d);
    }
    public Phanso nhan(Phanso p){
        int c = tuso*p.tuso;
        int d =(mauso*p.mauso);
        return new Phanso(c,d);
    }
    public Phanso chia(Phanso p){
        int c = tuso*p.mauso;
        int d =(mauso*p.tuso);
        return new Phanso(c,d);
    }
//    public Phanso(){
//       do {
//
//
//           Scanner sc = new Scanner(System.in);
//
//           System.out.println("Hãy nhập tử số : ");
//           ts = sc.nextInt();
//           System.out.println("Hãy nhập mẫu số : ");
//           ms = sc.nextInt();
//       }while (kiemtra());
//    }
//    public  boolean kiemtra(){
//       return ms==0;
//    }
//    public int UCLN(){
//        if (tuso<0){
//            tuso=tuso*-1;
//        }
//        if (mauso<0){
//            mauso=mauso*-1;
//        }
//        while (tuso!=mauso){
//            if (tuso>mauso){
//                tuso-=mauso;
//            }else {
//                mauso-=tuso;
//            }
//        }
//        return tuso;
//    }
//    public  int RUTGONts(){
//        if (ms!=0){
//          ts =ts/UCLN1(ts,ms);
//
//
//
//        }
//          return ts;
//
//    }
//    public  int RUTGONms(){
//        if (ms!=0){
//
//            ms=ms/UCLN1(ts,ms);
//
//
//        }
//        return ms;
//
//    }
//    private int UCLN1(int a, int b) {
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        return a;
//    }
}