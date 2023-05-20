public class Start {
    public void Start() {
        Phrase phrase=new Phrase();
        phrase.showInfo();
        System.out.println("\n-----------------------------------------------------------\n");

        First_timer first_timer=new First_timer();
        first_timer.showInfo();
        System.out.println("\n-----------------------------------------------------------\n");

        Second_timer second_timer=new Second_timer();
        second_timer.showInfo();
        System.out.println("\n-----------------------------------------------------------\n");

        Third_timer third_timer=new Third_timer();
        third_timer.showInfo();
        System.out.println("\n-----------------------------------------------------------\n");

        Function function=new Function();
        function.input();
        function.showInfo();
        System.out.println("\n-----------------------------------------------------------\n");

    }
}
