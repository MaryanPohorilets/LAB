import java.util.Random;
import java.util.Scanner;

public class Opposite {
    int n;
    int temp;
    public Opposite() {
        this.n = n;
        this.temp=temp;
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
        System.out.print("arr1[]={");
        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1){
                System.out.print(arr[j]+",");
            }else {
                System.out.print(arr[j]);
            }
        }
        System.out.println("}\n");
        for(int j=0;j<arr.length;j++){
            arr[j]=-arr[j];
        }
        System.out.print("arr2[]={");
        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1){
                System.out.print(arr[j]+",");
            }else {
                System.out.print(arr[j]);
            }
        }
        System.out.println("}");
    }
}
