package section5;

public class Main {
    public static void main (String[]args){
//        Animal a = new Animal();
//        a.color = "red";
//        a.eat();
//
//
//        Tiger t = new Tiger();
//        t.color= "blue";
//        t.eat();
//        t.run();
//        t.eatMeat();
//        t.eatMeat("hello");
//        t.eatMeat("abcxyz",15);
//
//        Cat c = new Cat();
//        c.run();


        System.out.println("Danh sách KH Việt Nam: ");
        Vietnam vn= new Vietnam("t2201a","hà hoàng","1/1/2023","sinh viên",20);
        vn.hienthi();
        System.out.println("TIEN DIEN: "+vn.tiendien(vn.getSoluong()));
        Vietnam vn1= new Vietnam("t2202a","phùng vũ","2/1/2023","sinh viên",203);
        vn1.hienthi();
        System.out.println("TIEN DIEN: "+vn1.tiendien(vn1.getSoluong()));
        Vietnam vn2= new Vietnam("t2203a","mạnh sơn","3/1/2023","sinh viên",50);
        vn2.hienthi();
        System.out.println("TIEN DIEN: "+vn2.tiendien(vn2.getSoluong()));
        Vietnam vn3= new Vietnam("t2204a","Cường gà","4/1/2023","sinh viên",61);
        vn3.hienthi();
        System.out.println("TIEN DIEN: "+vn3.tiendien(vn3.getSoluong()));


        System.out.println("Danh sách KH Nước NGoài: ");
        Nuocngoai nn= new Nuocngoai("MH370","Cristiano Ronaldo dos Santos Aveiro","1/1/2023","Portugal",2000);
        Nuocngoai nn1= new Nuocngoai("MH371","Lionel Andrés Messi","2/1/2023","Argentina",4000);
        Nuocngoai nn2= new Nuocngoai("MH372","Neymar da Silva Santos Júnior","3/1/2023","Brazil",9000);
        nn.hienthi();
        System.out.println("Tiền điện của: "+nn.getName()+" là: "+nn.tiendien());
        nn1.hienthi();
        System.out.println("Tiền điện của: "+nn1.getName()+" là: "+nn1.tiendien());
        nn2.hienthi();
        System.out.println("Tiền điện của: "+nn2.getName()+" là: "+nn2.tiendien());

    }
}
