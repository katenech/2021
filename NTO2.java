import java.util.Scanner;

public class NTO2 {
    //многочлен умножение
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mk1[] = new int[n+2];
        int mk2[] = new int[n+2];

        for(int i=1; i<=n+1; i++){
         mk1[i] = sc.nextInt();
        }

        for(int i=0; i<=n; i++){
            mk2[i] = mk1[i+1];
        }

        for(int i=0; i<=n+1; i++){
            System.out.print(mk1[i]+mk2[i]+" ");
        }
    }
}
