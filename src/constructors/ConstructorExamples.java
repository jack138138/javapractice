package constructors;

public class ConstructorExamples {
    int empID; //10
    String empName;


    public ConstructorExamples(int empID, String empName){
      this.empID   = empID;
       this.empName = empName;

    }
    public static void main(String[] args){

        ConstructorExamples obj = new ConstructorExamples(10,"Jaydeep");
        obj.demo();
        ConstructorExamples obj1 = new ConstructorExamples(100,"Neeraj");
        obj1.demo();

    }
    public void demo() {
        System.out.println(empID);
        System.out.println(empName);


    }
}

