package com.xr.principle.pattern.decorator.demo2;

import java.io.File;

/**
 * 测试类
 *
 * @author 零
 */
public class Test {
    public static void main(String[] args) {
        final FileDataSource fileDataSource = new FileDataSource("E:\\1.txt");
//        fileDataSource.writeData("哈哈哈哈，舔狗日记！");
//        final String s = fileDataSource.readData();

        final EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
//        encryptionDecorator.writeData("哈哈哈哈，舔狗日记！");
//        final String s = encryptionDecorator.readData();

        final CompressionDecorator compressionDecorator = new CompressionDecorator(fileDataSource);
//        compressionDecorator.writeData("哈哈哈哈，舔狗日记！");
//        final String s = compressionDecorator.readData();
//        System.out.println(s);

        String salaryRecords = "莫听穿林打叶声\n何妨吟啸且徐行\n竹杖芒鞋轻胜马\n谁怕?\n一蓑烟雨任平生";
        //压缩-》加密-》保存
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("E:\\1.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("E:\\1.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
