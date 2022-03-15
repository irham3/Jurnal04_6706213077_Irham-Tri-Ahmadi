import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Player> listLagu = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nPilihlah Menu:");
            System.out.println("1. Input Lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Mainkan Lagu");
            System.out.println("4. Keluar");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nMasukkan judul lagu & nama penyanyi");
                    String judulLagu = input.next();
                    String namaPenyanyi = input.next();
                    listLagu.add(new Player(judulLagu, namaPenyanyi));
                    break;
                case 2:
                    System.out.println("\nHapus lagu di list terakhir? (y/n)");
                    if (input.next().equalsIgnoreCase("y"))
                        listLagu.removeLast();
                    else {
                        ListIterator<Player> iter1 = listLagu.listIterator();
                        System.out.println("\nMasukkan judul lagu yang ingin dihapus:");
                        String hapusLagu = input.next();
                        while (iter1.hasNext()) {
                            Player player1 = iter1.next();
                            if (player1.getJudulLagu().equals(hapusLagu))
                                iter1.remove();
                        }
                    }
                    break;
                case 3:
                    ListIterator<Player> iter2 = listLagu.listIterator();
                    System.out.println("\nLagu diputar maju");
                    while (iter2.hasNext()) {
                        System.out.println(iter2.next());
                    }
                    System.out.println("\nLagu diputar mundur");
                    while (iter2.hasPrevious()) {
                        System.out.println(iter2.previous());
                    }
                    break;
                default:
                    break;
            }
        } while (pilihan != 4);

        input.close();
    }
}
