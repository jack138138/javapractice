package methodtypes;

public class WithReturnTypeWithNoParameters {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a); //10
        int answer = addition();
        System.out.println(answer);//50
        System.out.println(addition());//50
        System.out.println(isRight()); //false
    }
//with return type and no parameters
    public static int addition(){
        int a = 20;
        int b= 30;
        int ans = a + b;
        return ans;

    }

    public static boolean isRight(){

        boolean a = true;
        boolean b = false;
        return b;

    }



}
