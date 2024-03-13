package baitap2;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap duong dan cua file");
        String fString = sc.nextLine();

        File file = new File(fString);

        if (file.exists()) {
            file.delete();
            System.out.println("xoa file hoac folder thanh cong");
        }else{
            System.out.println("khong ton tai file hoac foder co duong dan" + fString);
        }

    }
}
