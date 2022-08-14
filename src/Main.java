import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: "); String name = scanner.nextLine();
        System.out.print("Lớp: "); String study = scanner.nextLine();
        System.out.print("Tuổi: "); int age = scanner.nextInt();
        System.out.print("Quê quán: "); String home = scanner.nextLine();

    }
}
