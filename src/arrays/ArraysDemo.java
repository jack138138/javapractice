package arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        //Array declaration
        int a[];
        int[] b;
        String StudentsName[];


        //Approch 1
        int x[] = {10, 20, 30, 40, 50,};
        System.out.println(x[1]);
        System.out.println(x[4]);

//Difference between length() and length
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }

        //Approch 2
        int z [] = new int[5];
        z[0]= 11;
        z[1]= 12;
        z[2]= 13;
        z[3]= 14;
        z[4]= 15;


        System.out.println(z[2]);

        String names[]= {"Java", "C++","Paythone"};
        System.out.println(names[1]);
    }
}
