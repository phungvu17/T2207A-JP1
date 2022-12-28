package section1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Hello World");
        int x = 10;
        double y = 3.14;
        String s = " Hello";
        System.out.println(" x"+x);
        y = y + 20 *x ;

        if (y>100){
            System.out.println("y="+y);

        }else {
            System.out.println("x="+x);
        }

        for (int i=0;i<10;i++){
            System.out.println("i="+i);
        }
        //tinh S = 1 + 2 + 3 + ...+ 1000
        int S= 0 ;
        for (int i=1;i<1000;i++){
            S = S + i ;

        }
        System.out.println("S="+S);
        //tinh S = 1 + 1/2 + 1/3 + ...+ 1/1000
        double S2 = 0;
        for (int i = 1 ;i<1000;i++){
            S2 = S2 + (double) 1/i;
        }
        System.out.println("S2="+S2);


        int z = tinhTong(10,15);
        int f = tinhHieu(25,10);
        int g= tinhTich(5,6);
        int h = tinhThuong(10,2);
        System.out.println("z="+z);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
        boolean t = true;

        //nhap 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        int n = sc.nextInt();


        System.out.println("Nhap 1 so thuc:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap 1 string:");
        String str = sc.nextLine();
        System.out.println("n:"+n);
        System.out.println("d:"+d);
        System.out.println("str:"+str);



    }
    static int tinhTong(int a,int b){
        return  a+b;
    }
    static int tinhHieu(int a, int b){
        return  a-b;
    }
    static int tinhThuong(int a, int b){
        return  b==0?null:a/b;
    }
    static int tinhTich(int a, int b){
        return  a*b;
    }
}
