package hwss0805;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] list = null;
        while(true){
            System.out.println("===== MENU SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Tìm sinh viên GPA cao nhất");
            System.out.println("4. In tổng số sinh viên đã tạo");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int t = Integer.parseInt(sc.nextLine());
            switch(t){
                case 1:
                    System.out.print("Nhập số lượng sinh viên cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    list = new Student[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập sinh viên thứ "+(i+1)+":");
                        list[i] = new Student();
                        list[i].input(sc);
                    }
                    break;
                case 2:
                    if (list == null || list.length == 0) System.out.println("Chưa có sinh viên nào!");
                    else {
                        for (int i = 0; i < list.length; i++) {
                            System.out.println("Sinh viên thứ " + (i+1) + ":");
                            list[i].print();
                        }
                    }
                    break;
                case 3:
                    if (list == null || list.length == 0) System.out.println("Chưa có sinh viên nào!");
                    else {
                        Student maxGPA = list[0];
                        for (int i = 1; i < list.length; i++) {
                            if (list[i].getGpa() > maxGPA.getGpa()) {
                                maxGPA = list[i];
                            }
                           }
                        System.out.println("Sinh viên có GPA cao nhất là bạn " + maxGPA.getName() + " với GPA = " + maxGPA.getGpa());
                    }
                    break;
                case 4:
                    System.out.println("Tổng số sinh viên được tạo = " + Student.getCountStudent());
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng yêu cầu trong danh sách trên!");
            }
        }
    }
}
