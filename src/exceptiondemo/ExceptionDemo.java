package exceptiondemo;

public class ExceptionDemo {

    public static void division() {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(" I a  in catch block");
        } finally {
            System.out.println("I am In finally block");
        }

            System.out.println("Hi");




        }
    public static void main (String[]args){
        division();
    }
}