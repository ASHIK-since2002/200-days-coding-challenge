//In a program, input 3 numbers :x ,y,z . you have to output the average of these three numbers
import java.util.Scanner;
    public class PlmOne{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Give values :");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int avg = (x + y + z) / 3;
            System.out.print("The average of three numbers are:" + avg);
            System.out.print("Thank you");


            }
        }
