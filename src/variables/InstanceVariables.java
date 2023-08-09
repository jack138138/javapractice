package variables;

public class InstanceVariables {
    // Instance with Object
    /**
     * Scope- within the class
     * Memory allocation - when object is created
     * memory - stored in heap
     */
    int a = 10; // a is a instance or global variable
    String name = "Prime Testing";

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);

    }

    public void myMethod(){
        //InstanceVariables t = new InstanceVariable
InstanceVariables t = new InstanceVariables();
        System.out.println(t.a);
    }

}
