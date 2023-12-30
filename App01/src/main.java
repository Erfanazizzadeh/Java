import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Write a program that takes a multi-digit number and prints it with three spaces between its two digits.
public class main {
    private static Scanner scan = new Scanner(System.in);;
    public static void main(String[] args) {
    //    ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.println("Enter your number : ");
        int getnumber  = scan.nextInt();

       String [] str =  String.valueOf(getnumber).split("");
       List al = Arrays.asList(str);
//        arraylist.add(al.size());

        String separator = "   ";
        for (int i=0; i< al.size();i++ ){
           String end = al.get(i)+separator;
            System.out.print( end);
        }
    }
}
