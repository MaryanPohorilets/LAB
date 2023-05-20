public class Start {
    Rectangle rectangle=new Rectangle();
    Min_number min_number=new Min_number();
    Output_array output_array=new Output_array();
    Copy copy=new Copy(output_array);
    Max_number max_number=new Max_number();

    public void solution(){
        rectangle.input();
        rectangle.showInfo();

        min_number.input();
        min_number.showInfo();

        output_array.input();
        output_array.showInfo();

        copy.solution();

        max_number.input();
        max_number.showInfo();

    }
}