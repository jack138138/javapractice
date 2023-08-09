package iterationstatement;

public class ForloopDemo {


    public static void main(String[] args) {

        //   for (int i = 10; i >= 1; i--) {
        //      System.out.println(i); //10,9....1

        //   }


        //  }
        for (int i = 1; i <= 10; i++) {
            if (i!= 5 && i!= 7) {
                System.out.println(i);
            }else {
                System.out.println("This is not required number");
            }
        }

    }
}