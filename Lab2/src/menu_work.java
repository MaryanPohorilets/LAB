public class menu_work {
    int n;
    menu_work(int a){
        this.n=a;
    }
    void solution(){
        switch (n) {
            case 1:
                System.out.println("Добрий день.");
                break;
            case 2:
                System.out.println("Працювати за комп'ютером?");
                break;
            case 3:
                System.out.println("Завершити роботу?");
                break;
            default:
                System.out.println("Введіть число від 1 до 3");
        }
    }
}
