public class function {
    int x;
    double f;
    function(int a){
        this.x=a;
    }
    void solution(){
        if(x<0){
            f=(Math.exp(x)+Math.exp(-x))/2;
            System.out.printf("f(x)=%.2f",f);
        }else{
            if(x>1){
                f=Math.sqrt(Math.abs(Math.cos(Math.pow((x-1),3))));
                System.out.printf("f(x)=%.2f",f);
            }else{
                f=Math.pow(Math.cos(x),2)+2*Math.sin(Math.pow((x+1),1/3));
                System.out.printf("f(x)=%.2f",f);
            }
        }
    }
}
