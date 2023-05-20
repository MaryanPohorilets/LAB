public class First_timer implements Info {
    void solution(){
        for (int hour = 0; hour <= 2; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                System.out.printf("%d h\t%d\tmin\n", hour, minute);
            }
        }
    }
    @Override
    public void showInfo(){
        solution();
    }
}
