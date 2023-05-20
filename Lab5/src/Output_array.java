import java.util.Random;
import java.util.Scanner;

public class Output_array implements Info,Copyable{
    int temp;
    int n;

    public Output_array() {
        this.temp = temp;
        this.n = n;
    }

    @Override
    public void input(){
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
        System.out.print("arr[]={");
        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1){
                System.out.print(arr[j]+",");
            }else {
                System.out.print(arr[j]);
            }
        }
        System.out.println("}\n");
    }
    @Override
    public void showInfo(){
        solution();
        System.out.println("\n-----------------------------------------------------------\n");
    }

    @Override
    public Object copy() {
        Output_array copy= new Output_array();
        return copy;
    }
}
