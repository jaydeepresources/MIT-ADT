package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFiles {

    void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/administrator/Desktop/file.txt");
        int ch = 0;
        while ((ch = fileInputStream.read()) != -1)
            System.out.print((char) ch);
        fileInputStream.close();
    }

    void writeFile() throws IOException {
        String msg = "This is data.";
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/administrator/Desktop/op-file.txt");
        fileOutputStream.write(msg.getBytes());
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        ByteFiles byteFiles = new ByteFiles();
//        System.out.println("Reading data from the file using byte approach.");
//        byteFiles.readFile();
//        System.out.println("Writing data to the file using byte approach.");
//        byteFiles.writeFile();

    }

}
