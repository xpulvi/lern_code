package org.example;
import org.example.concrete.*;
import org.example.interfaces.IWriterAndReeader;

public class Main {
    public static void main(String[] args) {

        String stringToWrite = "Loren ipsun";
        String fileToWrite = "D:\\Videogiochi\\develhope.txt";

        /*IWriterAndReeader wr = new WriteAndReadMenthodE();
        wr.write(stringToWrite,fileToWrite);
        wr.read(fileToWrite); */

        WriteAndReadOnTemporary.write(stringToWrite); // "This is the file"
    }
}