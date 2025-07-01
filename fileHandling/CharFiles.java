package fileHandling;

import java.io.*;

public class CharFiles {
    void readFile() throws IOException {
        FileReader fileReader = new FileReader("/Users/administrator/Desktop/file.txt");
        int ch = 0;
        while ((ch = fileReader.read()) != -1)
            System.out.print((char) ch);
        fileReader.close();
    }

    void writeFile() throws IOException {
        String msg = "This is pure char data.";
        FileWriter fileWriter = new FileWriter("/Users/administrator/Desktop/op-file.txt");
        fileWriter.write(msg);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        CharFiles charFiles = new CharFiles();
//        System.out.println("Reading data from the file using byte approach.");
//        charFiles.readFile();
        System.out.println("Writing data to the file using byte approach.");
        charFiles.writeFile();
    }

}
