import java.util.Scanner;
public class Min_number implements Info{
    int a;
    int b;
    int c;

    public Min_number() {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        a = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        b = scanner.nextInt();
        System.out.println("Введіть трєтє число: ");
        c = scanner.nextInt();
    }

     int solution() {
        if (a < b && a < c) {
            System.out.printf("Мінімальне число: %d",a);
            return a;
        }
        if (b < c && b < c) {
            System.out.printf("Мінімальне число: %d",b);
            return b;
        }
        if (c < b && c < a) {
            System.out.printf("Мінімальне число: %d",c);
            return c;
        }
        return 0;
    }
    @Override
    public void showInfo() {
        solution();
        System.out.println("\n-----------------------------------------------------------\n");
    }
}
