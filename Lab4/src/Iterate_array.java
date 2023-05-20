public class Iterate_array {
    int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
    void solution(String str){
        if(str=="while"){
            int i=0;
            System.out.print("arr1[]={");
            while(true){
                if(i==arr.length){
                    break;
                }
                if(i<arr.length-1){
                    System.out.print(arr[i]+",");
                }else {
                    System.out.print(arr[i]);
                }
                i++;
            }
            System.out.println("}\n");
        }
        if(str=="for"){
            System.out.print("arr2[]={");
            for(int i=0;i<arr.length;i++){
                if(i<arr.length-1){
                    System.out.print(arr[i]+",");
                }else {
                    System.out.print(arr[i]);
                }
            }
            System.out.println("}\n");
        }
        if(str=="while_odd"){
            int arr1[]=new int[arr.length/2];
            int i=0;
            int j=0;
            while(true) {
                if (i == arr.length) {
                    break;
                }
                if(i % 2 !=0 ){
                    arr1[j]=arr[i];
                    j++;
                }
                i++;
            }
            i=0;
            System.out.print("arr3[]={");
            while(true){
                if(i==arr1.length){
                    break;
                }
                if(i<arr1.length-1){
                    System.out.print(arr1[i]+",");
                }else {
                    System.out.print(arr1[i]);
                }
                i++;
            }
            System.out.println("}\n");
        }
        if(str=="for_steamy"){
            int arr1[]=new int[arr.length/2];
            int j=0;
            for(int i=0;i<arr.length;i++){
                if(i % 2 ==0 ){
                    arr1[j]=arr[i];
                    j++;
                }
            }
            System.out.print("arr4[]={");
            for(int i=0;i<arr1.length;i++){
                if(i<arr1.length-1){
                    System.out.print(arr1[i]+",");
                }else {
                    System.out.print(arr1[i]);
                }
            }
            System.out.println("}\n");
        }
        if(str=="reverse"){
            System.out.print("arr5[]={");
            for(int i=arr.length-1;i>=0;i--){
                if(i>0){
                    System.out.print(arr[i]+",");
                }else {
                    System.out.print(arr[i]);
                }
            }
            System.out.println("}");
        }
    }
}
