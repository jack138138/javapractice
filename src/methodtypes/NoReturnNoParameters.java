package methodtypes;

public class NoReturnNoParameters {

    public static void main(String[] args) {
        addition();
    NoReturnNoParameters obj = new NoReturnNoParameters();
    obj.subtraction();
    obj.multiplication();
    //NoReturnNoParameters.calculation();
        calculation();

    }

    //No return type(void) no params
    public static void addition(){
        int a = 5;
        int b = 10;
        int ans = a + b;
        //Concatenation
        System.out.println("Addition of two number is : " + ans);
        System.out.println("Addition of two numbers "+ a + "and" + b+" is :" + ans);
    }

public void subtraction(){
    int a = 5;
    int b = 10;
    int ans = b-a;
    System.out.println("Subtraction of two number is : "+ans);
}

public void multiplication(){
    System.out.println("This is multiplication method");
}

public static void calculation(){
    System.out.println("Calculation method");
}
}
