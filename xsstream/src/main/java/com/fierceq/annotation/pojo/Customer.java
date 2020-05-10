package com.fierceq.annotation.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;
//@XStreamAlias 作用就是将属性按照别名输出
@XStreamAlias("customer")
public class Customer {

    @XStreamAlias("fn")
    private String firstName;

    private String lastName;

    private Date dob;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
    }
}
