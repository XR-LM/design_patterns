package com.xr.principle.pattern.decorator;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            final FileInputStream inputStream = new FileInputStream("E:\\2.txt");
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] buffer = new byte[6];
            int bytesRead = bufferedInputStream.read(buffer);
            String chunk = new String(buffer, 0, bytesRead);
            System.out.print(chunk);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
