import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Start {
    Driver driver1 = new Driver("John", 30, 5);
    Driver driver2 = new Driver("Anna", 25, 2);
    Driver driver3 = new Driver("Peter", 40, 10);
    Driver driver4 = new Driver("Mary", 28, 3);
    Driver driver5 = new Driver("Tom", 35, 8);
    Driver driver6 = new Driver("Kate", 33, 6);
    Driver driver7 = new Driver("Michael", 45, 15);
    Driver driver8 = new Driver("Emma", 27, 4);
    Driver driver9 = new Driver("David", 38, 9);
    Driver driver10 = new Driver("Sarah", 31, 7);
    Car car1 = new Car("Toyota", 100, driver1, 5000, 2010);
    Car car2 = new Car("Honda", 120, driver2, 6000, 2015);
    Car car3 = new Car("Ford", 80, driver3, 4000, 2008);
    Car car4 = new Car("Chevrolet", 150, driver4, 7000, 2018);
    Car car5 = new Car("Nissan", 110, driver5, 5500, 2012);
    Car car6 = new Car("Mazda", 90, driver6, 4500, 2013);
    Car car7 = new Car("Volkswagen", 130, driver7, 6500, 2016);
    Car car8 = new Car("BMW", 200, driver8, 10000, 2019);
    Car car9 = new Car("Mercedes", 180, driver9, 9000, 2017);
    Car car10 = new Car("Audi", 140, driver10, 8000, 2014);
    ArrayList<Car> carList = new ArrayList<>();
    Helper helper = new Helper(carList);
    Temp1 temp1=new Temp1(carList,helper);
    PhoneBook contact1 = new PhoneBook("Іванов", "111-111-111");
    PhoneBook contact2 = new PhoneBook("Петров", "222-222-222");
    PhoneBook contact3 = new PhoneBook("Сидоров", "333-333-333");
    PhoneBook contact4 = new PhoneBook("Коваленко", "444-444-444");
    PhoneBook contact5 = new PhoneBook("Шевченко", "555-555-555");
    PhoneBook contact6 = new PhoneBook("Бондаренко", "666-666-666");
    PhoneBook contact7 = new PhoneBook("Ковальчук", "777-777-777");
    PhoneBook contact8 = new PhoneBook("Мельник", "888-888-888");
    PhoneBook contact9 = new PhoneBook("Жуков", "999-999-999");
    PhoneBook contact10 = new PhoneBook("Соловей", "000-000-000");
    Map<String, PhoneBook> phoneBook = new HashMap<>();
    Temp2 temp2=new Temp2(phoneBook);
    public void solution(){

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        temp1.solution();
        System.out.println("\n-----------------------------------------------------------\n");

        phoneBook.put(contact1.getLastName(), contact1);
        phoneBook.put(contact2.getLastName(), contact2);
        phoneBook.put(contact3.getLastName(), contact3);
        phoneBook.put(contact4.getLastName(), contact4);
        phoneBook.put(contact5.getLastName(), contact5);
        phoneBook.put(contact6.getLastName(), contact6);
        phoneBook.put(contact7.getLastName(), contact7);
        phoneBook.put(contact8.getLastName(), contact8);
        phoneBook.put(contact9.getLastName(), contact9);
        phoneBook.put(contact10.getLastName(), contact10);
        temp2.solution();
        System.out.println("\n-----------------------------------------------------------\n");

    }
}