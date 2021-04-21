package com.reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //获取方法就是获取类的类信息，需要先获取类的类类型
        A a = new A();
        Class c = a.getClass();
        a.print();
        try {
            Method method = c.getMethod("print", int.class, int.class);
            method.invoke(a, 10, 11);     //方法的反射操作是用method对象来进行方法调用，和a.方法名（参数列表）效果相同
            Method method1 = c.getMethod("print", String.class, String.class);
            method1.invoke(a, "asd", "AsD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A {
    public void print() {
        System.out.println("啥也没有！");
    }

    public void print(int a, int b) {
        System.out.println("a+b:" + (a + b));
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + b.toLowerCase());
    }
}