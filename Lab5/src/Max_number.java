import java.util.Random;
import java.util.Scanner;

public class Max_number implements Info{
    int temp;
    int n;
    int max;

    public Max_number() {
        this.temp = temp;
        this.n = n;
        this.max = max;
    }
    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву: ");
        n = scanner.nextInt();
    }

    int solution(){
        int arr[]=new int[n];
        Random ran=new Random();
        int i=0;
        max=0;
        while(true) {
            if (i == n) {
                break;
            }
            temp = ran.nextInt(100);
            arr[i] = temp;
            i++;
        }
        System.out.print("arr[]={");
        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1){
                System.out.print(arr[j]+",");
            }else {
                System.out.print(arr[j]);
            }
            if(max<arr[j]){
                max=arr[j];
            }
        }
        System.out.println("}\n");
        return max;
    }
    @Override
    public void showInfo() {
        System.out.printf("Максимальне число масиву: %d",solution());
        System.out.println("\n-----------------------------------------------------------\n");
    }
}
