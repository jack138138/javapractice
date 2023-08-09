package methodtypes;

public class NoReturnWithParameters {
    public static void main(String[] args) {
        NoReturnWithParameters obj = new NoReturnWithParameters();
        obj.addition(10, 20); //30
        obj.addition(5, 6); //11
        courseName("Java");
        courseName("Selenium");

    }

    //No return type - void
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }

    public static void courseName(String course) {
        System.out.println(course);


    }


}
