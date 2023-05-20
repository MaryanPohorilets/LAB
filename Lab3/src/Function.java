import java.util.Scanner;
public class Function implements Info {
    double step = 0.1;
    int countInRange = 0;
    double left;
    double right;
    double y;

    Function() {
        this.left = left;
        this.right = right;
        this.y = y;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ліву межу діапазону: ");
        left = scanner.nextDouble();
        System.out.print("Введіть праву межу діапазону: ");
        right = scanner.nextDouble();
    }
    void solution(String str, double left, double right){
        if(str=="while"){
            while (left < right+step) {
                y = 0.1*Math.pow(left,2)-left*Math.cos(left);
                System.out.printf("f(%.1f) = %.4f\n", left, y);
                if (y <= right || y >= left) {
                    countInRange++;
                }
                left += step;
            }
        }
        if(str=="for"){
            for (;left < right+step; left += step) {
                y = 0.1*Math.pow(left,2)-left*Math.cos(left);
                System.out.printf("f(%.1f) = %.4f\n", left, y);
                if (y <= right || y >= left) {
                    countInRange++;
                }
            }
        }
    }
    void countInRange(){
        if (countInRange == 0) {
            System.out.println("Немає значень функції в заданому діапазоні.");
        } else {
            System.out.printf("Кількість значень функції в заданому діапазоні: %d\n", countInRange);
            countInRange=0;
        }
    }

    @Override
    public void showInfo(){
        solution("while",left,right);
        countInRange();
        System.out.println("\n");
        solution("for",left,right);
        countInRange();
    }
}