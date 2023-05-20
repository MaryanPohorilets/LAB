public class count_day {
    int n;
    count_day(int a){
        this.n=a;
    }
    void solution(){
        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            System.out.println("31 день");
        }else if(n==4 || n==6 || n==9 || n==11){
            System.out.println("30 день");
        }else if(n==2){
            System.out.println("28 або 29 днів");
        }
    }
}
