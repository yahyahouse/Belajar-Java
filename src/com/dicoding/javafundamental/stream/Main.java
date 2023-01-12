package com.dicoding.javafundamental.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dirname = "/stream/latihan";
        File file = new File(dirname);
        // Buat directory
        file.mkdirs();

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src/com/dicoding/javafundamental/stream/coba_input.txt");
            out = new FileWriter("coba_output.txt");
            int c;
            while ((c=in.read())!=-1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
