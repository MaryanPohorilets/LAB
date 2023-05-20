public class schedule {
    int n;
    schedule(int a){
        this.n=a;
    }
    void solution(){
        switch (n) {
            case 1:
                System.out.println("Передавання сигналів");
                break;
            case 2:
                System.out.println("Програмно-апаратні засоби");
                break;
            case 3:
                System.out.println("ООП 1");
                break;
            case 4:
                System.out.println("ООП 2");
                break;
            default:
                System.out.println("Введіть число від 1 до 4");
        }
    }
}
