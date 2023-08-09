package variables;

public class VariableCalling {

    String name = "Prime"; //Instance
static int number = 100; //static variable
    public static void main(String[] args) {
        VariableCalling obj = new VariableCalling();
        ;
        System.out.println(obj.name);
        obj.m1();
        System.out.println(VariableCalling.number);
    }

    public void m1() {
        int a = 10; //local
        System.out.println(a);
        System.out.println(VariableCalling.number);
        System.out.println(number);

    }

}
