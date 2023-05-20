public class number {
    int n;
    number(int a){
        this.n=a;
    }
    void solution(){
        if(n>9 && n<100){
            if(n%2==0){
                System.out.println("Дане число є парним і двохзначним.");
            }else{
                System.out.println("Дане число є не парним , але двохзначним.");
            }
        }else{
            if(n%2==0){
                System.out.println("Дане число є парним ,але не двохзначним.");
            }else{
                System.out.println("Дане число є не парним і не двохзначним.");
            }
        }
    }
}
