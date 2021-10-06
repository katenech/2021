import java.util.Scanner;

public class NTO3 {
    //студенты
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String tek[] = new String[n-1];
        String pred[] = new String[n-1];
        String str[] = new String[2];

        String temp = sc.nextLine();//пипипипи

        //считываем
        for(int i=0; i<n-1; i++){
            str = sc.nextLine().split(" ");
            tek[i]=str[0];
            pred[i] = str[1];
        }

        // находим первый номер
        int number = -1;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(pred[i].equals(tek[j])) {
                    number=-1;
                    break;
                }
                else
                    number=i;
            }
            if(number!=-1)
                break;
        }

        //выводим по порядку
        System.out.println(pred[number]);
        for (int i = 0; i<n-1; i++){
            System.out.println(tek[number]);
            for(int j=0; j<n-1; j++){
                if(tek[number].equals(pred[j])){
                    number=j;
                    break;
                }
            }
        }
    }
}
