public class Phrase implements Info {
    int n=50;
    int i = 0;
    int count = 0;
    String phrase = "Marco";
    Phrase(){
        this.phrase=phrase;
    }
    void solution(){
        for (; i < n; i++) {
            System.out.printf("%d\t%s\n",i+1,phrase);
        }
        System.out.printf("\n");
        while (count < n) {
            System.out.printf("%d\t%s\n",count+1,phrase);
            count++;
        }
    }

    @Override
    public void showInfo(){
        solution();
    }
}