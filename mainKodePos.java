import java.util.Scanner;
public class mainKodePos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama kelurahan : ");
        String kl = input.nextLine();
        System.out.println(KodePos.getKodePos(kl));
        input.close();
    }
}
