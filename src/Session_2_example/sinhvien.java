package Session_2_example;

import java.util.Scanner;

public class sinhvien {
    public String name;
    public String code;
    public double medium;
    public int age;
    public String clas;

    public void inputInfo(){
        System.out.println("Nhap ten sinh vien:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Nhap tuoi sinh vien:");
        age = scanner.nextInt();

        System.out.println("Nhap lop:");
        clas = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Nhap ma:");
        code = scanner.nextLine();

        System.out.println("Nhap diem trung binh:");
        medium = scanner.nextDouble();
    }

    public void outputInfo() {
        System.out.println("Thong tin sinh vien");
        System.out.println(name + " - tuoi " + age);
        System.out.println("lop " + clas);
        System.out.println("ma sinh vien" + code);
        System.out.println("diem trung binh " + medium);
    }
    public  void Diem() {
            if (medium < 8.0) {
                System.out.println("Ban khong du tieu chuan de nhan hoc bong");
            }
            else{
                System.out.println("Ban du tieu chuan de nhan hoc bong");
            }

    }
}
