package org.example.concrete;

import org.example.interfaces.IWriterAndReeader;

import java.io.*;

public class WriteAndReadMenthodB implements IWriterAndReeader{

        @Override
        public void write(String s, String filePath) {
            try (
                    FileWriter writer = new FileWriter(filePath,false);
                    PrintWriter pw = new PrintWriter(writer);
            ){
                pw.printf("Io sono lorenzo e ho %d anni %s", 30,"ciao ciao");
               // pw.append("-------------");
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
