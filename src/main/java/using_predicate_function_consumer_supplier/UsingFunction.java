package using_predicate_function_consumer_supplier;

import java.util.function.Function;

public class UsingFunction {
    public static void main(String[] args) {
        Function<String,String> function = String::toUpperCase;

        System.out.println("Chuyển chữ thường thành chữ hoa: "+function.apply("nguyễn Tuấn anh"));
    }
}
