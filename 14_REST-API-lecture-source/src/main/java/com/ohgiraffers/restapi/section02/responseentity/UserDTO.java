package com.ohgiraffers.restapi.section02.responseentity;

import java.time.LocalDate;

public class UserDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;
    private LocalDate localDate;

    public UserDTO(int no, String id, String pwd, String name, LocalDate localDate) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.localDate = localDate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
