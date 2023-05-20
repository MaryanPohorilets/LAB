public class clock {
    int min;
    clock(int a){
        this.min=a;
    }
    void solution(){
        if(min>=0 && min<=14){
            System.out.println("Перша чверть");
        }
        if(min>=15 && min<=29){
            System.out.println("Друга чверть");
        }
        if(min>=30 && min<=44){
            System.out.println("Третя чверть");
        }
        if(min>=45 && min<=59){
            System.out.println("Четверта чверть");
        }
    }
}
