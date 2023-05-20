import java.util.Random;
public class Fill_array {
    int n;
    int temp;
    public Fill_array(int n) {
        this.n = n;
        this.temp=temp;
    }
    void solution(String str){
        if(str=="steamy"){
            int arr[]=new int[n];
            Random ran=new Random();
            int i=0;
            while(true){
                if(i==n){
                    break;
                }
                temp = ran.nextInt(100);
                if(temp % 2 == 0) {
                    arr[i]=temp;
                    i++;
                }
            }
            System.out.print("arr1[]={");
            for (int j=0;j<arr.length;j++){
                if(j<arr.length-1){
                    System.out.print(arr[j]+",");
                }else {
                    System.out.print(arr[j]);
                }
            }
            System.out.println("}\n");
        }
        if(str=="odd"){
            int arr[]=new int[n];
            Random ran=new Random();
            int i=0;
            while(true){
                if(i==n){
                    break;
                }
                temp = ran.nextInt(100);
                if(temp % 2 != 0) {
                    arr[i]=temp;
                    i++;
                }
            }
            System.out.print("arr2[]={");
            for (int j=0;j<arr.length;j++){
                if(j<arr.length-1){
                    System.out.print(arr[j]+",");
                }else {
                    System.out.print(arr[j]);
                }
            }
            System.out.println("}\n");
        }
    }
}