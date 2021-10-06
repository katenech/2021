import java.util.Arrays;
import java.util.Scanner;

public class NTO4 {
    //четырехугольник
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[] = new int[5];

        for(int i = 0; i<5; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        //получится ли треугольник из 3 максимальных
        if(x[2]+x[3]>x[4]){
            //если получится, то к какой стороне можно прицепить еще 2 стороны
            if(x[0]+x[1]>x[2]) {
                System.out.println(x[2]);
                System.out.println(x[0]+" "+x[1]);
                System.out.println(x[3]+" "+x[4]);
            }
            else if(x[0]+x[1]>x[3]){
                System.out.println(x[3]);
                System.out.println(x[0]+" "+x[1]);
                System.out.println(x[2]+" "+x[4]);
            }
            else if(x[0]+x[1]>x[4]){
                System.out.println(x[4]);
                System.out.println(x[0]+" "+x[1]);
                System.out.println(x[2]+" "+x[3]);
            }
            else
                System.out.println(0);
        }

    }
}
