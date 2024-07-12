package Exercise;

import java.util.Scanner;
class Ex1_PercentageFinder {
    public static void main(String[] args) {
        System.out.println("Input marks of the given subjects:-");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Maths marks:");
            int maths = sc.nextInt();
            System.out.print("Enter English marks:");
            int eng = sc.nextInt();
            System.out.print("Enter Hindi marks:");
            int hindi = sc.nextInt();
            System.out.print("Enter Science marks:");
            int sci = sc.nextInt();
            System.out.print("Enter Social Science marks:");
            int ssc = sc.nextInt();
            int total=0;
            total = maths+eng+hindi+sci+ssc;
            int percentage = total/5;
            System.out.print("The percentage of the student is: " + percentage + "%");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}