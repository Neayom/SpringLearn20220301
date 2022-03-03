package com.dlnu.springboot3.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lgx on 2022/3/2.
 */
@Component
@ConfigurationProperties(prefix = "user")
@Validated
@PropertySource("classpath:data/user.properties")
public class User {

    private String UserName;
    @NotNull
    private Integer Age;
    private List<String> habbies;
    private Date birthday;


    private Map<Integer,String> friends;
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public List<String> getHabbies() {
        return habbies;
    }

    public void setHabbies(List<String> habbies) {
        this.habbies = habbies;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Map<Integer, String> getFriends() {
        return friends;
    }

    public void setFriends(Map<Integer, String> friends) {
        this.friends = friends;
    }


    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", Age=" + Age +
                ", habbies=" + habbies +
                ", birthday=" + birthday +
                ", friends=" + friends +
                '}';
    }
}
