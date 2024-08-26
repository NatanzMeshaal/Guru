import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        //String-->int-->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println("NIP : ");
        int nip = input.nextInt();
        input.close();
        System.out.println("==================");

        Guru baru = new Guru(nip, nama, mapel, status);
        baru.print();
        Guru Imam = new Guru(1423, "Imam", "PAI", "Full-Time");
        Guru Agus = new Guru(1265, "Agus", "Bahasa Jawa", "Part-Time");
        Guru Dewi = new Guru(2987, "Dewi", "Bahasa Inggris", "Full-Time");
        Guru Ulum = new Guru(4143, "Ulum", "IPA", "Tetap");
        Guru Shinta = new Guru(8902, "Shinta", "Seni Budaya", "Part-Time");

        System.out.println("==================");
        Imam.print();
        System.out.println("==================");
        Agus.print();
        System.out.println("==================");
        Dewi.print();
        System.out.println("==================");
        Ulum.print();
        System.out.println("==================");
        Shinta.print();
        System.out.println("==================");
    }
}
