package com.example.example.domain;

import javax.persistence.*;

@Entity
public class Message {
    @ManyToOne(fetch = FetchType.EAGER)
    private  User user;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String text;
    private String tag;

    public Message() {
    }

    public Message(String text, String tag,User user) {
        this.user = user;
        this.text = text;
        this.tag = tag;
    }

    public String getUsername(){
        return user != null ? user.getUsername() : "<no one>";
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
