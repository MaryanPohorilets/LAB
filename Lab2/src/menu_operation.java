public class menu_operation {
    int n;
    int z;
    int y;
    double x;

    menu_operation(int a,int o,int p){
        this.n=a;
        this.z=o;
        this.y=p;
    }
    void solution(){
        switch (n) {
            case 1:
                System.out.printf("X=%.2f",x=z*y);
                break;
            case 2:
                System.out.printf("X=%.2f",x=z+y);
                break;
            case 3:
                System.out.printf("X=%.2f",x=z-y);
                break;
            default:
                System.out.println("Введіть число від 1 до 3");
        }
    }
}
