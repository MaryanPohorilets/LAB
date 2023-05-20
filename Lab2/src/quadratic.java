
public class quadratic {

    int a;
    int b;
    int c;
    double x1;
    double x2;
    double D;
    quadratic(int q,int w,int e){
        this.a=q;
        this.b=w;
        this.c=e;
    }
    void solution(){
        D=Math.pow(b,2)-4*a*c;
        x1=(-b+Math.sqrt(D))/(2*a);
        x2=(-b-Math.sqrt(D))/(2*a);
        System.out.printf("X1=%.2f\n",x1);
        System.out.printf("X2=%.2f\n",x2);
    }
}
