public class Phone {
    int weight;
    String number;
    String model;
    String name;
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }
    public Phone() {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }
    void output(){
        System.out.printf("number: %s model: %s weight: %d\n", number, model, weight);
    }
    void receiveCall(String name){
        System.out.printf("Дзвонить {%s}\n",name);
    }
    void receiveCall(String name,String number){
        System.out.printf("Дзвонить {%s}%s\n", name, number);
    }
    String getNumber(){
        return number;
    }
    void sendMessage(String... numbers) {
        System.out.println("Phone numbers: ");
        for (String number : numbers) {
            System.out.println(number);
        }
        System.out.print("\n");
    }
}
