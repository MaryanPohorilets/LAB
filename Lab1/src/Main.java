import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start init=new Start();
		init.Start();
	}
}
class Start{
	public void Start() {
		Math operation=new Math(1,2,3,4,5,6,7,8,9,10);
		operation.add();
		operation.sub();
		operation.mult();
		operation.div();
		System.out.printf("\n\n");

		Sentence statement=new Sentence("Костя"," допомагав"," своему"," братові"," зробити"," домашне"," завдання,"," тому"," ліг"," пізно.");
		statement.create();
		System.out.printf("\n\n");

		User User_Create=new User();
		User_Create.User();
		System.out.printf("\n\n");
		
		Car Car_Create=new Car();
		Car_Create.Car();
		System.out.printf("\n\n");
		
		Number num=new Number(638);
		num.create_number();
		System.out.printf("\n\n");
	}
}
class Math{
	double x1;
	double x2;
	double x3;
	double x4;
	double x5;
	double x6;
	double x7;
	double x8;
	double x9;
	double x10;
	Math(double a1,double a2,double a3,double a4,double a5,double a6,double a7,double a8,double a9,double a10){
		this.x1=a1;
		this.x2=a2;
		this.x3=a3;
		this.x4=a4;
		this.x5=a5;
		this.x6=a6;
		this.x7=a7;
		this.x8=a8;
		this.x9=a9;
		this.x10=a10;
	}
	public void add(){
		System.out.printf("sum=%f\n",x1+x2+x3+x4+x5+x6+x7+x8+x9+x10);
	}
	public void sub(){
		System.out.printf("riz=%f\n",x1-x2-x3-x4-x5-x6-x7-x8-x9-x10);
	}
	public void mult(){
		System.out.printf("dob=%f\n",x1*x2*x3*x4*x5*x6*x7*x8*x9*x10);
	}
	public void div(){
		System.out.printf("dil=%.10f\n",x1/x2/x3/x4/x5/x6/x7/x8/x9/x10);
	}
}
class Sentence{
	String y1;
	String y2;
	String y3;
	String y4;
	String y5;
	String y6;
	String y7;
	String y8;
	String y9;
	String y10;
	Sentence(String q1,String q2,String q3,String q4,String q5,String q6,String q7,String q8,String q9,String q10){
		this.y1=q1;
		this.y2=q2;
		this.y3=q3;
		this.y4=q4;
		this.y5=q5;
		this.y6=q6;
		this.y7=q7;
		this.y8=q8;
		this.y9=q9;
		this.y10=q10;
	}
	public void create(){
		System.out.println(y1+y2+y3+y4+y5+y6+y7+y8+y9+y10);
	}
}
class User{
	public void User() {
		int sum_age=0;
		double sum_weight=0;
		double sum_height=0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("User.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] User = line.split(" ");
				System.out.printf("Name: %s     \tSurname: %s  \tAge: %d \tWeight: %.1f  \tHeight: %.1f  \tId: %d\n", User[0], User[1], Integer.parseInt(User[2]),Double.parseDouble(User[3]), Double.parseDouble(User[4]), Integer.parseInt(User[5]));
				sum_age=sum_age+Integer.parseInt(User[2]);
				sum_weight=sum_weight+Double.parseDouble(User[3]);
				sum_height=sum_height+Double.parseDouble(User[4]);
				line = reader.readLine();
			}
			System.out.printf("Сума віку: %d\n",sum_age);
			System.out.printf("Сума ваги: %.1f\n",sum_weight);
			System.out.printf("Сума зросту: %.1f\n",sum_height);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Car{
	public void Car() {
		double sum_volume=0;
		double sum_power=0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Car.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] Car = line.split(" ");
				System.out.printf("Power: %.1f \tVolume: %.1f \tAcceleration_time: %.1f  \tName: %s       \tYear: %d     \tModel: %s        \tColor: %s\n", Double.parseDouble(Car[0]), Double.parseDouble(Car[1]), Double.parseDouble(Car[2]), Car[3], Integer.parseInt(Car[4]), Car[5], Car[6]);
				sum_volume=sum_volume+Double.parseDouble(Car[0]);
				sum_power=sum_power+Double.parseDouble(Car[1]);
				line = reader.readLine();
			}
			System.out.printf("Сума об'ємів: %.1f\n",sum_volume);
			System.out.printf("Сума потужностей: %.1f\n",sum_power);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Number{
	int number;
	Number(int a){
		this.number=a;
	}
	public void create_number(){
		int v1=number%10*100;
		int v2=number%100/10*10;
		int v3=number%1000/100;
		System.out.printf("Число: %d\n",v1+v2+v3);
	}
}