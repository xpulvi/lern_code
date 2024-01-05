package org.example.concrete;

import org.example.interfaces.IWriterAndReeader;

import java.io.File;
import java.io.RandomAccessFile;

public class WriteAndReadMenthodE implements IWriterAndReeader {
    @Override
    public void write(String s, String filePath) {
        try (
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(filePath), "rw");
        ){
            randomAccessFile.writeBytes(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try (
                RandomAccessFile file = new RandomAccessFile(new File(filePath), "rw");
                ){
                    String line = file.readLine();
                    System.out.println(line);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
