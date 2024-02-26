package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String aname;
    private String tech;
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
        public void show()
        {
            System.out.println("in show");
        }
}