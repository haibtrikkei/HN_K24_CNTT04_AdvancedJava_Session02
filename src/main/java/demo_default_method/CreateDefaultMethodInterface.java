package demo_default_method;

public interface CreateDefaultMethodInterface {
    int sum(int a, int b);

    //Phương thức mặc định: Có thể override trong các lớp thực thi
    default int substract(int a, int b){
        return a - b;
    }

    default int multiply(int a, int b){
        return a * b;
    }

    default float divide(int a, int b){
        return (float)a / b;
    }
}
