package com.example.demovacjava.models;

import jakarta.persistence.*;

@Entity
public class OutputDb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 65000)
    private String result;
    public OutputDb(String result) {
        this.result = result;
    }
    public OutputDb() {}
    public void setId(long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getResult() {
        return result;
    }
}
