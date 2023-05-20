import java.util.Scanner;

public class Rectangle implements Info{
    int a;
    int b;

    public Rectangle() {
        this.a = a;
        this.b = b;
    }
    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину прямокутника: ");
        a = scanner.nextInt();
        System.out.println("Введіть висоту прямокутника: ");
        b = scanner.nextInt();
    }

    @Override
    public void showInfo() {
        System.out.print("Площа прямокутника: "+solution());
        System.out.println("\n-----------------------------------------------------------\n");
    }

    int solution(){
        return a*b;
    }
}
