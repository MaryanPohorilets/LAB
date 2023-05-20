public class Second_timer implements Info{
    int hour = 0;
    int minute = 0;
    void solution(){
        while (hour <= 2) {
            while (minute <= 59) {
                System.out.printf("%d h\t%d\tmin\n", hour, minute);
                minute++;
            }
            hour++;
            minute = 0;
        }
    }
    @Override
    public void showInfo(){
        solution();
    }
}
