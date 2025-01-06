import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        String username;
        int Age;
        long Phno;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Plz enter ur username");
            username = sc.nextLine();
            System.out.println("Plz enter ur Age");
            Age = sc.nextInt();
            System.out.println("Plz enter ur Phno");
            Phno = sc.nextLong();
        }
        System.out.println("hello "+username +"ur Age is "+ Age+ "ur Phno is "+ Phno);

     }
}
