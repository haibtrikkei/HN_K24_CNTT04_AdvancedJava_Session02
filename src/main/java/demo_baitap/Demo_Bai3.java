package demo_baitap;

import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class Demo_Bai3 {
    public static void main(String[] args) {
        System.out.println("Mã hoá dữ liệu: ");
        System.out.println("Nhập vào dữ liệu cần mã hoá: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println("Mật khẩu mã hoá: "+Authenticatable.encrypt(password));
    }
}

@FunctionalInterface
interface Authenticatable{
    String getPassword();

    default boolean isAuthenticated(String password){
        return !password.isBlank();
    }

    static String encrypt(String rawPassword){
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt(12));
    }
}