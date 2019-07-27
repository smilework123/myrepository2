package com.itcast;

import org.springframework.stereotype.Component;


public class Printer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private Ink ink;
    private Paper paper;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(){
        System.out.println("正在使用"+name+"的打印机"+ink.getColor()+"的墨盒在，"+paper.getSize()+"的纸张上打印");
    }
}
