package com.study.patterns.singleton.test;

import com.study.patterns.singleton.EnumSingleton;

import java.io.*;

/**
 * 单例序列化测试
 *
 * Created by ASUS on 2019/7/29.
 */
public class SingletonSerializedTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton1 = null;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        enumSingleton2.setData(0);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("EnumSingleton.obj"));
        objectOutputStream.writeObject(enumSingleton2);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("EnumSingleton.obj"));
        enumSingleton1 = (EnumSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);
        System.out.println(enumSingleton1.getData() == enumSingleton2.getData());
        System.out.println(enumSingleton1 == enumSingleton2);
    }

}
