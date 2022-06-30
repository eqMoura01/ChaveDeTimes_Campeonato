import java.util.Scanner;

public class App {
    // Descrição no README.md
    public static void main(String[] args) throws Exception {
        int i, j, qTimes;
        String[] time = new String[10];
        Scanner s = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("BEM VINDO AO CAMPEONATO ZÉ RUELAS LEAGUE");
        System.out.println("----------------------------------------");

        System.out.println("\nQuantos times irão participar? Maximo de 10 times.");
        qTimes = Integer.parseInt(s.nextLine());

        for (i = 0; i < qTimes; i++) {
            System.out.println("\nDigite o nome do " + (i + 1) + "º time");
            time[i] = s.nextLine().toUpperCase();
        }

        for (i = 0; i < qTimes; i++) {
            for (j = 0; j < qTimes; j++) {
                if (time[i] != time[j]) {
                    System.out.println(time[i] + " X " + time[j]);
                }
            }
        }

    }
}
