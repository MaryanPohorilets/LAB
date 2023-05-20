public class Start {
    Fill_array fill_array= new Fill_array(50);
    Iterate_array iterate_array=new Iterate_array();
    Sum_array sum_array=new Sum_array();
    Opposite opposite=new Opposite();
    public void solution() {
        fill_array.solution("steamy");
        fill_array.solution("odd");
        System.out.println("\n-----------------------------------------------------------\n");

        iterate_array.solution("while");
        iterate_array.solution("for");
        iterate_array.solution("while_odd");
        iterate_array.solution("for_steamy");
        iterate_array.solution("reverse");
        System.out.println("\n-----------------------------------------------------------\n");

        sum_array.input();
        sum_array.solution();
        System.out.println("\n-----------------------------------------------------------\n");

        opposite.input();
        opposite.solution();
        System.out.println("\n-----------------------------------------------------------\n");
    }
}