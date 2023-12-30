package Test;
//app07 برنامه ای بنویسید که ده تا عدد گرفته بشه  و هرکدوم در یک خانه از آرایه قرار بگیرد و maximum and minmum را نمایش دهد

import java.util.Scanner;
public class App {
    static int[] array = new int[10];
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      show();
    }
    public  static  void  show(){
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter your " + i + " number: ");
                array[i] = scanner.nextInt();// get number from user and put into index
            }
            maximum();
            minimum();

        } catch (Exception exception) {
            System.err.println("Tryagain :)");
            scanner.next();
            show();
        }

    }

    public static void maximum() {

            int max = array[0];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index = i;
                }
            }
            System.out.println("maximum number: " + max + " index " + index);
    }

    public static void minimum() {

            int min = array[0];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            System.out.println("Minimum number: " + min + " index " + index);
    }
}
