import java.io.*;
import java.util.Random;
import java.util.Scanner;
class FileWrite implements Info{
    String filename;
    int rangeStart;
    int rangeEnd;
    int count;
    public FileWrite() {
        this.filename = filename;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.count = count;
    }
    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву файлу: ");
        filename = scanner.nextLine();
        System.out.println("Введіть початкову межу: ");
        rangeStart = scanner.nextInt();
        System.out.println("Введіть кінцеву межу: ");
        rangeEnd = scanner.nextInt();
        System.out.println("Введіть кількість чисел: ");
        count = scanner.nextInt();
    }
    void writeToFile() {
        String str=filename;
        filename=filename+".txt";
        File file = new File(filename);
        filename=str;
        boolean fileExists = file.exists();

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            if (!fileExists) {
                file.createNewFile();
            }

            for (int i = 0; i < count; i++) {
                int randomNumber = generateRandomNumber(rangeStart, rangeEnd);
                fileWriter.write(String.valueOf(randomNumber));
                fileWriter.write(System.lineSeparator());
            }
            System.out.println("Запис до файлу завершено.");
        } catch (IOException e) {
            System.out.println("Сталася помилка при записі до файлу: " + e.getMessage());
        }
    }

    private int generateRandomNumber(int b1, int b2) {
        Random random = new Random();
        return random.nextInt(b2 - b1 + 1) + b1;
    }
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}