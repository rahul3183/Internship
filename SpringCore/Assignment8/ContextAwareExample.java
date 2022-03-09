package com.spring10;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAwareExample implements ApplicationContextAware, BeanNameAware {
    
    
    Data d;
    private String res;

    public String getData() {
        return res;
    }

    public void setData(String res) {
        this.res = res;
    }

    public Data getDemo() {
        return d;
    }

    public void setDemo(Data d) {
        this.d = d;
    }

    public void display(){
        System.out.println("Addition of two number " + d.getA() + " + " + d.getB() + " = " + d.getA()+d.getB());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application name "+applicationContext);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is:"+s);
    }
}