package com.person.person.Personnel.Entity;

import java.util.Date;

public class Personinformation {
    private int  personid;
    private String person_name;
    private String gender;
    private int Age;
    private Date Birthdate;
    private String Card;

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getWorkunit() {
        return Workunit;
    }

    public void setWorkunit(String workunit) {
        Workunit = workunit;
    }

    public Date getBailoutbegindate() {
        return Bailoutbegindate;
    }

    public void setBailoutbegindate(Date bailoutbegindate) {
        Bailoutbegindate = bailoutbegindate;
    }

    public Date getBailoutenddate() {
        return Bailoutenddate;
    }

    public void setBailoutenddate(Date bailoutenddate) {
        Bailoutenddate = bailoutenddate;
    }

    public String getSponsor() {
        return Sponsor;
    }

    public void setSponsor(String sponsor) {
        Sponsor = sponsor;
    }

    public String getSponsor_alarm() {
        return sponsor_alarm;
    }

    public void setSponsor_alarm(String sponsor_alarm) {
        this.sponsor_alarm = sponsor_alarm;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getWechat_number() {
        return wechat_number;
    }

    public void setWechat_number(String wechat_number) {
        this.wechat_number = wechat_number;
    }

    public String getQq_number() {
        return qq_number;
    }

    public void setQq_number(String qq_number) {
        this.qq_number = qq_number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private String Workunit;
    private Date Bailoutbegindate;
    private Date Bailoutenddate;
    private String Sponsor;
    private String sponsor_alarm;
    private String Contact;
    private String Address;
    private String wechat_number;
    private String qq_number;
    private boolean status;
}
