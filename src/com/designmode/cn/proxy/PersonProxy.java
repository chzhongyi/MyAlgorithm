package com.designmode.cn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PersonProxy {

    public static void main(String[] args){
        Persion persion = new Techer();

        Persion person = (Persion)Proxy.newProxyInstance(Persion.class.getClassLoader(),new Class[]{Persion.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("hhhhhh");
                System.out.println(proxy.getClass());
                System.out.println(args);
                method.invoke(persion,args);
                return null;
            }
        });
        person.joke();

    }


}
