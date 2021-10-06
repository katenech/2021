import java.util.Scanner;

public class NTO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();

        double s1 = 0.08*p;
        if(s1>100)
            s1=100;

        double s2 = 0.05*p;

        System.out.println(Math.max(s1,s2));

    }
}
