public class Third_timer implements Info{
    void solution(){
        for (int hour = 0; hour <= 2; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int second = 0; second <= 59; second++) {
                    System.out.printf("%d h %d\tmin %d\tsec\n", hour, minute, second);
                }
            }
        }
    }
    @Override
    public void showInfo(){
        solution();
    }
}