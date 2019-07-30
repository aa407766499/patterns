package com.study.patterns.prototype;

import java.util.Date;

/**
 * Created by Huzi on 2019/7/30.
 */
public class User implements Cloneable, Prototype {

    private int id;

    private String name;

    private Date birthday;

    public User() {
        this.id = 0;
        this.name = new String("USER");
        this.birthday = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Object deepClone() throws CloneNotSupportedException {
        User user = (User) this.clone();
        user.name = new String(this.getName());
        user.birthday = new Date();
        return user;
    }

}
