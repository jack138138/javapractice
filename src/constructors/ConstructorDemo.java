package constructors;

public class ConstructorDemo {

    public ConstructorDemo(){
        System.out.println("Zero args constructors");
    }
     public ConstructorDemo(int a){
        System.out.println("One args constructors"+a);
    }


    public ConstructorDemo(String name){
        System.out.println("One args constructors"+name);
    }

    public ConstructorDemo(int a, int b){
        System.out.println("One args constructors"+(a+b));
    }

    //method
    public void addition(){
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        ConstructorDemo t = new ConstructorDemo();
        ConstructorDemo t1 = new ConstructorDemo(10);
        ConstructorDemo t2 = new ConstructorDemo("Jaydeep");
        ConstructorDemo t3 = new ConstructorDemo(3,4);
        t.addition();

    }

}
