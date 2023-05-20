
public class start {
    public void start() {
        quadratic operation=new quadratic(2,3,-5);
        operation.solution();
        System.out.printf("\n");

        quadrant cord=new quadrant(-2,-3);
        cord.solution();
        System.out.printf("\n");

        number num=new number(26);
        num.solution();
        System.out.printf("\n");

        function fun=new function(0);
        fun.solution();
        System.out.printf("\n\n");

        day d=new day(3);
        d.solution();
        System.out.printf("\n");

        month mon=new month(4);
        mon.solution();
        System.out.printf("\n");

        count_day c_d=new count_day(4);
        c_d.solution();
        System.out.printf("\n");

        menu_work m_w=new menu_work(1);
        m_w.solution();
        System.out.printf("\n");

        schedule sch=new schedule(2);
        sch.solution();
        System.out.printf("\n");

        clock cl=new clock(25);
        cl.solution();
        System.out.printf("\n");

        menu_operation m_op=new menu_operation(2,25,3);
        m_op.solution();
        System.out.printf("\n");
    }
}
