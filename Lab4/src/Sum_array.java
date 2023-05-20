import java.util.Random;
import java.util.Scanner;

public class Sum_array {
    int n;
    int temp;
    int sum;
    public Sum_array() {
        this.n = n;
        this.temp=temp;
        this.sum = sum;
    }
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву: ");
        n = scanner.nextInt();
    }
    void solution(){
        int arr[]=new int[n];
        Random ran=new Random();
        int i=0;
        while(true){
            if(i==n){
                break;
            }
            temp = ran.nextInt(100);
            arr[i]=temp;
            i++;
        }
        System.out.print("\narr[]={");
        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1){
                System.out.print(arr[j]+",");
            }else {
                System.out.print(arr[j]);
            }
        }
        System.out.println("}\n");
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
        }
        System.out.printf("Summa = %d\n",sum);
    }
}