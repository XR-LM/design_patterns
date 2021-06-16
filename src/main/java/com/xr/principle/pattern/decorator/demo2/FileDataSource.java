package com.xr.principle.pattern.decorator.demo2;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 文件读写
 *
 * @author 零
 */
public class FileDataSource implements DataSource {
    /**
     * 文件名
     */
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        File file = new File(filename);
        try (final FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(filename);
        try (FileReader fileReader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            final int read = fileReader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert buffer != null;
        return new String(buffer);
    }
}
