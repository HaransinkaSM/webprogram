package com.example.d5.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Train")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int TrainId;
    String Name;
    String From;
    String To;
    public int getTrainId() {
        return TrainId;
    }
    public void setTrainId(int trainId) {
        TrainId = trainId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getFrom() {
        return From;
    }
    public void setFrom(String from) {
        From = from;
    }
    public String getTo() {
        return To;
    }
    public void setTo(String to) {
        To = to;
    }
    
    
}
