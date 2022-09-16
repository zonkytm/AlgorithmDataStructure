package HowMany;
import java.util.ArrayList;
import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println(in.nextLine().split("\\s+").length);
        in.close();
    }
}
