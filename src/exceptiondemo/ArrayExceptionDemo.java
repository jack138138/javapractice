package exceptiondemo;

public class ArrayExceptionDemo {

    public static void main(String[] args) {


        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        try {
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Prime");
    }
}