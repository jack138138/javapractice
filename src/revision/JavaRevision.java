package revision;

import java.util.ArrayList;

public class JavaRevision {
    String name;
    int value;

    public JavaRevision() {


    }

    public JavaRevision(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public String getName(){
    return name;
    }

    public static void main(String[] args) {
        JavaRevision javaRevision = new JavaRevision();
        javaRevision.printName();
        JavaRevision obj1 = new JavaRevision("Prime",102);
        obj1.printName();
        JavaRevision obj2 = new JavaRevision("Testing", 103);
        String name = obj2.getName();
        System.out.println(name);
    }

    public JavaRevision getInstance(){
        JavaRevision javaRevision = new JavaRevision();
        return javaRevision;

    }
    public ArrayList<String> getList(){
        ArrayList<String>list =new ArrayList<>();
        return list;
    }

}


