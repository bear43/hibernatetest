package com.bear.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User
{
    @Id
    private String login;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
    private List<Property> propertyList;

    public User() {}

    public User(String login, String password)
    {
        this.login = login;
        this.password = password;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return String.format("Login: %s\nPassword: %s", login, password);
    }
}
