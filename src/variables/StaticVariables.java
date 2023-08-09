package variables;

public class StaticVariables {
    /**
     * Scope - within the class
     * Memory allocation - when class is loaded
     */

    static int a = 10; //a is a static variables or global

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariables.a);
    }



    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariables.a);



    }
}
