package demo_static_method;

public interface CreateStaticMethodInteface {
    //Phương thức static không được override trong các lớp thực thi giao diện này
    static int multiply(int a, int b){
        return a * b;
    }
}
