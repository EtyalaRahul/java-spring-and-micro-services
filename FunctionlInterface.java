
@FunctionalInterface
interface A {
    void show();

}
class B implements A {
    public void show() {
        System.out.println("In show method");
    }
}

public class FunctionlInterface {
public static void main(String[] args) {
    A a=new B();
    a.show();
}
}
