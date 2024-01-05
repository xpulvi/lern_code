package org.example.concrete;

import org.example.interfaces.IWriterAndReeader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteAndReadMenthodA implements IWriterAndReeader {
    @Override
    public void write(String s, String filePath) {
        try (
                FileWriter writer = new FileWriter(filePath,true);
                BufferedWriter bw = new BufferedWriter(writer);
        ){
            bw.newLine();
            bw.write(s);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void read(String filePath) {
        try (
                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);
        ){
            System.out.println("------------------");
            while (br.ready()){

               String line = br.readLine();
               System.out.println(line);
            }
            System.out.println("------------------");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
