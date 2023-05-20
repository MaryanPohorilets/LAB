public class quadrant {
    int x;
    int y;
    quadrant(int a,int b){
        this.x=a;
        this.y=b;
    }
    void solution(){
        if (x>0 && y>0) {
            System.out.println("Точка знаходиться в квадранті 1.");
        }
        if (x<0 && y>0) {
            System.out.println("Точка знаходиться в квадранті 2.");
        }
        if (x<0 && y<0) {
            System.out.println("Точка знаходиться в квадранті 3.");
        }
        if (x>0 && y<0) {
            System.out.println("Точка знаходиться в квадранті 4.");
        }
    }
}
