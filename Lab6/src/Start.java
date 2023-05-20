public class Start {
    Person person1=new Person();
    Person person2=new Person("Marco",20);
    Phone phone1=new Phone("232253537","Iphone",9);
    Phone phone2=new Phone("859250856","Samsung",8);
    Phone phone3=new Phone("796966885","Blackberry",6);
    Sedan sedan = new Sedan("Toyota Camry", "чорний", 200);
    Truck truck = new Truck("Volvo FH16", "синій", 140);
    BankAccount account=new BankAccount("Bob",5765758, 153.75);
    ExtendedBankAccount extendedaccount=new ExtendedBankAccount(account.getName(),account.getAccountNumber(),account.getBalance(),2,"Депозит");
    public void solution(){
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
        System.out.println("\n-----------------------------------------------------------\n");

        phone1.output();
        phone1.receiveCall("John");
        phone1.receiveCall("Marco","098700837");
        phone1.sendMessage("658762853","597867563");
        phone2.output();
        phone2.receiveCall("Jek");
        phone2.receiveCall("Oleg","358747659");
        phone2.sendMessage("6587658853","597859563","8678550687");
        phone3.output();
        phone3.receiveCall("Pol");
        phone3.receiveCall("Bob","1234532967");
        phone3.sendMessage("658762153","5978675753","8678259687","8605802769");
        System.out.println("\n-----------------------------------------------------------\n");

        sedan.gas();
        sedan.brake();
        truck.gas();
        truck.brake();
        System.out.println("\n-----------------------------------------------------------\n");

        account.display();
        account.deposit(50.15);
        account.display();
        account.withdraw(100.50);
        account.display();
        System.out.println("\n-----------------------------------------------------------\n");

        extendedaccount.display();
        System.out.println("\n-----------------------------------------------------------\n");

    }
}
