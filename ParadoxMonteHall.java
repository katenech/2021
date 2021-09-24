public class ParadoxMonteHall {

    public static void main(String[] args) {

        System.out.println("Введите количество экспериментов:");
        int n = StdIn.readInt();

        //три двери
        int choise = 0;
        int prize = 0;
        int open = 0;

        //вспомогательные счетчики
        int j = 0;
        int temp = 0;

        //вероятности и победы для каждой из 2-х стратегий
        int p1 = 0;
        int win1 = 0;
        int p2 = 0;
        int win2 = 0;

        //1. серия игр без изменения решения о выборе двери
        for (int i=0; i<n; i++){
            prize = StdRandom.uniform(1,4);
            choise = StdRandom.uniform(1,4);

            if(choise==prize)
                win1++;
        }
        System.out.println("Вероятность победы при стратегии без изменения выбора двери:" + (double)win1/n);

        //2. серия игр с изменением решения о выборе двери
        for (int i=0; i<n; i++){
            prize = StdRandom.uniform(1,4);
            choise = StdRandom.uniform(1,4);

            //ведущий открывает одну из 2-х дверей БЕЗ приза
            j=0;
            do {
                j++;
                open = j;
            }
            while(open!=prize && open!=choise);

            //игрок меняет свой выбор
            j=0;
            temp = choise;
            do {
                j++;
                choise = j;
            }
            while(choise!=open && choise!=temp);

            if(choise==prize)
                win2++;
        }
        System.out.println("Вероятность победы при стратегии с изменением выбора двери:" + (double)win2/n);
    }
}
