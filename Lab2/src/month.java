public class month {
    int n;
    month(int a){
        this.n=a;
    }
    void solution(){
        if(n>0 && n<3 || n==12){
            System.out.println("Зима");
        }else if(n>2 && n<6){
            System.out.println("Весна");
            }else if(n>5 && n<9){
            System.out.println("Літо");
        }else if(n>8 && n<12){
            System.out.println("Весна");
        }
    }
}

