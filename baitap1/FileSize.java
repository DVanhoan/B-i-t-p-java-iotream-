package baitap1;

import java.io.File;
import java.util.Scanner;

public class FileSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap duong dan cua file: ");

        String fString = scanner.nextLine();

        File file = new File(fString);

        if (file.exists()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = (double) fileSizeInBytes / 1024; 
            double fileSizeInMB = fileSizeInKB / 1024;

            System.out.println("Kich thuoc cua tep tin la:");
            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + fileSizeInKB);
            System.out.println("MB: " + fileSizeInMB);
        } else {
            System.out.println("Tep tin nay khong ton tai hoac duong dan ko dung.");
        }

        scanner.close();
    }
}