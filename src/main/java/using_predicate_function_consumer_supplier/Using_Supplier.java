package using_predicate_function_consumer_supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

public class Using_Supplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            return dtf.format(now);
        };

        System.out.println("Ngày hiện tại: "+supplier.get());
    }
}
