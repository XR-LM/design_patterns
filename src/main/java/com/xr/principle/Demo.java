package com.xr.principle;

import java.lang.reflect.Field;

public class Demo {


    public static void main(String[] args) throws IllegalAccessException {
        Class<Student> class1 = Student.class;
        Field[] declaredFields = class1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            int anInt = declaredField.getInt(class1);
        }
    }

}
