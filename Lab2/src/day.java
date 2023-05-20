public class day {
    int n;
    day(int a){
        this.n=a;
    }
    void solution(){
        switch (n) {
            case 1:
                System.out.println("Понеділок робочий день.");
                break;
            case 2:
                System.out.println("Вівторок робочий день.");
                break;
            case 3:
                System.out.println("Середа робочий день.");
                break;
            case 4:
                System.out.println("Четвер робочий день.");
                break;
            case 5:
                System.out.println("П'ятниця робочий день.");
                break;
            case 6:
                System.out.println("Субота вихідний день.");
                break;
            case 7:
                System.out.println("Неділя вихідний день.");
                break;
            default:
                System.out.println("Введіть число від 1 до 7");
        }
    }
}
