package org.example.concrete;

import org.example.interfaces.IWriterAndReeader;

import java.io.File;

public class WriteAndReadOnTemporary {

    public static String write(String stringToWrite) {
        try {
            File fileToWrite = File.createTempFile("myTemporaryFile", "suffix");
            System.out.println("File directory: " + fileToWrite.getAbsolutePath());
            IWriterAndReeader wr = new WriteAndReadMenthodA();
            wr.write(stringToWrite, fileToWrite.getAbsolutePath());
            wr.read(fileToWrite.getAbsolutePath());
            return fileToWrite.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        //return stringToWrite;
    }

}
