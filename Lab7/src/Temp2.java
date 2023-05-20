import java.util.Map;
public class Temp2 {
    private Map<String, PhoneBook> phoneBook;

    public Temp2(Map<String, PhoneBook> phoneBook) {
        this.phoneBook = phoneBook;
    }
    public void solution(){
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, PhoneBook> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            PhoneBook contact = entry.getValue();
            String phoneNumber = contact.getPhoneNumber();
            System.out.println(lastName + ": " + phoneNumber);
        }

        System.out.println("");

        String searchLastName = "Шевченко";
        PhoneBook contact = phoneBook.get(searchLastName);
        if (contact != null) {
            String phoneNumber = contact.getPhoneNumber();
            System.out.println("Номер для " + searchLastName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + searchLastName);
        }
        System.out.println("");

        String removeLastName = "Коваленко";
        phoneBook.remove(removeLastName);
        System.out.println("Запис для " + removeLastName + " видалено");

        System.out.println("");

        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);
    }
}
