//In a programme input the side of a square.you have to output the area of the squre.
import java.util.Scanner;
public class PlmTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("give the value of side :");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);
    }
}
