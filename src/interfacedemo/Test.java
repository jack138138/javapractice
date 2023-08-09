package interfacedemo;

public class Test implements InterfaceDemo, InterfaceDemo1  {
    @Override
    public void m1() {
        System.out.println("M2 method");

    }

    @Override
    public void m2() {
        System.out.println("M2 method");

    }
    public void m3() {
        System.out.println("M3 method");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m2();
        test.m3();
    }
}
