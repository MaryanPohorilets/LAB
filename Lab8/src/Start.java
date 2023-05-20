public class Start {
    FileWrite writer = new FileWrite();
    FileRead reader = new FileRead();

    public void solution(){
        writer.input();
        reader.setFilename(writer.getFilename());
        writer.writeToFile();
        System.out.println("\n-----------------------------------------------------------\n");
        reader.readFromFile();
        System.out.println("\n-----------------------------------------------------------\n");
    }
}