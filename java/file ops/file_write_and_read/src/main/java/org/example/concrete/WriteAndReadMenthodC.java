package org.example.concrete;

import org.example.interfaces.IWriterAndReeader;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteAndReadMenthodC implements IWriterAndReeader {

    @Override
    public void write(String s, String filePath) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath)
        ){
            fileOutputStream.write(s.getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                ){
            byte[] bytesFromFile = fileInputStream.readAllBytes();
            System.out.println(new String(bytesFromFile));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
