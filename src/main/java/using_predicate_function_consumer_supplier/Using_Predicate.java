package using_predicate_function_consumer_supplier;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Using_Predicate {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isBlank;

        String name;
        System.out.println("Nhập vào họ tên của bạn: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        if (predicate.test(name)) {
            System.out.println("Bạn chưa nhập họ tên");
        } else {
            System.out.println("Chào bạn: " + name);
        }

        //Sử dụng Predicate để validate email
        //1. Chưa nhập dl, 2. Email không đúng định dạng
        Predicate<String> validEmail = email -> {
            if(email.isBlank())
                return false;
            Pattern p = Pattern.compile("^[a-zA-Z][._\\w*]*@\\w{3,}.\\w{2,5}(.\\w{2,5})?$");
            Matcher m = p.matcher(email);
            if(!m.find()){
                return false;
            }
            return true;
        };

        System.out.println("Nhập vào email cần kiểm tra: ");
        String email = sc.nextLine();
        if(!validEmail.test(email)){
            System.out.println("Email chưa nhập hoặc không đúng định dạng");
        }else{
            System.out.println("Email đúng định dạng: "+email);
        }
    }
}
