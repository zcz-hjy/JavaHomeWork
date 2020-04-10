package entity;

import annotation.Column;
import annotation.Table;

@Table( "user")
public class User {
    @Column("userId")
    private int id;
    @Column("username")
    private String userName;
    @Column("email")
    private String email;
    @Column("telephone")
    private String telephone;
    @Column("age")
    private int age;
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
