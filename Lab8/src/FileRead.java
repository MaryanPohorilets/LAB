import java.io.*;
class FileRead{
    String filename;
    public FileRead() {
        this.filename = filename;
    }
    public void readFromFile() {
        String str=filename;
        filename=filename+".txt";
        File file = new File(filename);
        filename=str;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("Читання з файлу завершено.");
        } catch (IOException e) {
            System.out.println("Сталася помилка при читанні з файлу: " + e.getMessage());
        }
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
}

