package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {

    public void save(String textToSave, Object fileName){
        try {
            FileWriter write = new FileWriter(fileName + ".txt", false);
            PrintWriter print = new PrintWriter(write);
            print.printf(textToSave);
            print.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
