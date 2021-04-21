package com.reflect;

public class ClassDemo2 {
    public static void main(String[] args) {
        Class c1 = int.class;       //int数据类型的类类型
        Class c2 = Integer.class;   //Integer类的类类型
        Class c3 = String.class;    //String类的类类型
        Class c4 = double.class;    //double数据类型的类类型
        Class c5 = Double.class;    //Double类的类类型
        Class c6 = void.class;      //void关键字的类类型

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName()); //不包含包名的类名称
        System.out.println(c3.getName());
        System.out.println(c3.getSimpleName()); //不包含包名的类名称
        System.out.println(c4.getName());
        System.out.println(c5.getName());
        System.out.println(c5.getSimpleName()); //不包含包名的类名称
        System.out.println(c6.getName());
    }
}